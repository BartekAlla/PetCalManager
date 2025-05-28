package pl.gd.home.backend.entity.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.gd.home.backend.entity.dog.Dog;
import pl.gd.home.backend.enums.food.FoodType;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food_entry")
public class FoodEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double calories;
    private LocalDateTime timeGiven;
    @Enumerated(EnumType.STRING)
    private FoodType type;
    @ManyToOne
    private Dog dog;
}
