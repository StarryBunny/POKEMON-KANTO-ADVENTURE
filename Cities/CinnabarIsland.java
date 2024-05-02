package Cities;

import Pokemons.Magikarp;
import Pokemons.Ninetales;
import Pokemons.Poliwag;
import Pokemons.Tentacool;

public class CinnabarIsland extends City {

    public CinnabarIsland() {
        super("Cinnabar Island");
    }

    @Override
    public void initialize() {
        reachableCity.add(new PalletTown());
        reachableCity.add(new FuschiaCity());
        wildPokemon.add(new Magikarp());
        wildPokemon.add(new Poliwag());
        wildPokemon.add(new Tentacool());
        gymLeader = new GymLeader("Blaine", "Fire", new Ninetales(), "Volcano");
    }
}