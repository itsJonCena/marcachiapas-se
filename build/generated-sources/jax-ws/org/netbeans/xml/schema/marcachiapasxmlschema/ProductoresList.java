
package org.netbeans.xml.schema.marcachiapasxmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoresList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoresList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productores" type="{http://xml.netbeans.org/schema/marcaChiapasXmlSchema}Datos_del_Productor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoresList", propOrder = {
    "productores"
})
public class ProductoresList {

    @XmlElement(required = true)
    protected List<DatosDelProductor> productores;

    /**
     * Gets the value of the productores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosDelProductor }
     * 
     * 
     */
    public List<DatosDelProductor> getProductores() {
        if (productores == null) {
            productores = new ArrayList<DatosDelProductor>();
        }
        return this.productores;
    }

}
