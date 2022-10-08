class Abstract_Classes {
    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        
        monopoly.play();
        chess.play();
        battleships.play();
    }
 }
 
 abstract class Game {
    public String name;
    abstract String getName();
    abstract void play();
 }
 
 class Monopoly extends Game {
    String getName() {
        return name;
    }
    void play() {
       System.out.println("Buy all property.");
    }
 }
 
 class Chess extends Game {
    String getName() {
        return name;
    }
    void play() {
              System.out.println("Kill the enemy king.");
    }
 }
 
 class Battleships extends Game {
    String getName() {
        return name;
    }
    void play() {
              System.out.println("Sink all ships.");
    }
 }