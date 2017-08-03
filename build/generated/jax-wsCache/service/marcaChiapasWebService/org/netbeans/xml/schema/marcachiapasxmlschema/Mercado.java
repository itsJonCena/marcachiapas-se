
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Mercado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Mercado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Definicion_del_Mercado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Posicion_de_la_Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Principales_Competidores" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mercado", propOrder = {
    "definicionDelMercado",
    "posicionDeLaEmpresa",
    "principalesCompetidores"
})
public class Mercado {

    @XmlElement(name = "Definicion_del_Mercado", required = true)
    protected String definicionDelMercado;
    @XmlElement(name = "Posicion_de_la_Empresa", required = true)
    protected String posicionDeLaEmpresa;
    @XmlElement(name = "Principales_Competidores", required = true)
    protected String principalesCompetidores;

    /**
     * Obtiene el valor de la propiedad definicionDelMercado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinicionDelMercado() {
        return definicionDelMercado;
    }

    /**
     * Define el valor de la propiedad definicionDelMercado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinicionDelMercado(String value) {
        this.definicionDelMercado = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionDeLaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicionDeLaEmpresa() {
        return posicionDeLaEmpresa;
    }

    /**
     * Define el valor de la propiedad posicionDeLaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicionDeLaEmpresa(String value) {
        this.posicionDeLaEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad principalesCompetidores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalesCompetidores() {
        return principalesCompetidores;
    }

    /**
     * Define el valor de la propiedad principalesCompetidores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalesCompetidores(String value) {
        this.principalesCompetidores = value;
    }

}
