
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formularioRegistro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formularioRegistro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datos_del_Productor" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Datos_del_Productor"/>
 *         &lt;element name="Datos_Empresa" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Datos_empresa"/>
 *         &lt;element name="Diagnostico_Inicial" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Diagnostico_Inicial"/>
 *         &lt;element name="Mercado" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Mercado"/>
 *         &lt;element name="Relacion_Con_Marca_Chiapas" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Relacion_con_Marca_Chiapas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formularioRegistro", propOrder = {
    "datosDelProductor",
    "datosEmpresa",
    "diagnosticoInicial",
    "mercado",
    "relacionConMarcaChiapas"
})
public class FormularioRegistro {

    @XmlElement(name = "Datos_del_Productor", required = true)
    protected DatosDelProductor datosDelProductor;
    @XmlElement(name = "Datos_Empresa", required = true)
    protected DatosEmpresa datosEmpresa;
    @XmlElement(name = "Diagnostico_Inicial", required = true)
    protected DiagnosticoInicial diagnosticoInicial;
    @XmlElement(name = "Mercado", required = true)
    protected Mercado mercado;
    @XmlElement(name = "Relacion_Con_Marca_Chiapas", required = true)
    protected RelacionConMarcaChiapas relacionConMarcaChiapas;

    /**
     * Obtiene el valor de la propiedad datosDelProductor.
     * 
     * @return
     *     possible object is
     *     {@link DatosDelProductor }
     *     
     */
    public DatosDelProductor getDatosDelProductor() {
        return datosDelProductor;
    }

    /**
     * Define el valor de la propiedad datosDelProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDelProductor }
     *     
     */
    public void setDatosDelProductor(DatosDelProductor value) {
        this.datosDelProductor = value;
    }

    /**
     * Obtiene el valor de la propiedad datosEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link DatosEmpresa }
     *     
     */
    public DatosEmpresa getDatosEmpresa() {
        return datosEmpresa;
    }

    /**
     * Define el valor de la propiedad datosEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosEmpresa }
     *     
     */
    public void setDatosEmpresa(DatosEmpresa value) {
        this.datosEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticoInicial.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticoInicial }
     *     
     */
    public DiagnosticoInicial getDiagnosticoInicial() {
        return diagnosticoInicial;
    }

    /**
     * Define el valor de la propiedad diagnosticoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticoInicial }
     *     
     */
    public void setDiagnosticoInicial(DiagnosticoInicial value) {
        this.diagnosticoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad mercado.
     * 
     * @return
     *     possible object is
     *     {@link Mercado }
     *     
     */
    public Mercado getMercado() {
        return mercado;
    }

    /**
     * Define el valor de la propiedad mercado.
     * 
     * @param value
     *     allowed object is
     *     {@link Mercado }
     *     
     */
    public void setMercado(Mercado value) {
        this.mercado = value;
    }

    /**
     * Obtiene el valor de la propiedad relacionConMarcaChiapas.
     * 
     * @return
     *     possible object is
     *     {@link RelacionConMarcaChiapas }
     *     
     */
    public RelacionConMarcaChiapas getRelacionConMarcaChiapas() {
        return relacionConMarcaChiapas;
    }

    /**
     * Define el valor de la propiedad relacionConMarcaChiapas.
     * 
     * @param value
     *     allowed object is
     *     {@link RelacionConMarcaChiapas }
     *     
     */
    public void setRelacionConMarcaChiapas(RelacionConMarcaChiapas value) {
        this.relacionConMarcaChiapas = value;
    }

}
