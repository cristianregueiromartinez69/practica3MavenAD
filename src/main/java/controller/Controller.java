package controller;

import service.Crud;
import service.MetodosAdestrador;
import service.MetodosPokedex;
import service.MetodosPokemon;

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
        Crud crud = new Crud();

        // Inserta datos iniciales en las bases de datos


        crud.insertar10PokemonsInPokedex(metodosPokedex.getPokemonsList());
        crud.insertar2AdestradoresInAdestrador(metodosAdestrador.getAdestradoresList());
        crud.insertar12PokemonsInPokemonDB(metodosPokemon.getPokemonList(crud.getPokedexFromDB(), crud.getAdestradorFromDB()));

    }
}
