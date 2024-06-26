package Pokemons;

public class Voltorb extends Pokemon {
    
    public Voltorb() {
        super("Voltorb", 1, 40, 30, 100);
        this.type = "Electric";
        this.strength = new String[]{"Electric", "Flying", "Steel"};
        this.weakness = new String[]{"Ground"};
        this.move = new Move("Charge", "Tackle", 30);
    }
}