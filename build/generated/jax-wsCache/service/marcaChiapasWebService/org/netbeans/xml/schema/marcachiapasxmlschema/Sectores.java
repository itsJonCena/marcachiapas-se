
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
 *         &lt;element name="Artesanias" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Alimentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cafe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Turismo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Ambar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    protected Boolean artesanias;
    @XmlElement(name = "Alimentos")
    protected Boolean alimentos;
    @XmlElement(name = "Cafe")
    protected Boolean cafe;
    @XmlElement(name = "Turismo")
    protected Boolean turismo;
    @XmlElement(name = "Ambar")
    protected Boolean ambar;
    @XmlElement(name = "Otro")
    protected String otro;

    /**
     * Obtiene el valor de la propiedad artesanias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArtesanias() {
        return artesanias;
    }

    /**
     * Define el valor de la propiedad artesanias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArtesanias(Boolean value) {
        this.artesanias = value;
    }

    /**
     * Obtiene el valor de la propiedad alimentos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlimentos() {
        return alimentos;
    }

    /**
     * Define el valor de la propiedad alimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlimentos(Boolean value) {
        this.alimentos = value;
    }

    /**
     * Obtiene el valor de la propiedad cafe.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCafe() {
        return cafe;
    }

    /**
     * Define el valor de la propiedad cafe.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCafe(Boolean value) {
        this.cafe = value;
    }

    /**
     * Obtiene el valor de la propiedad turismo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTurismo() {
        return turismo;
    }

    /**
     * Define el valor de la propiedad turismo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTurismo(Boolean value) {
        this.turismo = value;
    }

    /**
     * Obtiene el valor de la propiedad ambar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmbar() {
        return ambar;
    }

    /**
     * Define el valor de la propiedad ambar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmbar(Boolean value) {
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
