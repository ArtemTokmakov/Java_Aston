package Lesson_7.pointOne;

public class Main {

    public static void main(String[] args) {
        
        Dog dogBobik = new Dog();
        Cat catBarsik = new Cat();
        Cat catFilimon = new Cat();

        
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        
        dogBobik.run(450);
        dogBobik.swim(15); 
        catBarsik.run(250); 
        catFilimon.swim(10); 

        
        Dish dish = new Dish(20);

        
        catBarsik.eat(dish);
        catFilimon.eat(dish);

        
        System.out.println("Кот Барсик голоден: " + catBarsik.isHungry()); 
        System.out.println("Кот Филимон голоден: " + catFilimon.isHungry()); 

        
        dish.addFood(10);
    }
    
}
