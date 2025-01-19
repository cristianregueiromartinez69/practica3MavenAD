package controller;

import model.entity.Adestrador;
import model.entity.Pokemon;
import model.wrapper.Adestradores;
import model.wrapper.Pokemons;
import service.crud.Crud;
import service.ficherosxmljson.WriteReadFilesXmlJson;
import service.metodosclases.MetodosAdestrador;
import service.metodosclases.MetodosPokedex;
import service.metodosclases.MetodosPokemon;

import java.util.List;

/**
 * Clase controller con la lógica de la aplicación
 * @author cristian
 * @version 1.0
 */
public class Controller {
    /**
     * Lógica principal del programa que gestiona la inserción y lectura de datos,
     * así como la interacción con los archivos de configuración en formato XML y JSON.
     * Este metodo ejecuta la secuencia de operaciones que incluye la inserción de datos en la base de datos,
     * la lectura de la información almacenada, la escritura de archivos XML y JSON, y la eliminación de datos
     * de la base de datos después de realizar estas operaciones.
     */
    public void logicaPrograma() {
        MetodosPokedex metodosPokedex = new MetodosPokedex();
        MetodosAdestrador metodosAdestrador = new MetodosAdestrador();
        MetodosPokemon metodosPokemon = new MetodosPokemon();
        WriteReadFilesXmlJson wrdXmlJson = new WriteReadFilesXmlJson();
        Crud crud = new Crud();

        // Inserta datos iniciales en las bases de datos



        crud.insertar10PokemonsInPokedex(metodosPokedex.getPokemonsList());
        crud.insertar2AdestradoresInAdestrador(metodosAdestrador.getAdestradoresList());
        crud.insertar12PokemonsInPokemonDB(metodosPokemon.getPokemonList(crud.getPokedexFromDB(), crud.getAdestradorFromDB()));




        // Lee y escribe datos en archivos
        metodosPokemon.leerDatosPokemons(crud.getPokemonFromDB());
        metodosAdestrador.leerAdestradorList(crud.getAdestradorFromDB());
        wrdXmlJson.writeXmlFilePokemons(crud.getPokemonFromDB());


        wrdXmlJson.writeXmlFileAdestradores(crud.getAdestradorFromDB());


        wrdXmlJson.writeJsonFilePokemon(crud.getPokemonFromDB());
        wrdXmlJson.writeJsonFileAdestradores(crud.getAdestradorFromDB());






        // Elimina datos de la base de datos
        crud.deleteDataFromDb("DELETE FROM Pokemon");
        crud.deleteDataFromDb("DELETE FROM Adestrador");

        // Lee los datos desde archivos XML y JSON


        Pokemons pokemonsJson = wrdXmlJson.readJsonFilePokemon();
        List<Pokemon> pokemonJsonList = wrdXmlJson.readListPokemonsJson(pokemonsJson);


        Adestradores adestradoresJson = wrdXmlJson.readJsonFileAdestrador();
        List<Adestrador> adestradorJsonList =  wrdXmlJson.readListAdestradoresJson(adestradoresJson);


        Pokemons pokemonsXml = wrdXmlJson.readXmlFilePokemon();
        List<Pokemon> pokemonXmlList = wrdXmlJson.readListPokemonsXml(pokemonsXml);

        Adestradores adestradoresXml = wrdXmlJson.readXmlFileAdestrador();
        List<Adestrador> adestradorXmlList = wrdXmlJson.readListAdestradorXml(adestradoresXml);

        /*
          Insercciones con xml
         */

        //crud.insertar2AdestradoresInAdestrador(adestradorXmlList);
        //crud.insertar12PokemonsInPokemonDB(metodosPokemon.getPokemonListFromXmlJson(pokemonXmlList, crud.getPokedexFromDB(), crud.getAdestradorFromDB()));


        /*
          Insercciones con Json
         */

        crud.insertar2AdestradoresInAdestrador(adestradorJsonList);
        crud.insertar12PokemonsInPokemonDB(metodosPokemon.getPokemonListFromXmlJson(pokemonJsonList, crud.getPokedexFromDB(), crud.getAdestradorFromDB()));




    }
}
