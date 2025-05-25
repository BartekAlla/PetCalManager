package pl.gd.home.backend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dog_breed")
public class DogBreed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
}
