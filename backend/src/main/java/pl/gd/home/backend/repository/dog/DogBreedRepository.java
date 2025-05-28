package pl.gd.home.backend.repository.dog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gd.home.backend.entity.dog.DogBreed;

@Repository
public interface DogBreedRepository extends JpaRepository<DogBreed, Long> {
    double getDogBreedById(Long id);
}
