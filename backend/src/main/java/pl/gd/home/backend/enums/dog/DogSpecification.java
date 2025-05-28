package pl.gd.home.backend.enums.dog;

import lombok.Getter;

@Getter
public enum DogSpecification {
    CASTRATION_STRERILIZATION("Castration/Strerilization", 1.6),
    NO_CASTRATION_STRERILIZATION("No Castration/Strerilization", 1.8),
    OBESE_LOW_ACTIVITY("Obese/Low Activity", 1.4),
    WEIGHT_LOSING("Weight Losing", 1.0),
    EASY_WORKING_DOG("Easy Working Dog", 2),
    MEDIUM_WORKING_DOG("Medium Working Dog", 3),
    HARD_WORKING_DOG("Hard Working Dog", 4),
    PUPPY_50_TARGET_WEIGHT("Puppy 50% Target Weight", 3),
    PUPPY_80_TARGET_WEIGHT("Puppy 50-80% Target Weight", 2.5),
    PUPPY_100_TARGET_WEIGHT("Puppy 80-100% Target Weight", 2);

    private final String dogSpecification;
    private final double calorieMultiplier;

    DogSpecification(String dogSpecification, double calorieMultiplier) {
        this.dogSpecification = dogSpecification;
        this.calorieMultiplier = calorieMultiplier;
    }

}
