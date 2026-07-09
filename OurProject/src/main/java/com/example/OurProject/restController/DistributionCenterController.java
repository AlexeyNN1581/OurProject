package com.example.OurProject.restController;

import com.example.OurProject.entity.DistributionCenter;
import com.example.OurProject.service.DistributionCenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/distribution-centers")
public class DistributionCenterController {
    private final DistributionCenterService centerService;

    public DistributionCenterController(DistributionCenterService distributionCenterService) {
        this.centerService = distributionCenterService;
    }

    @GetMapping("")
    public List<DistributionCenter> getall() {
        return centerService.getAll();


    }

    @GetMapping("/{id}")
    public DistributionCenter getCenterServiceById(
            @PathVariable Long id) {
        return centerService.getById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteCentrById(
            @PathVariable Long id){

      centerService.delete(id);

    }

    @PostMapping
    public DistributionCenter createCenter(@RequestBody DistributionCenter center) {
        return centerService.create(center);
    }
    @PutMapping("/{id}")
    public DistributionCenter putCentr(@PathVariable Long id,@RequestBody DistributionCenter center){
        return  centerService.update(id,center);


}
}
