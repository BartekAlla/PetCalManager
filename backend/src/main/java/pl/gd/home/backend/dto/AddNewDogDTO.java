package pl.gd.home.backend.dto;


import lombok.Data;
import pl.gd.home.backend.enums.DogSpecification;

@Data
public class AddNewDogDTO {
    private String name;
    private Long dogBreedId;
    private Double weight;
    private String photo;
    private DogSpecification specification;
}
