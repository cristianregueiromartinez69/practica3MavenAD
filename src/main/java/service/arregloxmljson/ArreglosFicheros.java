package service.arregloxmljson;

import model.entity.Adestrador;
import model.entity.Pokedex;
import model.entity.Pokemon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArreglosFicheros {

    public List<Adestrador> insertarAdestradoresDesdeXml(List<Adestrador> adestradores) {
        List<Adestrador> adestradors = new ArrayList<Adestrador>();

        for(Adestrador ad : adestradores) {
            adestradors.add(new Adestrador(ad.getNacemento(), ad.getNome()));
        }
        return adestradors;
    }

    public List<Pokemon> insertarPokemonesDesdeXml(List<Adestrador> adestradorList, List<Adestrador> adestradorList2, List<Pokedex> pokedexList) {
        List<Pokemon> pokemonList = new ArrayList<>();
        List<Adestrador> adestradors = new ArrayList<>();

        for(Adestrador ad : adestradorList) {
            Set<Pokemon> auxPokemonList = ad.getPokemons();
            for(Pokemon auxPokemon : auxPokemonList) {
                pokemonList.add(new Pokemon(auxPokemon.getNome(), auxPokemon.getNacemento()));
            }
        }

        for(Adestrador ad : adestradorList2) {
            adestradors.add(new Adestrador(ad.getNacemento(), ad.getNome()));
        }
        return rellenarCampos(pokemonList, adestradors, pokedexList);
    }

    public List<Pokemon> rellenarCampos(List<Pokemon> pokemonList, List<Adestrador> adestradorList, List<Pokedex> pokedexList) {

        List<Pokemon> pokemons = new ArrayList<>();

        Pokemon pokemon1 = new Pokemon(pokemonList.get(0).getNome(), pokemonList.get(0).getNacemento(), pokedexList.get(0), adestradorList.get(0));
        Pokemon pokemon2 = new Pokemon(pokemonList.get(1).getNome(), pokemonList.get(1).getNacemento(), pokedexList.get(1), adestradorList.get(0));
        Pokemon pokemon3 = new Pokemon(pokemonList.get(2).getNome(), pokemonList.get(2).getNacemento(), pokedexList.get(2), adestradorList.get(0));
        Pokemon pokemon4 = new Pokemon(pokemonList.get(3).getNome(), pokemonList.get(3).getNacemento(), pokedexList.get(3), adestradorList.get(0));
        Pokemon pokemon5 = new Pokemon(pokemonList.get(4).getNome(), pokemonList.get(4).getNacemento(), pokedexList.get(4), adestradorList.get(0));
        Pokemon pokemon6 = new Pokemon(pokemonList.get(5).getNome(), pokemonList.get(5).getNacemento(), pokedexList.get(5), adestradorList.get(0));
        Pokemon pokemon7 = new Pokemon(pokemonList.get(6).getNome(), pokemonList.get(6).getNacemento(), pokedexList.get(6), adestradorList.get(1));
        Pokemon pokemon8 = new Pokemon(pokemonList.get(7).getNome(), pokemonList.get(7).getNacemento(), pokedexList.get(7), adestradorList.get(1));
        Pokemon pokemon9 = new Pokemon(pokemonList.get(8).getNome(), pokemonList.get(8).getNacemento(), pokedexList.get(8), adestradorList.get(1));
        Pokemon pokemon10 = new Pokemon(pokemonList.get(9).getNome(), pokemonList.get(9).getNacemento(), pokedexList.get(9), adestradorList.get(1));
        Pokemon pokemon11 = new Pokemon(pokemonList.get(10).getNome(), pokemonList.get(10).getNacemento(), null, adestradorList.get(1));
        Pokemon pokemon12 = new Pokemon(pokemonList.get(11).getNome(), pokemonList.get(11).getNacemento(), null, adestradorList.get(1));

        pokemons.add(pokemon1);
        pokemons.add(pokemon2);
        pokemons.add(pokemon3);
        pokemons.add(pokemon4);
        pokemons.add(pokemon5);
        pokemons.add(pokemon6);
        pokemons.add(pokemon7);
        pokemons.add(pokemon8);
        pokemons.add(pokemon9);
        pokemons.add(pokemon10);
        pokemons.add(pokemon11);
        pokemons.add(pokemon12);

        return pokemons;
    }

}
