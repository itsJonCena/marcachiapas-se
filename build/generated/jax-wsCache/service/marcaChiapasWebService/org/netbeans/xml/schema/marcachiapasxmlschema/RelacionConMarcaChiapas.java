
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Relacion_con_Marca_Chiapas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Relacion_con_Marca_Chiapas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="En_que_Puede_Ayudar_Marca_Chiapas_a_su_Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Como_Puede_su_Empresa_Ayudar_a_Marca_Chiapas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relacion_con_Marca_Chiapas", propOrder = {
    "enQuePuedeAyudarMarcaChiapasASuEmpresa",
    "comoPuedeSuEmpresaAyudarAMarcaChiapas"
})
public class RelacionConMarcaChiapas {

    @XmlElement(name = "En_que_Puede_Ayudar_Marca_Chiapas_a_su_Empresa", required = true)
    protected String enQuePuedeAyudarMarcaChiapasASuEmpresa;
    @XmlElement(name = "Como_Puede_su_Empresa_Ayudar_a_Marca_Chiapas", required = true)
    protected String comoPuedeSuEmpresaAyudarAMarcaChiapas;

    /**
     * Obtiene el valor de la propiedad enQuePuedeAyudarMarcaChiapasASuEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnQuePuedeAyudarMarcaChiapasASuEmpresa() {
        return enQuePuedeAyudarMarcaChiapasASuEmpresa;
    }

    /**
     * Define el valor de la propiedad enQuePuedeAyudarMarcaChiapasASuEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnQuePuedeAyudarMarcaChiapasASuEmpresa(String value) {
        this.enQuePuedeAyudarMarcaChiapasASuEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad comoPuedeSuEmpresaAyudarAMarcaChiapas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComoPuedeSuEmpresaAyudarAMarcaChiapas() {
        return comoPuedeSuEmpresaAyudarAMarcaChiapas;
    }

    /**
     * Define el valor de la propiedad comoPuedeSuEmpresaAyudarAMarcaChiapas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComoPuedeSuEmpresaAyudarAMarcaChiapas(String value) {
        this.comoPuedeSuEmpresaAyudarAMarcaChiapas = value;
    }

}
