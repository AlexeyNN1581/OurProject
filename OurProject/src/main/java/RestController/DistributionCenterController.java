package RestController;

import com.example.OurProject.entity.DistributionCenter;
import com.example.OurProject.entity.repository.DistributionCenterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistributionCenterController  {
    private DistributionCenterService centerService ;

    public DistributionCenterController (DistributionCenterService distributionCenterService) {
        this.centerService  = distributionCenterService;
    }

    @GetMapping
    public List<DistributionCenter> getall() {
       return centerService .getAll();


    }

    @GetMapping("/{id}")
    public DistributionCenter getCenterServiceById(
            @PathVariable("/{id}") Long id) {
      return   centerService .getById(id);

    }

}
