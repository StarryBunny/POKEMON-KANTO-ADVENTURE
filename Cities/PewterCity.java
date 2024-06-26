package Cities;

import Pokemons.Aerodactyl;
import Pokemons.Kabuto;
import Pokemons.Omanyte;
import Pokemons.Steelix;

public class PewterCity extends City {

    public PewterCity() {
        super("Pewter City");
    }

    @Override
    public void initialize() {
        reachableCity.add(new ViridianCity());
        reachableCity.add(new CeruleanCity());
        wildPokemon.add(new Omanyte());
        wildPokemon.add(new Kabuto());
        wildPokemon.add(new Aerodactyl());
        gymLeader = new GymLeader("Brock", "Rock", new Steelix(), "Boulder");
    }
}