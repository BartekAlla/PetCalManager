package pl.gd.home.backend.dto.dog;


import lombok.Data;
import pl.gd.home.backend.enums.dog.DogSpecification;

@Data
public class AddNewDogDTO {
    private String name;
    private Long dogBreedId;
    private Double weight;
    private String photo;
    private DogSpecification specification;
}
