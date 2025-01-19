package service.metodosclases;

import model.entity.Adestrador;
import model.entity.Pokedex;
import model.entity.Pokemon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar los métodos relacionados con la creación y manejo de una lista de Pokémon.
 * Contiene métodos para obtener una lista de Pokémon a partir de los datos de la Pokedex y los adiestradores,
 * así como para imprimir los datos de los Pokémon.
 * @author cristian
 * @version 1.0
 */
public class MetodosPokemon {

    /**
     * Metodo que crea una lista de objetos Pokémon, asignándoles una Pokedex y un Adestrador.
     * Los Pokémon son creados utilizando la información de las listas proporcionadas de Pokedex y Adestrador.
     *
     * @param pokedexList Lista de objetos Pokedex que contiene los Pokémon.
     * @param adestradorList Lista de objetos Adestrador que contiene los adiestradores.
     * @return Lista de objetos Pokémon con la información de los Pokémon, Pokedex y Adestrador.
     */
    public List<Pokemon> getPokemonList(List<Pokedex> pokedexList, List<Adestrador> adestradorList){
        List<Pokemon> pokemons = new ArrayList<>();

        Pokemon pokemon1 = new Pokemon("pikachu", LocalDate.of(1990, 1, 20), pokedexList.get(0), adestradorList.get(0));
        Pokemon pokemon2 = new Pokemon("gengar", LocalDate.of(2000, 2, 12), pokedexList.get(1), adestradorList.get(0));
        Pokemon pokemon3 = new Pokemon("Feraligatr", LocalDate.of(2002, 3, 7), pokedexList.get(2), adestradorList.get(0));
        Pokemon pokemon4 = new Pokemon("tinkaton", LocalDate.of(2022, 8, 11), pokedexList.get(3), adestradorList.get(0));
        Pokemon pokemon5 = new Pokemon("steelix", LocalDate.of(2001, 7, 29), pokedexList.get(4), adestradorList.get(0));
        Pokemon pokemon6 = new Pokemon("houndoom", LocalDate.of(2003, 10, 1), pokedexList.get(5), adestradorList.get(0));
        Pokemon pokemon7 = new Pokemon("sneasler", LocalDate.of(2010, 4, 18), pokedexList.get(6), adestradorList.get(1));
        Pokemon pokemon8 = new Pokemon("aerodactyl", LocalDate.of(2017, 5, 26), pokedexList.get(7), adestradorList.get(1));
        Pokemon pokemon9 = new Pokemon("charizard", LocalDate.of(2008, 9, 9), pokedexList.get(8), adestradorList.get(1));
        Pokemon pokemon10 = new Pokemon("goldengho", LocalDate.of(2022, 12, 25), pokedexList.get(9), adestradorList.get(1));
        Pokemon pokemon11 = new Pokemon("dragonite", LocalDate.of(1998, 6, 8), null, adestradorList.get(1));
        Pokemon pokemon12 = new Pokemon("gyarados", LocalDate.of(2005, 7, 7), null, adestradorList.get(1));

        return getPokemons(pokemons, pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6, pokemon7, pokemon8, pokemon9, pokemon10, pokemon11, pokemon12);

    }

    /**
     * Metodo para añadir pokemons a una lista de objectos Pokemon
     * @param pokemons la lista de pokemons
     * @param pokemon1 el primer pokemon
     * @param pokemon2 el segundo pokemon
     * @param pokemon3 el tercer pokemon
     * @param pokemon4 el cuarto pokemon
     * @param pokemon5 el quinto pokemon
     * @param pokemon6 el sexto pokemon
     * @param pokemon7 el septimo pokemon
     * @param pokemon8 el octavo pokemon
     * @param pokemon9 el noveno pokemon
     * @param pokemon10 el decimo pokemon
     * @param pokemon11 el undécimo pokemon
     * @param pokemon12 el duocécimo pokemon
     * @return la lista de pokemons con los pokemons añadida
     */
    private List<Pokemon> getPokemons(List<Pokemon> pokemons, Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5, Pokemon pokemon6, Pokemon pokemon7, Pokemon pokemon8, Pokemon pokemon9, Pokemon pokemon10, Pokemon pokemon11, Pokemon pokemon12) {
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

    /**
     * Metodo para hacer el objeto de pokemons con los datos provenientes del xml o Json
     * @param pokemonList la lista de pokemons del xml o json
     * @param pokedexList la lista de pokedex del xml o json
     * @param adestradorList la lista de adestradores del xml o json
     * @return
     */
    public List<Pokemon> getPokemonListFromXmlJson(List<Pokemon> pokemonList,List<Pokedex> pokedexList, List<Adestrador> adestradorList){
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

        return getPokemons(pokemons, pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6, pokemon7, pokemon8, pokemon9, pokemon10, pokemon11, pokemon12);

    }

    /**
     * Metodo para imprimir los datos de los Pokémon contenidos en la lista proporcionada.
     *
     * @param pokemonList Lista de objetos Pokémon que se desea imprimir.
     */
    public void leerDatosPokemons(List<Pokemon> pokemonList){
        for(Pokemon pokemon : pokemonList){
            System.out.println(pokemon);
        }
    }
}
