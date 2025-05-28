package pl.gd.home.backend.repository.dog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gd.home.backend.entity.dog.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
}
