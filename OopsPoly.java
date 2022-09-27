

class Pen {
    String name;
    int price;

    // method overloading (compile time polymorphism)
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int price) {
        System.out.println(price);
    }    
    
    public void printInfo(String name, int price) {
        System.out.println(name +" "+ price);
    }
}


public class OopsPoly {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.name = "Lexi";
        p1.price = 10;

        p1.printInfo(p1.name);
        p1.printInfo(p1.price);
        p1.printInfo(p1.name, p1.price);
    }
}
