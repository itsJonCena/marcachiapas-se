
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productorEncontrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productorEncontrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datos_Productor" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Datos_del_Productor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productorEncontrado", propOrder = {
    "datosProductor"
})
public class ProductorEncontrado {

    @XmlElement(name = "datos_Productor", required = true)
    protected DatosDelProductor datosProductor;

    /**
     * Obtiene el valor de la propiedad datosProductor.
     * 
     * @return
     *     possible object is
     *     {@link DatosDelProductor }
     *     
     */
    public DatosDelProductor getDatosProductor() {
        return datosProductor;
    }

    /**
     * Define el valor de la propiedad datosProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDelProductor }
     *     
     */
    public void setDatosProductor(DatosDelProductor value) {
        this.datosProductor = value;
    }

}
