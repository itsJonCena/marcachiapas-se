
package org.netbeans.xml.schema.marcachiapasxmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Diagnostico_Inicial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Diagnostico_Inicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nombre_Comercial_y_o_M_R" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Categoria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Micro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="Pequeña" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="Mediana" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Marca_Registrada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Empleos_Generados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Directos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="M" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Indirectos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="M" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sector" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Sectores"/>
 *         &lt;element name="Analisis_Foda">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fortalezas" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Fortaleza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Oportunidades" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Oportunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Debilidades" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Debilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Amenazas" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Amenaza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Mision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Vision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cuentanos_de_los_Primeros_Años_de_la_Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnostico_Inicial", propOrder = {
    "nombreComercialYOMR",
    "categoria",
    "marcaRegistrada",
    "empleosGenerados",
    "directos",
    "indirectos",
    "sector",
    "analisisFoda",
    "mision",
    "vision",
    "cuentanosDeLosPrimerosA\u00f1osDeLaEmpresa"
})
public class DiagnosticoInicial {

    @XmlElement(name = "Nombre_Comercial_y_o_M_R", required = true)
    protected String nombreComercialYOMR;
    @XmlElement(name = "Categoria", required = true)
    protected DiagnosticoInicial.Categoria categoria;
    @XmlElement(name = "Marca_Registrada")
    protected boolean marcaRegistrada;
    @XmlElement(name = "Empleos_Generados")
    protected int empleosGenerados;
    @XmlElement(name = "Directos", required = true)
    protected DiagnosticoInicial.Directos directos;
    @XmlElement(name = "Indirectos", required = true)
    protected DiagnosticoInicial.Indirectos indirectos;
    @XmlElement(name = "Sector", required = true)
    protected Sectores sector;
    @XmlElement(name = "Analisis_Foda", required = true)
    protected DiagnosticoInicial.AnalisisFoda analisisFoda;
    @XmlElement(name = "Mision", required = true)
    protected String mision;
    @XmlElement(name = "Vision", required = true)
    protected String vision;
    @XmlElement(name = "Cuentanos_de_los_Primeros_A\u00f1os_de_la_Empresa", required = true)
    protected String cuentanosDeLosPrimerosAñosDeLaEmpresa;

    /**
     * Obtiene el valor de la propiedad nombreComercialYOMR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercialYOMR() {
        return nombreComercialYOMR;
    }

    /**
     * Define el valor de la propiedad nombreComercialYOMR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercialYOMR(String value) {
        this.nombreComercialYOMR = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticoInicial.Categoria }
     *     
     */
    public DiagnosticoInicial.Categoria getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticoInicial.Categoria }
     *     
     */
    public void setCategoria(DiagnosticoInicial.Categoria value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaRegistrada.
     * 
     */
    public boolean isMarcaRegistrada() {
        return marcaRegistrada;
    }

    /**
     * Define el valor de la propiedad marcaRegistrada.
     * 
     */
    public void setMarcaRegistrada(boolean value) {
        this.marcaRegistrada = value;
    }

    /**
     * Obtiene el valor de la propiedad empleosGenerados.
     * 
     */
    public int getEmpleosGenerados() {
        return empleosGenerados;
    }

    /**
     * Define el valor de la propiedad empleosGenerados.
     * 
     */
    public void setEmpleosGenerados(int value) {
        this.empleosGenerados = value;
    }

    /**
     * Obtiene el valor de la propiedad directos.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticoInicial.Directos }
     *     
     */
    public DiagnosticoInicial.Directos getDirectos() {
        return directos;
    }

    /**
     * Define el valor de la propiedad directos.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticoInicial.Directos }
     *     
     */
    public void setDirectos(DiagnosticoInicial.Directos value) {
        this.directos = value;
    }

    /**
     * Obtiene el valor de la propiedad indirectos.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticoInicial.Indirectos }
     *     
     */
    public DiagnosticoInicial.Indirectos getIndirectos() {
        return indirectos;
    }

    /**
     * Define el valor de la propiedad indirectos.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticoInicial.Indirectos }
     *     
     */
    public void setIndirectos(DiagnosticoInicial.Indirectos value) {
        this.indirectos = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link Sectores }
     *     
     */
    public Sectores getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link Sectores }
     *     
     */
    public void setSector(Sectores value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad analisisFoda.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticoInicial.AnalisisFoda }
     *     
     */
    public DiagnosticoInicial.AnalisisFoda getAnalisisFoda() {
        return analisisFoda;
    }

    /**
     * Define el valor de la propiedad analisisFoda.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticoInicial.AnalisisFoda }
     *     
     */
    public void setAnalisisFoda(DiagnosticoInicial.AnalisisFoda value) {
        this.analisisFoda = value;
    }

    /**
     * Obtiene el valor de la propiedad mision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMision() {
        return mision;
    }

    /**
     * Define el valor de la propiedad mision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMision(String value) {
        this.mision = value;
    }

    /**
     * Obtiene el valor de la propiedad vision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVision() {
        return vision;
    }

    /**
     * Define el valor de la propiedad vision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVision(String value) {
        this.vision = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentanosDeLosPrimerosAñosDeLaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentanosDeLosPrimerosAñosDeLaEmpresa() {
        return cuentanosDeLosPrimerosAñosDeLaEmpresa;
    }

    /**
     * Define el valor de la propiedad cuentanosDeLosPrimerosAñosDeLaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentanosDeLosPrimerosAñosDeLaEmpresa(String value) {
        this.cuentanosDeLosPrimerosAñosDeLaEmpresa = value;
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
     *         &lt;element name="Fortalezas" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Fortaleza" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Oportunidades" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Oportunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Debilidades" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Debilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Amenazas" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Amenaza" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "fortalezas",
        "oportunidades",
        "debilidades",
        "amenazas"
    })
    public static class AnalisisFoda {

        @XmlElement(name = "Fortalezas", required = true)
        protected List<DiagnosticoInicial.AnalisisFoda.Fortalezas> fortalezas;
        @XmlElement(name = "Oportunidades", required = true)
        protected List<DiagnosticoInicial.AnalisisFoda.Oportunidades> oportunidades;
        @XmlElement(name = "Debilidades", required = true)
        protected List<DiagnosticoInicial.AnalisisFoda.Debilidades> debilidades;
        @XmlElement(name = "Amenazas", required = true)
        protected List<DiagnosticoInicial.AnalisisFoda.Amenazas> amenazas;

        /**
         * Gets the value of the fortalezas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fortalezas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFortalezas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiagnosticoInicial.AnalisisFoda.Fortalezas }
         * 
         * 
         */
        public List<DiagnosticoInicial.AnalisisFoda.Fortalezas> getFortalezas() {
            if (fortalezas == null) {
                fortalezas = new ArrayList<DiagnosticoInicial.AnalisisFoda.Fortalezas>();
            }
            return this.fortalezas;
        }

        /**
         * Gets the value of the oportunidades property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oportunidades property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOportunidades().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiagnosticoInicial.AnalisisFoda.Oportunidades }
         * 
         * 
         */
        public List<DiagnosticoInicial.AnalisisFoda.Oportunidades> getOportunidades() {
            if (oportunidades == null) {
                oportunidades = new ArrayList<DiagnosticoInicial.AnalisisFoda.Oportunidades>();
            }
            return this.oportunidades;
        }

        /**
         * Gets the value of the debilidades property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the debilidades property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDebilidades().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiagnosticoInicial.AnalisisFoda.Debilidades }
         * 
         * 
         */
        public List<DiagnosticoInicial.AnalisisFoda.Debilidades> getDebilidades() {
            if (debilidades == null) {
                debilidades = new ArrayList<DiagnosticoInicial.AnalisisFoda.Debilidades>();
            }
            return this.debilidades;
        }

        /**
         * Gets the value of the amenazas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenazas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenazas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiagnosticoInicial.AnalisisFoda.Amenazas }
         * 
         * 
         */
        public List<DiagnosticoInicial.AnalisisFoda.Amenazas> getAmenazas() {
            if (amenazas == null) {
                amenazas = new ArrayList<DiagnosticoInicial.AnalisisFoda.Amenazas>();
            }
            return this.amenazas;
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
         *         &lt;element name="Amenaza" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "amenaza"
        })
        public static class Amenazas {

            @XmlElement(name = "Amenaza", required = true)
            protected String amenaza;

            /**
             * Obtiene el valor de la propiedad amenaza.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmenaza() {
                return amenaza;
            }

            /**
             * Define el valor de la propiedad amenaza.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmenaza(String value) {
                this.amenaza = value;
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
         *         &lt;element name="Debilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "debilidad"
        })
        public static class Debilidades {

            @XmlElement(name = "Debilidad", required = true)
            protected String debilidad;

            /**
             * Obtiene el valor de la propiedad debilidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDebilidad() {
                return debilidad;
            }

            /**
             * Define el valor de la propiedad debilidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDebilidad(String value) {
                this.debilidad = value;
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
         *         &lt;element name="Fortaleza" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fortaleza"
        })
        public static class Fortalezas {

            @XmlElement(name = "Fortaleza", required = true)
            protected String fortaleza;

            /**
             * Obtiene el valor de la propiedad fortaleza.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFortaleza() {
                return fortaleza;
            }

            /**
             * Define el valor de la propiedad fortaleza.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFortaleza(String value) {
                this.fortaleza = value;
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
         *         &lt;element name="Oportunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "oportunidad"
        })
        public static class Oportunidades {

            @XmlElement(name = "Oportunidad", required = true)
            protected String oportunidad;

            /**
             * Obtiene el valor de la propiedad oportunidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOportunidad() {
                return oportunidad;
            }

            /**
             * Define el valor de la propiedad oportunidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOportunidad(String value) {
                this.oportunidad = value;
            }

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
     *       &lt;choice>
     *         &lt;element name="Micro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="Pequeña" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="Mediana" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "micro",
        "peque\u00f1a",
        "mediana"
    })
    public static class Categoria {

        @XmlElement(name = "Micro")
        protected Boolean micro;
        @XmlElement(name = "Peque\u00f1a")
        protected Boolean pequeña;
        @XmlElement(name = "Mediana")
        protected Boolean mediana;

        /**
         * Obtiene el valor de la propiedad micro.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMicro() {
            return micro;
        }

        /**
         * Define el valor de la propiedad micro.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMicro(Boolean value) {
            this.micro = value;
        }

        /**
         * Obtiene el valor de la propiedad pequeña.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPequeña() {
            return pequeña;
        }

        /**
         * Define el valor de la propiedad pequeña.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPequeña(Boolean value) {
            this.pequeña = value;
        }

        /**
         * Obtiene el valor de la propiedad mediana.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMediana() {
            return mediana;
        }

        /**
         * Define el valor de la propiedad mediana.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMediana(Boolean value) {
            this.mediana = value;
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
     *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="M" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "h",
        "m"
    })
    public static class Directos {

        @XmlElement(name = "H")
        protected int h;
        @XmlElement(name = "M")
        protected int m;

        /**
         * Obtiene el valor de la propiedad h.
         * 
         */
        public int getH() {
            return h;
        }

        /**
         * Define el valor de la propiedad h.
         * 
         */
        public void setH(int value) {
            this.h = value;
        }

        /**
         * Obtiene el valor de la propiedad m.
         * 
         */
        public int getM() {
            return m;
        }

        /**
         * Define el valor de la propiedad m.
         * 
         */
        public void setM(int value) {
            this.m = value;
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
     *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="M" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "h",
        "m"
    })
    public static class Indirectos {

        @XmlElement(name = "H")
        protected int h;
        @XmlElement(name = "M")
        protected int m;

        /**
         * Obtiene el valor de la propiedad h.
         * 
         */
        public int getH() {
            return h;
        }

        /**
         * Define el valor de la propiedad h.
         * 
         */
        public void setH(int value) {
            this.h = value;
        }

        /**
         * Obtiene el valor de la propiedad m.
         * 
         */
        public int getM() {
            return m;
        }

        /**
         * Define el valor de la propiedad m.
         * 
         */
        public void setM(int value) {
            this.m = value;
        }

    }

}
