
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Datos_empresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Datos_empresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Razon_Social" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="P_Fisica" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="P_Moral" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono_O_Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pagina_Web" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Facebook" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Twitter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Inicio_de_Operaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Giro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Plata_De_Produccion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Si">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Si" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "Datos_empresa", propOrder = {
    "razonSocial",
    "pFisica",
    "pMoral",
    "rfc",
    "domicilio",
    "municipio",
    "ciudad",
    "estado",
    "telefonoOFax",
    "paginaWeb",
    "facebook",
    "twitter",
    "inicioDeOperaciones",
    "giro",
    "plataDeProduccion"
})
public class DatosEmpresa {

    @XmlElement(name = "Razon_Social", required = true)
    protected String razonSocial;
    @XmlElement(name = "P_Fisica")
    protected boolean pFisica;
    @XmlElement(name = "P_Moral")
    protected boolean pMoral;
    @XmlElement(name = "RFC", required = true)
    protected String rfc;
    @XmlElement(name = "Domicilio", required = true)
    protected String domicilio;
    @XmlElement(name = "Municipio", required = true)
    protected String municipio;
    @XmlElement(name = "Ciudad", required = true)
    protected String ciudad;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Telefono_O_Fax", required = true)
    protected String telefonoOFax;
    @XmlElement(name = "Pagina_Web", required = true)
    protected String paginaWeb;
    @XmlElement(name = "Facebook", required = true)
    protected String facebook;
    @XmlElement(name = "Twitter", required = true)
    protected String twitter;
    @XmlElement(name = "Inicio_de_Operaciones", required = true)
    protected String inicioDeOperaciones;
    @XmlElement(name = "Giro", required = true)
    protected String giro;
    @XmlElement(name = "Plata_De_Produccion", required = true)
    protected DatosEmpresa.PlataDeProduccion plataDeProduccion;

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad pFisica.
     * 
     */
    public boolean isPFisica() {
        return pFisica;
    }

    /**
     * Define el valor de la propiedad pFisica.
     * 
     */
    public void setPFisica(boolean value) {
        this.pFisica = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoral.
     * 
     */
    public boolean isPMoral() {
        return pMoral;
    }

    /**
     * Define el valor de la propiedad pMoral.
     * 
     */
    public void setPMoral(boolean value) {
        this.pMoral = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoOFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoOFax() {
        return telefonoOFax;
    }

    /**
     * Define el valor de la propiedad telefonoOFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoOFax(String value) {
        this.telefonoOFax = value;
    }

    /**
     * Obtiene el valor de la propiedad paginaWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Define el valor de la propiedad paginaWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginaWeb(String value) {
        this.paginaWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad facebook.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Define el valor de la propiedad facebook.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebook(String value) {
        this.facebook = value;
    }

    /**
     * Obtiene el valor de la propiedad twitter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * Define el valor de la propiedad twitter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitter(String value) {
        this.twitter = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioDeOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicioDeOperaciones() {
        return inicioDeOperaciones;
    }

    /**
     * Define el valor de la propiedad inicioDeOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioDeOperaciones(String value) {
        this.inicioDeOperaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad giro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiro() {
        return giro;
    }

    /**
     * Define el valor de la propiedad giro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiro(String value) {
        this.giro = value;
    }

    /**
     * Obtiene el valor de la propiedad plataDeProduccion.
     * 
     * @return
     *     possible object is
     *     {@link DatosEmpresa.PlataDeProduccion }
     *     
     */
    public DatosEmpresa.PlataDeProduccion getPlataDeProduccion() {
        return plataDeProduccion;
    }

    /**
     * Define el valor de la propiedad plataDeProduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosEmpresa.PlataDeProduccion }
     *     
     */
    public void setPlataDeProduccion(DatosEmpresa.PlataDeProduccion value) {
        this.plataDeProduccion = value;
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
     *         &lt;element name="Si">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Si" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "si",
        "no"
    })
    public static class PlataDeProduccion {

        @XmlElement(name = "Si", required = true)
        protected DatosEmpresa.PlataDeProduccion.Si si;
        @XmlElement(name = "No")
        protected boolean no;

        /**
         * Obtiene el valor de la propiedad si.
         * 
         * @return
         *     possible object is
         *     {@link DatosEmpresa.PlataDeProduccion.Si }
         *     
         */
        public DatosEmpresa.PlataDeProduccion.Si getSi() {
            return si;
        }

        /**
         * Define el valor de la propiedad si.
         * 
         * @param value
         *     allowed object is
         *     {@link DatosEmpresa.PlataDeProduccion.Si }
         *     
         */
        public void setSi(DatosEmpresa.PlataDeProduccion.Si value) {
            this.si = value;
        }

        /**
         * Obtiene el valor de la propiedad no.
         * 
         */
        public boolean isNo() {
            return no;
        }

        /**
         * Define el valor de la propiedad no.
         * 
         */
        public void setNo(boolean value) {
            this.no = value;
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
         *         &lt;element name="Si" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "si",
            "direccion"
        })
        public static class Si {

            @XmlElement(name = "Si")
            protected boolean si;
            @XmlElement(name = "Direccion", required = true)
            protected String direccion;

            /**
             * Obtiene el valor de la propiedad si.
             * 
             */
            public boolean isSi() {
                return si;
            }

            /**
             * Define el valor de la propiedad si.
             * 
             */
            public void setSi(boolean value) {
                this.si = value;
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

}
