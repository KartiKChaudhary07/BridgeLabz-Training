// Base interface
interface MealPlan {
    String getType();
}

// Meal types
class VegetarianMeal implements MealPlan {
    public String getType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getType() { return "Keto"; }
}

class HighProteinMeal implements MealPlan {
    public String getType() { return "High Protein"; }
}

// Generic class with bounded type
class Meal<T extends MealPlan> {
    T meal;
    Meal(T meal) { this.meal = meal; }
}

// Generic method
class MealUtil {
    public static <T extends MealPlan> void generate(T meal) {
        System.out.println("Generated " + meal.getType() + " Meal Plan");
    }
}

// Main
public class MealPlanGenerator {
    public static void main(String[] args) {
        MealUtil.generate(new VegetarianMeal());
        MealUtil.generate(new KetoMeal());
    }
}
