package pl.gd.home.backend.service.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gd.home.backend.dto.dog.AddNewDogDTO;
import pl.gd.home.backend.entity.dog.Dog;
import pl.gd.home.backend.entity.dog.DogBreed;
import pl.gd.home.backend.repository.dog.DogBreedRepository;
import pl.gd.home.backend.repository.dog.DogRepository;

import java.util.List;

@Service
public class DogService {
    private final DogRepository dogRepository;
    private final DogBreedRepository dogBreedRepository;


    @Autowired
    public DogService(DogRepository dogRepository, DogBreedRepository dogBreedRepository) {
        this.dogRepository = dogRepository;
        this.dogBreedRepository = dogBreedRepository;
    }


    public Dog addNewDog(AddNewDogDTO addNewDogDTO) {
        DogBreed dogBreed = dogBreedRepository.findById(addNewDogDTO.getDogBreedId())
                .orElseThrow(() -> new RuntimeException("Dog breed not found"));
        Dog newDog = new Dog(null, addNewDogDTO.getName(), dogBreed, addNewDogDTO.getWeight(), addNewDogDTO.getPhoto(), addNewDogDTO.getSpecification(), calculateCalorieRequirement(addNewDogDTO));
        dogRepository.save(newDog);
        return newDog;
    }

    private Double calculateCalorieRequirement(AddNewDogDTO addNewDogDTO) {
        double methabolicWeight = Math.pow(addNewDogDTO.getWeight(), 0.75);
        double RER = 70 * methabolicWeight;
        return RER * addNewDogDTO.getSpecification().getCalorieMultiplier();
    }


    public List<DogBreed> getAllDogBreeds() {
        return dogBreedRepository.findAll();
    }
}

