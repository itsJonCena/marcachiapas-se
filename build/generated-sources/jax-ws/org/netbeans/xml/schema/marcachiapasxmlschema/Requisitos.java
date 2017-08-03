
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Requisitos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Requisitos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Atributos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Documentos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Acta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Contribuyente_O_RFC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Facultad_De_representante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Formato_Marca_chiapas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Respaldo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="info2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ventanillas" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Ventanillas_Especializadas"/>
 *         &lt;element name="Info3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Requisitos", propOrder = {
    "info",
    "atributos",
    "documentos",
    "info2",
    "ventanillas",
    "info3"
})
public class Requisitos {

    @XmlElement(name = "Info", required = true)
    protected String info;
    @XmlElement(name = "Atributos", required = true)
    protected Requisitos.Atributos atributos;
    @XmlElement(name = "Documentos", required = true)
    protected Requisitos.Documentos documentos;
    @XmlElement(required = true)
    protected String info2;
    @XmlElement(name = "Ventanillas", required = true)
    protected VentanillasEspecializadas ventanillas;
    @XmlElement(name = "Info3", required = true)
    protected String info3;

    /**
     * Obtiene el valor de la propiedad info.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Define el valor de la propiedad info.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Obtiene el valor de la propiedad atributos.
     * 
     * @return
     *     possible object is
     *     {@link Requisitos.Atributos }
     *     
     */
    public Requisitos.Atributos getAtributos() {
        return atributos;
    }

    /**
     * Define el valor de la propiedad atributos.
     * 
     * @param value
     *     allowed object is
     *     {@link Requisitos.Atributos }
     *     
     */
    public void setAtributos(Requisitos.Atributos value) {
        this.atributos = value;
    }

    /**
     * Obtiene el valor de la propiedad documentos.
     * 
     * @return
     *     possible object is
     *     {@link Requisitos.Documentos }
     *     
     */
    public Requisitos.Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define el valor de la propiedad documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Requisitos.Documentos }
     *     
     */
    public void setDocumentos(Requisitos.Documentos value) {
        this.documentos = value;
    }

    /**
     * Obtiene el valor de la propiedad info2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * Define el valor de la propiedad info2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ventanillas.
     * 
     * @return
     *     possible object is
     *     {@link VentanillasEspecializadas }
     *     
     */
    public VentanillasEspecializadas getVentanillas() {
        return ventanillas;
    }

    /**
     * Define el valor de la propiedad ventanillas.
     * 
     * @param value
     *     allowed object is
     *     {@link VentanillasEspecializadas }
     *     
     */
    public void setVentanillas(VentanillasEspecializadas value) {
        this.ventanillas = value;
    }

    /**
     * Obtiene el valor de la propiedad info3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo3() {
        return info3;
    }

    /**
     * Define el valor de la propiedad info3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo3(String value) {
        this.info3 = value;
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
     *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "info",
        "producto",
        "domicilio",
        "origen"
    })
    public static class Atributos {

        @XmlElement(name = "Info", required = true)
        protected String info;
        @XmlElement(name = "Producto", required = true)
        protected String producto;
        @XmlElement(name = "Domicilio", required = true)
        protected String domicilio;
        @XmlElement(name = "Origen", required = true)
        protected String origen;

        /**
         * Obtiene el valor de la propiedad info.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Define el valor de la propiedad info.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

        /**
         * Obtiene el valor de la propiedad producto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProducto() {
            return producto;
        }

        /**
         * Define el valor de la propiedad producto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProducto(String value) {
            this.producto = value;
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
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigen(String value) {
            this.origen = value;
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
     *         &lt;element name="Acta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Contribuyente_O_RFC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Facultad_De_representante" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Formato_Marca_chiapas" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Respaldo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "acta",
        "contribuyenteORFC",
        "facultadDeRepresentante",
        "formatoMarcaChiapas",
        "respaldo",
        "nota"
    })
    public static class Documentos {

        @XmlElement(name = "Acta", required = true)
        protected String acta;
        @XmlElement(name = "Contribuyente_O_RFC", required = true)
        protected String contribuyenteORFC;
        @XmlElement(name = "Facultad_De_representante", required = true)
        protected String facultadDeRepresentante;
        @XmlElement(name = "Formato_Marca_chiapas", required = true)
        protected String formatoMarcaChiapas;
        @XmlElement(name = "Respaldo", required = true)
        protected String respaldo;
        @XmlElement(name = "Nota", required = true)
        protected String nota;

        /**
         * Obtiene el valor de la propiedad acta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActa() {
            return acta;
        }

        /**
         * Define el valor de la propiedad acta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActa(String value) {
            this.acta = value;
        }

        /**
         * Obtiene el valor de la propiedad contribuyenteORFC.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContribuyenteORFC() {
            return contribuyenteORFC;
        }

        /**
         * Define el valor de la propiedad contribuyenteORFC.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContribuyenteORFC(String value) {
            this.contribuyenteORFC = value;
        }

        /**
         * Obtiene el valor de la propiedad facultadDeRepresentante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacultadDeRepresentante() {
            return facultadDeRepresentante;
        }

        /**
         * Define el valor de la propiedad facultadDeRepresentante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacultadDeRepresentante(String value) {
            this.facultadDeRepresentante = value;
        }

        /**
         * Obtiene el valor de la propiedad formatoMarcaChiapas.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormatoMarcaChiapas() {
            return formatoMarcaChiapas;
        }

        /**
         * Define el valor de la propiedad formatoMarcaChiapas.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormatoMarcaChiapas(String value) {
            this.formatoMarcaChiapas = value;
        }

        /**
         * Obtiene el valor de la propiedad respaldo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRespaldo() {
            return respaldo;
        }

        /**
         * Define el valor de la propiedad respaldo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRespaldo(String value) {
            this.respaldo = value;
        }

        /**
         * Obtiene el valor de la propiedad nota.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNota() {
            return nota;
        }

        /**
         * Define el valor de la propiedad nota.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNota(String value) {
            this.nota = value;
        }

    }

}
