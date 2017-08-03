
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para Datos_del_Productor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Datos_del_Productor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="Nombre_Completo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono_Fijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Autorizacion_uso_Correo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datos_del_Productor", propOrder = {
    "folio",
    "nombreCompleto",
    "curp",
    "telefonoFijo",
    "celular",
    "email",
    "autorizacionUsoCorreo"
})
public class DatosDelProductor {

    @XmlElement(name = "Folio", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String folio;
    @XmlElement(name = "Nombre_Completo", required = true)
    protected String nombreCompleto;
    @XmlElement(name = "CURP", required = true)
    protected String curp;
    @XmlElement(name = "Telefono_Fijo", required = true)
    protected String telefonoFijo;
    @XmlElement(name = "Celular", required = true)
    protected String celular;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Autorizacion_uso_Correo")
    protected boolean autorizacionUsoCorreo;

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Define el valor de la propiedad nombreCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoFijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    /**
     * Define el valor de la propiedad telefonoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoFijo(String value) {
        this.telefonoFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizacionUsoCorreo.
     * 
     */
    public boolean isAutorizacionUsoCorreo() {
        return autorizacionUsoCorreo;
    }

    /**
     * Define el valor de la propiedad autorizacionUsoCorreo.
     * 
     */
    public void setAutorizacionUsoCorreo(boolean value) {
        this.autorizacionUsoCorreo = value;
    }

}
