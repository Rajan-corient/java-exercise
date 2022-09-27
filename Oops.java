class Student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printStudentInfo() {
        System.out.println(this.name +" "+ this.age);
    }
}

class Employee {
    int id;
    String name;
    Double salary;

    Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printEmpInfo() {
        System.out.println(this.name +" "+ this.salary);
    }
}

class Car {
    String color;
    String model;

    // non-parameterizd contructor
    Car() {

    }

    // copy contructor
    Car(Car c1) {
        this.color = c1.color;
        this.model = c1.model;
    }

    public void printCarInfo() {
        System.out.println("This is my " +this.color +" "+ this.model);
    }
}

public class Oops {
    public static void main(String[] args) {
        // Creating employee from defult non-parameterized contructor
        Student s1 = new Student();
        s1.name = "Rajan";
        s1.age = 27;

        s1.printStudentInfo();

        // Creating employee from parameterized contructor
        Employee e1 = new Employee(1, "Amit", 50000D);
        e1.printEmpInfo();        
        
        // Creating car1 from parameterized contructor
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Tata Altroz";
        car1.printCarInfo();
        
        // Creating car2 from copy contructor (using car1)
        Car car2 = new Car(car1);
        car2.printCarInfo();
    }
}
