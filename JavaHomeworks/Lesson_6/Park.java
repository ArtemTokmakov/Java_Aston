package Lesson_6;

public class Park {
    private String parkName;
    private Attraction attraction;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public String getParkName() {
        return parkName;
    }

    public void addAttraction(String name, String time, int cost) {
        this.attraction = new Attraction(name, time, cost);
    }

    public void displayAttractionInfo() {
        System.out.println("Название парка: " + getParkName());
        System.out.println("Название аттракциона: " + attraction.getName());
        System.out.println("Время работы: " + attraction.getTime());
        System.out.println("Цена: " + attraction.getCost() + " руб.");
    }

    private class Attraction {
        private String name;
        private String time;
        private int cost;

        public Attraction(String name, String time, int cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public int getCost() {
            return cost;
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк-Культуры им. Горького");
        park.addAttraction("Колесо Обозрения", "10:00 - 20:00", 500);
        park.displayAttractionInfo();
    }
}