package Cities;

import Pokemons.Arbok;
import Pokemons.Goldeen;
import Pokemons.Magikarp;
import Pokemons.Poliwag;

public class FuschiaCity extends City {

    public FuschiaCity() {
        super("Fuschia City");
    }

    @Override
    public void initialize() {
        reachableCity.add(new CeladonCity());
        reachableCity.add(new VermillionCity());
        reachableCity.add(new LavenderTown());
        wildPokemon.add(new Poliwag());
        wildPokemon.add(new Magikarp());
        wildPokemon.add(new Goldeen());
        gymLeader = new GymLeader("Koga", "Poison", new Arbok(), "Soul");
    }
}