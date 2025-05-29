package pl.gd.home.backend.repository.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gd.home.backend.entity.food.FoodEntry;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntry, Long> {

}
