package Pokemons;

public class Bulbasaur extends Pokemon {


    public Bulbasaur() {
        super("Bulbasaur", 1, 45, 49, 100);
        this.type = "Grass";
        this.strength = new String[]{"Water", "Grass", "Electric"};
        this.weakness = new String[]{"Fire", "Psychic", "Ice"};
        this.move = new Move("Growl", "Tackle", 49);
    }

}