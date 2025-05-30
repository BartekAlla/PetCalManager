package pl.gd.home.backend.controller.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.gd.home.backend.dto.dog.AddNewDogDTO;
import pl.gd.home.backend.entity.dog.Dog;
import pl.gd.home.backend.entity.dog.DogBreed;
import pl.gd.home.backend.service.dog.DogService;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {
    @Autowired
    private DogService dogService;

    @PostMapping("/addNewDog")
    public ResponseEntity<Dog> addNewDog(@RequestBody AddNewDogDTO addNewDogDTO) {
        Dog newdog = dogService.addNewDog(addNewDogDTO);
        return ResponseEntity.ok(newdog);

    }
    @GetMapping("/getAllDogBree")
    public ResponseEntity<List<DogBreed>> getAllDogBreeds()  {
        List<DogBreed> dogBreeds = dogService.getAllDogBreeds();
        return ResponseEntity.ok(dogBreeds);
    }

}
