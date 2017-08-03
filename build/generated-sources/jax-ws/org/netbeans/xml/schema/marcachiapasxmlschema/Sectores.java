
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sectores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sectores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Artesanias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Alimentos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cafe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Turismo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ambar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Otro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sectores", propOrder = {
    "artesanias",
    "alimentos",
    "cafe",
    "turismo",
    "ambar",
    "otro"
})
public class Sectores {

    @XmlElement(name = "Artesanias")
    protected String artesanias;
    @XmlElement(name = "Alimentos")
    protected String alimentos;
    @XmlElement(name = "Cafe")
    protected String cafe;
    @XmlElement(name = "Turismo")
    protected String turismo;
    @XmlElement(name = "Ambar")
    protected String ambar;
    @XmlElement(name = "Otro")
    protected String otro;

    /**
     * Obtiene el valor de la propiedad artesanias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtesanias() {
        return artesanias;
    }

    /**
     * Define el valor de la propiedad artesanias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtesanias(String value) {
        this.artesanias = value;
    }

    /**
     * Obtiene el valor de la propiedad alimentos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlimentos() {
        return alimentos;
    }

    /**
     * Define el valor de la propiedad alimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlimentos(String value) {
        this.alimentos = value;
    }

    /**
     * Obtiene el valor de la propiedad cafe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCafe() {
        return cafe;
    }

    /**
     * Define el valor de la propiedad cafe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCafe(String value) {
        this.cafe = value;
    }

    /**
     * Obtiene el valor de la propiedad turismo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurismo() {
        return turismo;
    }

    /**
     * Define el valor de la propiedad turismo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurismo(String value) {
        this.turismo = value;
    }

    /**
     * Obtiene el valor de la propiedad ambar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbar() {
        return ambar;
    }

    /**
     * Define el valor de la propiedad ambar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbar(String value) {
        this.ambar = value;
    }

    /**
     * Obtiene el valor de la propiedad otro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtro() {
        return otro;
    }

    /**
     * Define el valor de la propiedad otro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtro(String value) {
        this.otro = value;
    }

}
