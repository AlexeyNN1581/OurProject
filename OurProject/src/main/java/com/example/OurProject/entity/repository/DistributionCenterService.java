package com.example.OurProject.entity.repository;

import com.example.OurProject.entity.DistributionCenter;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DistributionCenterService {
    private final BaseConnectionRepository baseConnectionRepository;

    public DistributionCenterService(BaseConnectionRepository repository) {
        this.baseConnectionRepository = repository;
    }

    public DistributionCenter create(DistributionCenter distributionCenter) {
        return baseConnectionRepository.save(distributionCenter);
    }

    public List<DistributionCenter> getAll() {
        return baseConnectionRepository.findAll();
    }

    public DistributionCenter getById(Long id) {

        return baseConnectionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Сущность с ID " + id + " не найдена"));
    }
@NotNull
    public DistributionCenter update(Long id, DistributionCenter distributionCenter) {
        DistributionCenter existingCenter = getById(id);
        existingCenter.setName(distributionCenter.getName());
       existingCenter.setCreatedDate(LocalDateTime.now());
        existingCenter.setCity(distributionCenter.getCity());
        existingCenter.setAdress(distributionCenter.getAdress());
        existingCenter.setActive(distributionCenter.getActive());

        return baseConnectionRepository.save(existingCenter);
    }
    public void delete(Long id){
        baseConnectionRepository.deleteById(id);
    }

}
