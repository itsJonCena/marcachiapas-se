/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcachiapas;

import javax.jws.WebService;
import org.netbeans.xml.schema.marcachiapasxmlschema.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alex
 */
@WebService(serviceName = "marcaChiapasWSDLService", portName = "marcaChiapasWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.marcachiapas.marcachiapas.marcachiapaswsdl.MarcaChiapasWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/MarcaChiapas/marcaChiapas/marcaChiapasWSDL", wsdlLocation = "WEB-INF/wsdl/marcaChiapasWebService/marcaChiapasWSDL.wsdl")
public class marcaChiapasWebService {
    
    Connection conn = null;
    
    
    public org.netbeans.xml.schema.marcachiapasxmlschema.Requisitos marcaChiapasWSDLRequisitosOperation(int opcionRequisito) {
        //TODO implement this method
        Requisitos req = new Requisitos();
        
        req.setInfo("La Secretaría de Economía del Estado a través de Marca Chiapas permite otorgar el Sello Distintivo “MÉXICO CHIAPAS ORIGINAL” a  diversos productos que cumplan con los atributos necesarios, que garanticen calidad y originalidad.");
        Requisitos.Atributos atr = new Requisitos.Atributos();
        //atr = req.getAtributos();
        atr.setInfo("Los atributos básicos para obtener el Sello Distintivo son los siguientes:");
        atr.setProducto("Domicilio fiscal en Chiapas.");
        atr.setOrigen("Más del 50% de la materia prima del producto de origen Chiapaneco.");
        req.setAtributos(atr);
        
        Requisitos.Documentos docs = new Requisitos.Documentos();
        docs.setActa("Copia simple de acta constitutiva de la empresa, con copia simple del R.P.P.C. (si aplica).");
        docs.setContribuyenteORFC("Copia simple de Cédula del Registro Federal de Contribuyentes ó constancia de Registro al RFC.");
        docs.setFacultadDeRepresentante("Copia simple de instrumento que acredite las facultades de su representante legal (si aplica).");
        docs.setFormatoMarcaChiapas("Ficha Técnica del producto a certificar debidamente requisitada. (formato proporcionado por Marca Chiapas)");
        docs.setRespaldo("Documentos que respalden características del producto y/o servicio.");
        docs.setNota("Nota: Anexo a estos documentos, debe entregarse el producto que aspira obtener el distintivo para la evaluación física en un comité.");
        req.setDocumentos(docs);
        req.setInfo2("Contamos con las siguientes ventanillas especializadas, selecciona la adecuada a su producto para conocer sus datos de contacto y ubicación.");
        
        VentanillasEspecializadas ven = new VentanillasEspecializadas();
        VentanillasEspecializadas.Ambar ambar = new VentanillasEspecializadas.Ambar();
        ambar.setComite("Instituto Casa de las Artesanías de Chiapas");
        ambar.setDireccion("Boulevard Belisario Domínguez No. 2320, Edificio Monteagud Nivel 6. Col. Residencial las Granjas");
        ambar.setCiudad("Tuxtla Gutiérrez");
        ambar.setCP(29030);
        ambar.setTelefono("(961) 60 2 97 99");
        ambar.setEmail("emailicasachiapas@gmail.com");
        ven.setAmbar(ambar);
        
        VentanillasEspecializadas.Alimento alimento = new VentanillasEspecializadas.Alimento();
        alimento.setComite("Secretaría de Economía");
        alimento.setDireccion("Torre Chiapas, Piso 15, Calz. Andrés Serra Rojas y Libramiento Norte, Tuxtla Gutiérrez, Chiapas");
        alimento.setTelefono("(961) 69 14700 exts. 66116, 66117 y 66118");
        alimento.setEmail("informacion@chiapasoriginal.com.mx");
        ven.setAlimento(alimento);
        
        VentanillasEspecializadas.Artesania artesania = new VentanillasEspecializadas.Artesania();
        artesania.setComite("Instituto Casa de las Artesanías de Chiapas");
        artesania.setDireccion("Boulevard Belisario Domínguez No. 2320, Edificio Monteagud Nivel 6. Col. Residencial las Granjas");
        artesania.setCiudad("Tuxtla Gutiérrez");
        artesania.setCP(29030);
        artesania.setTelefono("(961) 60 2 97 99");
        artesania.setEmail("emailicasachiapas@gmail.com");
        ven.setArtesania(artesania);
        
        VentanillasEspecializadas.Cafe cafe = new VentanillasEspecializadas.Cafe();
        cafe.setComite("Instituto Del Café de Chiapas");
        cafe.setDireccion("Carretera Juan Crispin-Chicoasen Km. 2.5");
        cafe.setCiudad("Tuxtla Gutiérrez");
        cafe.setCP(29000);cafe.setTelefono(" (961) 617 04 70");
        ven.setCafe(cafe);
        
        VentanillasEspecializadas.ServicioTuristico se_turis = new VentanillasEspecializadas.ServicioTuristico();
        se_turis.setComite("Secretaría de Turismo");
        se_turis.setDireccion("Torre Chiapas, Piso 5, Calz. Andrés Serra Rojas y Libramiento Norte, Tuxtla Gutiérrez, Chiapas");
        ven.setServicioTuristico(se_turis);
        
        //Todo guardar en DB
        
        req.setVentanillas(ven);
        req.setInfo3("Una vez ingresados los documentos, se continúa el proceso en cada ventanilla y dependiendo el tipo de producto o servicio a evaluar se canaliza a un comité especializado para su evaluación.");
        
        
        return req;
    }

    public org.netbeans.xml.schema.marcachiapasxmlschema.RegistroResponse marcaChiapasWSDLRegistroOperation(org.netbeans.xml.schema.marcachiapasxmlschema.FormularioRegistro formulario) {
        try {
            connetionDB();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RegistroResponse response = new RegistroResponse();
        
        if(guardarFormulario(formulario)){
            response.setResponse("La informacion de "+formulario.getDatosDelProductor().getNombreCompleto()+
                " fue guardada");
        }else{
            response.setResponse("No pudo guardarse la informacion");
        
        }
        
        
        return response;
    }

    public org.netbeans.xml.schema.marcachiapasxmlschema.ProductoresList marcaChiapasWSDLProductoresListOperation(org.netbeans.xml.schema.marcachiapasxmlschema.ProductoresRequest getProductores) {
        try {
            connetionDB();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        ProductoresList productores = new ProductoresList();
        
        List<DatosDelProductor> productoresl = new ArrayList<>();
        
        productoresl = listarProductores();
        
        for (DatosDelProductor productor : productoresl) {
            productores.getProductores().add(productor);
        }
        
        
        return productores;
    }

    public boolean marcaChiapasWSDLEliminarProductorOperation(java.lang.String folioProductor) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public org.netbeans.xml.schema.marcachiapasxmlschema.ProductorEncontrado marcaChiapasWSDLBuscarProductorOperation(java.lang.String idProductor) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    private void connetionDB() throws IllegalAccessException{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3188167?user=sql3188167&password=ArL36Mrtux");
        } catch (SQLException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private boolean guardarFormulario( FormularioRegistro formulario){
       
        int aut;
        
        if (formulario.getDatosDelProductor().isAutorizacionUsoCorreo()){
            aut = 1;
        }else{
            aut = 0;
        }
        
        String query = "INSERT INTO Datos_Productor(Folio,Nombre_Completo,CURP,Telefono_Fijo,Celular,Autorizacion_uso_Correo,Email) values(?,?,?,?,?,?,?);";
        System.out.println(query);
        
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conn.prepareStatement(query);
           
            preparedStatement.setString(1,UUID.randomUUID().toString());
            preparedStatement.setString(2,formulario.getDatosDelProductor().getNombreCompleto());
            preparedStatement.setString(3,formulario.getDatosDelProductor().getCURP());
            preparedStatement.setString(4,formulario.getDatosDelProductor().getTelefonoFijo());
            preparedStatement.setString(5,formulario.getDatosDelProductor().getCelular());
            preparedStatement.setInt(6,aut);
            preparedStatement.setString(7,formulario.getDatosDelProductor().getEmail());
            
            
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return true;
    }
    
    private List<DatosDelProductor> listarProductores(){
        List<DatosDelProductor> productores = new ArrayList<DatosDelProductor>();
        String query = "SELECT * FROM Datos_Productor;";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                DatosDelProductor productor = new DatosDelProductor();
                productor.setFolio(rs.getString("Folio"));
                productor.setNombreCompleto(rs.getString("Nombre_Completo"));
                productor.setCURP(rs.getString("CURP"));
                productor.setTelefonoFijo(rs.getString("Telefono_Fijo"));
                productor.setCelular(rs.getString("Celular"));
                productor.setEmail(rs.getString("Email"));
                boolean aut;
                if(rs.getInt("Autorizacion_uso_Correo") == 1){
                    aut = true;
                }else{
                    aut = false;
                }
                productor.setAutorizacionUsoCorreo(aut);
                productores.add(productor);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return productores;
    }
    
}
