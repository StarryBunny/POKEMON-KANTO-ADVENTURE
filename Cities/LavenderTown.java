package Cities;

import Pokemons.Cubone;
import Pokemons.Gastly;
import Pokemons.Haunter;

public class LavenderTown extends City {

    public LavenderTown() {
        super("LavenderTown");
    }

    @Override
    public void initialize() {
        reachableCity.add(new CeruleanCity());
        reachableCity.add(new SaffronCity());
        reachableCity.add(new VermillionCity());
        reachableCity.add(new FuschiaCity());
        wildPokemon.add(new Gastly());
        wildPokemon.add(new Haunter());
        wildPokemon.add(new Cubone());
        //this town doesn't have a Gym
    }
}