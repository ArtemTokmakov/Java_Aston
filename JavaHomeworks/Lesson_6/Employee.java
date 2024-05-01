package Lesson_6;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Сергеев Сергей", "Разработчик", "ssergeyev@mailbox.com", "80015008824", 55000, 22);
        employees[2] = new Employee("Антонов Антон", "Менеджер", "antonovant@mailbox.com", "89001112233", 70000, 42);
        employees[3] = new Employee("Дзюба Артем", "Инженер", "dzyuba@mailbox.com", "89260000001", 80000, 37);
        employees[4] = new Employee("Леван Горозия", "Разработчик", "l_one@mailbox.com", "89001234567", 100000, 40);

        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}