package Lesson_7.pointOne;

public class Cat extends Animal {

    static int catCount = 0;
    private final int onePortion = 15;
    private final int runLimit = 200;
    private boolean isHungry = true;

    public Cat() {
        super();
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat(Dish dish) {
        int foodAmount = dish.getFoodAmount();
        if (foodAmount >= onePortion) {
            dish.setFoodAmount(foodAmount - onePortion);
            isHungry = false;
        } else {
            System.out.println("В миске недостаточно еды для кота.");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public static int getCatCount() {
        return catCount;
    }
}
