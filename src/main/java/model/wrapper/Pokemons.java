package model.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import model.entity.Pokemon;

import java.util.List;

/**
 * Esta clase sirve como contenedor para una lista de objetos Pokemon.
 * Se utiliza para manejar los datos de los pokemons en formatos XML y JSON.
 * Las anotaciones de Jackson permiten la serialización y deserialización de estos objetos a los respectivos formatos.
 * @author cristian
 * @version 1.0
 */
public class Pokemons {

    /**
     * Lista de pokemons, que se utiliza para la serialización y deserialización en formato XML.
     */
    @JacksonXmlElementWrapper(localName = "pokemons")
    @JsonProperty("pokemons")
    private List<Pokemon> pokemons;


    /**
     * Constructor que inicializa la lista de pokemons.
     *
     * @param pokemons la lista de pokemons a ser asignada.
     */
    public Pokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    /**
     * Constructor vacío que permite la creación de una instancia sin inicializar las listas.
     */
    public Pokemons() {

    }

    /**
     * Getter y setter de la clase
     * @param pokemons los atributos correspondientes
     */
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }



    public List<Pokemon> getPokemons() {
        return pokemons;
    }


}