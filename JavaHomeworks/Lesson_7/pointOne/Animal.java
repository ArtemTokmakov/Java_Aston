package Lesson_7.pointOne;

public abstract class Animal {

    static int animalCount = 0;

    public Animal () {
        animalCount++;
    }

    public abstract void run(int distance);
    
    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}

