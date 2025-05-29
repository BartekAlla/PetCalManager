package pl.gd.home.backend.controller.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gd.home.backend.service.food.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;
    @GetMapping("/getTodayFood/{dogId}")
    public  ResponseEntity<Double> getCaloriesConsumedToday(@PathVariable Long dogId) {
        double calories = foodEntryService.getCaloriesConsumedToday(dogId);
        return ResponseEntity.ok(calories);
    }


}
