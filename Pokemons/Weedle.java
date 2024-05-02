package Pokemons;

public class Weedle extends Pokemon {
    public Weedle() {
        super("Weedle", 1, 40, 35, 100);
        this.type = "Bug";
        this.strength = new String[]{"Grass", "Fighting", "Poison"};
        this.weakness = new String[]{"Fire", "Rock", "Psychic"};
        this.move = new Move("Poison Sting", "String Shot", 35);
    }
}