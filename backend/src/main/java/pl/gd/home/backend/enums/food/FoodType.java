package pl.gd.home.backend.enums.food;

import lombok.Getter;
@Getter
public enum FoodType {
    MEAL("Meal"),
    SNACK("Snack");
    private final String mealType;

    FoodType(String mealType) {
        this.mealType = mealType;
    }
}

