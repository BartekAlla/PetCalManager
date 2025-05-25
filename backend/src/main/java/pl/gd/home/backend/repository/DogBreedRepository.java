package pl.gd.home.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gd.home.backend.entity.DogBreed;

@Repository
public interface DogBreedRepository extends JpaRepository<DogBreed, Long> {
    double getDogBreedById(Long id);
}
