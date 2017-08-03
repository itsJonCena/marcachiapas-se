
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ventanillas_Especializadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ventanillas_Especializadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ambar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Alimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Artesania">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cafe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Servicio_Turistico">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ventanillas_Especializadas", propOrder = {
    "ambar",
    "alimento",
    "artesania",
    "cafe",
    "servicioTuristico"
})
public class VentanillasEspecializadas {

    @XmlElement(name = "Ambar", required = true)
    protected VentanillasEspecializadas.Ambar ambar;
    @XmlElement(name = "Alimento", required = true)
    protected VentanillasEspecializadas.Alimento alimento;
    @XmlElement(name = "Artesania", required = true)
    protected VentanillasEspecializadas.Artesania artesania;
    @XmlElement(name = "Cafe", required = true)
    protected VentanillasEspecializadas.Cafe cafe;
    @XmlElement(name = "Servicio_Turistico", required = true)
    protected VentanillasEspecializadas.ServicioTuristico servicioTuristico;

    /**
     * Obtiene el valor de la propiedad ambar.
     * 
     * @return
     *     possible object is
     *     {@link VentanillasEspecializadas.Ambar }
     *     
     */
    public VentanillasEspecializadas.Ambar getAmbar() {
        return ambar;
    }

    /**
     * Define el valor de la propiedad ambar.
     * 
     * @param value
     *     allowed object is
     *     {@link VentanillasEspecializadas.Ambar }
     *     
     */
    public void setAmbar(VentanillasEspecializadas.Ambar value) {
        this.ambar = value;
    }

    /**
     * Obtiene el valor de la propiedad alimento.
     * 
     * @return
     *     possible object is
     *     {@link VentanillasEspecializadas.Alimento }
     *     
     */
    public VentanillasEspecializadas.Alimento getAlimento() {
        return alimento;
    }

    /**
     * Define el valor de la propiedad alimento.
     * 
     * @param value
     *     allowed object is
     *     {@link VentanillasEspecializadas.Alimento }
     *     
     */
    public void setAlimento(VentanillasEspecializadas.Alimento value) {
        this.alimento = value;
    }

    /**
     * Obtiene el valor de la propiedad artesania.
     * 
     * @return
     *     possible object is
     *     {@link VentanillasEspecializadas.Artesania }
     *     
     */
    public VentanillasEspecializadas.Artesania getArtesania() {
        return artesania;
    }

    /**
     * Define el valor de la propiedad artesania.
     * 
     * @param value
     *     allowed object is
     *     {@link VentanillasEspecializadas.Artesania }
     *     
     */
    public void setArtesania(VentanillasEspecializadas.Artesania value) {
        this.artesania = value;
    }

    /**
     * Obtiene el valor de la propiedad cafe.
     * 
     * @return
     *     possible object is
     *     {@link VentanillasEspecializadas.Cafe }
     *     
     */
    public VentanillasEspecializadas.Cafe getCafe() {
        return cafe;
    }

    /**
     * Define el valor de la propiedad cafe.
     * 
     * @param value
     *     allowed object is
     *     {@link VentanillasEspecializadas.Cafe }
     *     
     */
    public void setCafe(VentanillasEspecializadas.Cafe value) {
        this.cafe = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioTuristico.
     * 
     * @return
     *     possible object is
     *     {@link VentanillasEspecializadas.ServicioTuristico }
     *     
     */
    public VentanillasEspecializadas.ServicioTuristico getServicioTuristico() {
        return servicioTuristico;
    }

    /**
     * Define el valor de la propiedad servicioTuristico.
     * 
     * @param value
     *     allowed object is
     *     {@link VentanillasEspecializadas.ServicioTuristico }
     *     
     */
    public void setServicioTuristico(VentanillasEspecializadas.ServicioTuristico value) {
        this.servicioTuristico = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comite",
        "direccion",
        "telefono",
        "email"
    })
    public static class Alimento {

        @XmlElement(name = "Comite", required = true)
        protected String comite;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;
        @XmlElement(name = "Telefono", required = true)
        protected String telefono;
        @XmlElement(name = "Email", required = true)
        protected String email;

        /**
         * Obtiene el valor de la propiedad comite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComite() {
            return comite;
        }

        /**
         * Define el valor de la propiedad comite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComite(String value) {
            this.comite = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comite",
        "direccion",
        "ciudad",
        "cp",
        "telefono",
        "email"
    })
    public static class Ambar {

        @XmlElement(name = "Comite", required = true)
        protected String comite;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;
        @XmlElement(name = "Ciudad", required = true)
        protected String ciudad;
        @XmlElement(name = "CP")
        protected int cp;
        @XmlElement(name = "Telefono", required = true)
        protected String telefono;
        @XmlElement(name = "Email", required = true)
        protected String email;

        /**
         * Obtiene el valor de la propiedad comite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComite() {
            return comite;
        }

        /**
         * Define el valor de la propiedad comite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComite(String value) {
            this.comite = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad ciudad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiudad() {
            return ciudad;
        }

        /**
         * Define el valor de la propiedad ciudad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiudad(String value) {
            this.ciudad = value;
        }

        /**
         * Obtiene el valor de la propiedad cp.
         * 
         */
        public int getCP() {
            return cp;
        }

        /**
         * Define el valor de la propiedad cp.
         * 
         */
        public void setCP(int value) {
            this.cp = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comite",
        "direccion",
        "ciudad",
        "cp",
        "telefono",
        "email"
    })
    public static class Artesania {

        @XmlElement(name = "Comite", required = true)
        protected String comite;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;
        @XmlElement(name = "Ciudad", required = true)
        protected String ciudad;
        @XmlElement(name = "CP")
        protected int cp;
        @XmlElement(name = "Telefono", required = true)
        protected String telefono;
        @XmlElement(name = "Email", required = true)
        protected String email;

        /**
         * Obtiene el valor de la propiedad comite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComite() {
            return comite;
        }

        /**
         * Define el valor de la propiedad comite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComite(String value) {
            this.comite = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad ciudad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiudad() {
            return ciudad;
        }

        /**
         * Define el valor de la propiedad ciudad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiudad(String value) {
            this.ciudad = value;
        }

        /**
         * Obtiene el valor de la propiedad cp.
         * 
         */
        public int getCP() {
            return cp;
        }

        /**
         * Define el valor de la propiedad cp.
         * 
         */
        public void setCP(int value) {
            this.cp = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comite",
        "direccion",
        "ciudad",
        "cp",
        "telefono"
    })
    public static class Cafe {

        @XmlElement(name = "Comite", required = true)
        protected String comite;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;
        @XmlElement(name = "Ciudad", required = true)
        protected String ciudad;
        @XmlElement(name = "CP")
        protected int cp;
        @XmlElement(name = "Telefono", required = true)
        protected String telefono;

        /**
         * Obtiene el valor de la propiedad comite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComite() {
            return comite;
        }

        /**
         * Define el valor de la propiedad comite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComite(String value) {
            this.comite = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad ciudad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiudad() {
            return ciudad;
        }

        /**
         * Define el valor de la propiedad ciudad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiudad(String value) {
            this.ciudad = value;
        }

        /**
         * Obtiene el valor de la propiedad cp.
         * 
         */
        public int getCP() {
            return cp;
        }

        /**
         * Define el valor de la propiedad cp.
         * 
         */
        public void setCP(int value) {
            this.cp = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comite",
        "direccion"
    })
    public static class ServicioTuristico {

        @XmlElement(name = "Comite", required = true)
        protected String comite;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;

        /**
         * Obtiene el valor de la propiedad comite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComite() {
            return comite;
        }

        /**
         * Define el valor de la propiedad comite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComite(String value) {
            this.comite = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

    }

}
