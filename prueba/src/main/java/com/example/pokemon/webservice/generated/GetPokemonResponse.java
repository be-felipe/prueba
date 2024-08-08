//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.07 a las 10:26:26 PM COT 
//


package com.example.pokemon.webservice.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pokemons" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pokemons"
})
@XmlRootElement(name = "getPokemonResponse")
public class GetPokemonResponse {

    @XmlElement(required = true)
    protected String pokemons;

    /**
     * Obtiene el valor de la propiedad pokemons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPokemons() {
        return pokemons;
    }

    /**
     * Define el valor de la propiedad pokemons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPokemons(String value) {
        this.pokemons = value;
    }

}
