package Lesson_7.pointOne;

public class Dog extends Animal {

    static int dogCount = 0;
    private final int runLimit = 500;
    private final int swimLimit = 10;

    public Dog() {
        super();
        dogCount++;
    }
    
    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
