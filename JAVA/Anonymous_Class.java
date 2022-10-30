;
class Machine {
    public void start() {
        System.out.println("Starting...");
    }

    public void Winging() {
        System.out.println("Wing-Wing-Wing...");
    }
}

class Program {
    public static void main(String[] args) {
        Machine m1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Wooooo");
            }
        };
        Machine m2 = new Machine() {
            @Override
            public void Winging() {
                System.out.println("Wang-Wang-Wang");
            }
        };
        m1.start();
        m2.start();
        m1.Winging();
        m2.Winging();
    }
}