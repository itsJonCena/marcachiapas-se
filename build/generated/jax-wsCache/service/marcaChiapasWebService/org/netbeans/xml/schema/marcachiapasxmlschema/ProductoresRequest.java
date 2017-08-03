
package org.netbeans.xml.schema.marcachiapasxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoresRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoresRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productores" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoresRequest", propOrder = {
    "productores"
})
public class ProductoresRequest {

    @XmlElement(required = true)
    protected String productores;

    /**
     * Obtiene el valor de la propiedad productores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductores() {
        return productores;
    }

    /**
     * Define el valor de la propiedad productores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductores(String value) {
        this.productores = value;
    }

}
