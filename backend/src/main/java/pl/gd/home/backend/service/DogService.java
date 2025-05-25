package pl.gd.home.backend.service;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gd.home.backend.dto.AddNewDogDTO;
import pl.gd.home.backend.entity.Dog;
import pl.gd.home.backend.entity.DogBreed;
import pl.gd.home.backend.repository.DogBreedRepository;
import pl.gd.home.backend.repository.DogRepository;

import java.util.List;
import java.util.Optional;

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
        Dog newDog = new Dog(0L, addNewDogDTO.getName(), dogBreed, addNewDogDTO.getWeight(), addNewDogDTO.getPhoto(), addNewDogDTO.getSpecification(), calculateCalorieRequirement(addNewDogDTO));
        dogRepository.save(newDog);
        return newDog;
    }

    private Double calculateCalorieRequirement(AddNewDogDTO addNewDogDTO) {
        double methabolicWeight = Math.pow(addNewDogDTO.getWeight(), 0.75);
        double RER = 70 * methabolicWeight;
        return RER * dogBreedRepository.getDogBreedById(addNewDogDTO.getDogBreedId());
    }


    public List<DogBreed> getAllDogBreeds() {
        return dogBreedRepository.findAll();
    }
}

