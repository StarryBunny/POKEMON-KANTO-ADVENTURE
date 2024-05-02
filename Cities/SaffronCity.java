package Cities;

import Pokemons.Hitmonchan;
import Pokemons.Hitmonlee;
import Pokemons.Kadabra;
import Pokemons.Porygon;

public class SaffronCity extends City {

    public SaffronCity() {
        super("SaffronCity");
    }

    @Override
    public void initialize() {
        reachableCity.add(new CeruleanCity());
        reachableCity.add(new LavenderTown());
        reachableCity.add(new VermillionCity());
        reachableCity.add(new CeladonCity());
        wildPokemon.add(new Hitmonlee());
        wildPokemon.add(new Hitmonchan());
        wildPokemon.add(new Porygon());
        gymLeader = new GymLeader("Sabrina", "Psychic", new Kadabra(), "Marsh");
    }
}