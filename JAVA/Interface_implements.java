
// Make Animal interface

interface Animal {
    public void eat();

    public void makesound();
}

// Make a Cat class implements Animal
class Cat implements Animal {
    public void makesound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("omnomnom");
    }
}

// then call new Cat's eat and makesound method

public class Interface_implements {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makesound();
    }
}
