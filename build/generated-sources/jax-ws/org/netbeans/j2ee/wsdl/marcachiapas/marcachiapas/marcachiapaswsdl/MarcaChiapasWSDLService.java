
package org.netbeans.j2ee.wsdl.marcachiapas.marcachiapas.marcachiapaswsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "marcaChiapasWSDLService", targetNamespace = "http://j2ee.netbeans.org/wsdl/MarcaChiapas/marcaChiapas/marcaChiapasWSDL", wsdlLocation = "file:/Users/Alex/marcachiapas-se/src/conf/xml-resources/web-services/marcaChiapasWebService/wsdl/marcaChiapasWSDL.wsdl")
public class MarcaChiapasWSDLService
    extends Service
{

    private final static URL MARCACHIAPASWSDLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MARCACHIAPASWSDLSERVICE_EXCEPTION;
    private final static QName MARCACHIAPASWSDLSERVICE_QNAME = new QName("http://j2ee.netbeans.org/wsdl/MarcaChiapas/marcaChiapas/marcaChiapasWSDL", "marcaChiapasWSDLService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/Alex/marcachiapas-se/src/conf/xml-resources/web-services/marcaChiapasWebService/wsdl/marcaChiapasWSDL.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MARCACHIAPASWSDLSERVICE_WSDL_LOCATION = url;
        MARCACHIAPASWSDLSERVICE_EXCEPTION = e;
    }

    public MarcaChiapasWSDLService() {
        super(__getWsdlLocation(), MARCACHIAPASWSDLSERVICE_QNAME);
    }

    public MarcaChiapasWSDLService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MARCACHIAPASWSDLSERVICE_QNAME, features);
    }

    public MarcaChiapasWSDLService(URL wsdlLocation) {
        super(wsdlLocation, MARCACHIAPASWSDLSERVICE_QNAME);
    }

    public MarcaChiapasWSDLService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MARCACHIAPASWSDLSERVICE_QNAME, features);
    }

    public MarcaChiapasWSDLService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MarcaChiapasWSDLService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MarcaChiapasWSDLPortType
     */
    @WebEndpoint(name = "marcaChiapasWSDLPort")
    public MarcaChiapasWSDLPortType getMarcaChiapasWSDLPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/MarcaChiapas/marcaChiapas/marcaChiapasWSDL", "marcaChiapasWSDLPort"), MarcaChiapasWSDLPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MarcaChiapasWSDLPortType
     */
    @WebEndpoint(name = "marcaChiapasWSDLPort")
    public MarcaChiapasWSDLPortType getMarcaChiapasWSDLPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/MarcaChiapas/marcaChiapas/marcaChiapasWSDL", "marcaChiapasWSDLPort"), MarcaChiapasWSDLPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MARCACHIAPASWSDLSERVICE_EXCEPTION!= null) {
            throw MARCACHIAPASWSDLSERVICE_EXCEPTION;
        }
        return MARCACHIAPASWSDLSERVICE_WSDL_LOCATION;
    }

}
