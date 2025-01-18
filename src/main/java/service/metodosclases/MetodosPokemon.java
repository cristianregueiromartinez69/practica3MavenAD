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
        List<Pokemon> pokemons = new ArrayList<Pokemon>();

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
