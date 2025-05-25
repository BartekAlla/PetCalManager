package pl.gd.home.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.gd.home.backend.enums.DogSpecification;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "dog_breed_id", nullable = false)
    private DogBreed dogBreed;
    private double weight;
    @Column(columnDefinition="TEXT")
    private String photo;
    @Enumerated(EnumType.STRING)
    @Column(name = "dog_specification")
    private DogSpecification specification;
    private Double calorieRequirement;

}
