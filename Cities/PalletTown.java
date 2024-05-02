package Cities;

import Pokemons.Bulbasaur;
import Pokemons.Charmander;
import Pokemons.Squirtle;

/*
 * This is the town that every player's journey start
 * This town dont have a gym leader
 */

public class PalletTown extends City {

    public PalletTown() {
        super("Pallet Town");
    }
    
     @Override
    public void initialize() {
        reachableCity.add(new ViridianCity());
        wildPokemon.add(new Bulbasaur());
        wildPokemon.add(new Charmander());
        wildPokemon.add(new Squirtle());
        //no gym leader
    }
}