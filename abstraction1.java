 class abstractions {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
        c.walk();

        Cow l = new Cow();
        l.eat();
        l.walk();
    }
}

abstract class Animal1 {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Cow extends Animal1 {
    void walk() {
        System.out.println(" walks on 4 legs");
    }


}