package pl.gd.home.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gd.home.backend.entity.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
}
