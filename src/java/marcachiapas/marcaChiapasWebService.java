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
            if (conn == null){
                connetionDB();
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RegistroResponse response = new RegistroResponse();
        
        if(guardarFormulario(formulario)){
            response.setResponse("La informacion de "+formulario.getDatosDelProductor().getNombreCompleto()+
                " fue guardada"+"\nSu folio es: "+formulario.getDatosDelProductor().getFolio());
        }else{
            response.setResponse("No pudo guardarse la informacion");
        
        }
        
        
        return response;
    }

    public org.netbeans.xml.schema.marcachiapasxmlschema.ProductoresList marcaChiapasWSDLProductoresListOperation(org.netbeans.xml.schema.marcachiapasxmlschema.ProductoresRequest getProductores) {
        try {
            if (conn == null){
                connetionDB();
            }
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
        try {
            if (conn == null){
                connetionDB();
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean result = (eliminarProductor(folioProductor)) ? true:false;
        
        
        return result;
    }

    public org.netbeans.xml.schema.marcachiapasxmlschema.ProductorEncontrado marcaChiapasWSDLBuscarProductorOperation(java.lang.String idProductor) {
        try {
            connetionDB();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProductorEncontrado encontrado = new ProductorEncontrado();
        encontrado.setDatosProductor(buscarProductor(idProductor)); 
        return encontrado;
    }
    private boolean eliminarProductor(String folio){
        if(buscarProductor(folio) != null){
            String query = "DELETE FROM Datos_Productor WHERE Folio = '"+folio+"';";
            try {
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
                
                query = "DELETE FROM Datos_Empresa WHERE Folio = '"+folio+"';";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
                
                query = "DELETE FROM Diagnostico_Inicial WHERE Folio = '"+folio+"';";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
                
                query = "DELETE FROM Mercado WHERE Folio = '"+folio+"';";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
                
                query = "DELETE FROM Relacion_con_Marca_Chiapas WHERE Folio = '"+folio+"';";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        
        return false;
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
       
        String Folio = UUID.randomUUID().toString();
        formulario.getDatosDelProductor().setFolio(Folio);
        String AnalisisFodaId = UUID.randomUUID().toString();
        String queryInserDatosProductor = "INSERT INTO Datos_Productor(Folio,Nombre_Completo,CURP,Telefono_Fijo,Celular,Autorizacion_uso_Correo,Email) values(?,?,?,?,?,?,?);";
        String queryInserDatosEmpresa = "INSERT INTO Datos_Empresa(Folio,Razon_Social,P_Fiscal,P_Moral,RFC,Domicilio,Municipio,Ciudad,Estado,Telefono_o_Fax,Pagina_Web,Facebook,Twitter,Planta_de_Produccion,Planta_Direccion) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        String queryInserDiagnosticoInicial = "INSERT INTO Diagnostico_Inicial(Folio,Nombre_Comercial,Categoria,Marca_Registrada,Empleos_Generados,Directos_H,Directos_M,Indirectos_H,Indirectos_M,Sector,Analisis_Foda_Id,Mision,Vision,Primero_Años_de_la_Empresa) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        String queryMercado = "INSERT INTO Mercado(Folio,Definicion_del_Mercado,Posicion_de_la_Empresa,Principales_Competidores) values(?,?,?,?);";
        String queryRelacionMarcaChiapas = "INSERT INTO Relacion_con_Marca_Chiapas(Folio,EnQuePuedeAyudarMarcaChiapasASuEMpresa,ComoPudeSuEmpresaAyudarAMarcaChiapas) values(?,?,?);";
        
        PreparedStatement preparedStatement;
        
        try {
            preparedStatement = conn.prepareStatement(queryInserDatosProductor);
           
            preparedStatement.setString(1,Folio);
            preparedStatement.setString(2,formulario.getDatosDelProductor().getNombreCompleto());
            preparedStatement.setString(3,formulario.getDatosDelProductor().getCURP());
            preparedStatement.setString(4,formulario.getDatosDelProductor().getTelefonoFijo());
            preparedStatement.setString(5,formulario.getDatosDelProductor().getCelular());
            int aut = (formulario.getDatosDelProductor().isAutorizacionUsoCorreo()) ? 1:0;
            preparedStatement.setInt(6,aut);
            preparedStatement.setString(7,formulario.getDatosDelProductor().getEmail());
            
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(marcaChiapasWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        // inserta datos de la empresa
        //Folio,Razon_Social,P_Fiscal,P_Moral,RFC,Domicilio,Municipio,Ciudad,Estado,Telefono_o_Fax,Pagina_Web,Facebook,Twitter,Planta_de_Produccion,Planta_Direccion
        try {
            preparedStatement = conn.prepareStatement(queryInserDatosEmpresa);
            
            preparedStatement.setString(1, Folio);
            preparedStatement.setString(2, formulario.getDatosEmpresa().getRazonSocial());
            int pFiscal= (formulario.getDatosEmpresa().isPFisica()) ? 1:0;
            preparedStatement.setInt(3, pFiscal);
            int pMoral = (formulario.getDatosEmpresa().isPMoral()) ? 1:0;
            preparedStatement.setInt(4, pMoral);
            preparedStatement.setString(5, formulario.getDatosEmpresa().getRFC());
            preparedStatement.setString(6, formulario.getDatosEmpresa().getDomicilio());
            preparedStatement.setString(7, formulario.getDatosEmpresa().getMunicipio());
            preparedStatement.setString(8, formulario.getDatosEmpresa().getCiudad());
            preparedStatement.setString(9, formulario.getDatosEmpresa().getEstado());
            preparedStatement.setString(10, formulario.getDatosEmpresa().getTelefonoOFax());
            preparedStatement.setString(11, formulario.getDatosEmpresa().getPaginaWeb());
            preparedStatement.setString(12, formulario.getDatosEmpresa().getFacebook());
            preparedStatement.setString(13, formulario.getDatosEmpresa().getTwitter());
            String Direccion="";
            if (formulario.getDatosEmpresa().getPlataDeProduccion().getSi().isSi()) {
                Direccion = formulario.getDatosEmpresa().getPlataDeProduccion().getSi().getDireccion();
                preparedStatement.setInt(14, 1);
            }else{
                preparedStatement.setInt(14, 0);
            }
            preparedStatement.setString(15, Direccion);
            preparedStatement.execute();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        
        
        //Inserta datos del diagnostico inicial
        //Folio,Nombre_Comercial,Categoria,Marca_Registrada,Empleos_Generados,Directos_H,Directos_M,Indirectos_H,Indirectos_M,Sector,Analisis_Foda_Id,Mision,Vision,Primero_Años_de_la_Empresa
        try {
            preparedStatement = conn.prepareStatement(queryInserDiagnosticoInicial);
            preparedStatement.setString(1, Folio);
            preparedStatement.setString(2, formulario.getDiagnosticoInicial().getNombreComercialYOMR());
            String categoria = "";
            if(formulario.getDiagnosticoInicial().getCategoria().isMicro()){
                categoria = "Micro";
                
            }else if(formulario.getDiagnosticoInicial().getCategoria().isPequeña()){
                categoria = "Pequeña";
            }else if(formulario.getDiagnosticoInicial().getCategoria().isMediana()) {
                categoria = "Mediana";
            }
            preparedStatement.setString(3, categoria);
            int marcaRegistrada = (formulario.getDiagnosticoInicial().isMarcaRegistrada()) ? 1:0;
            preparedStatement.setInt(4, marcaRegistrada);
            preparedStatement.setInt(5, formulario.getDiagnosticoInicial().getEmpleosGenerados());
            preparedStatement.setInt(6, formulario.getDiagnosticoInicial().getDirectos().getH());
            preparedStatement.setInt(7, formulario.getDiagnosticoInicial().getDirectos().getM());
            preparedStatement.setInt(8, formulario.getDiagnosticoInicial().getIndirectos().getH());
            preparedStatement.setInt(9, formulario.getDiagnosticoInicial().getIndirectos().getM());
            String sector ="";
            if(formulario.getDiagnosticoInicial().getSector().isAlimentos()){
                sector = "Alimentos";               
            }else if (formulario.getDiagnosticoInicial().getSector().isAmbar()){
                sector = "Ambar";
            }else if (formulario.getDiagnosticoInicial().getSector().isArtesanias()){
                sector = "Artesanias";
            }else if (formulario.getDiagnosticoInicial().getSector().isCafe()){
                sector = "Cafe";
            }else {
                sector = formulario.getDiagnosticoInicial().getSector().getOtro();
            }
            
            preparedStatement.setString(10, sector);
            preparedStatement.setString(11, AnalisisFodaId);
            preparedStatement.setString(12, formulario.getDiagnosticoInicial().getMision());
            preparedStatement.setString(13, formulario.getDiagnosticoInicial().getVision());
            preparedStatement.setString(14, formulario.getDiagnosticoInicial().getCuentanosDeLosPrimerosAñosDeLaEmpresa());
            preparedStatement.execute();

            //Analisis Foda
            String Foda_Amenazas="INSERT INTO Foda_Amenazas(Analisis_Foda_Id,Amenaza1,Amenaza2,Amenaza3,Amenaza4,Amenaza5) values(?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(Foda_Amenazas);
            ps.setString(1, AnalisisFodaId);
            int cont = 2;
            List<DiagnosticoInicial.AnalisisFoda.Amenazas> as = formulario.getDiagnosticoInicial().getAnalisisFoda().getAmenazas();
            for (DiagnosticoInicial.AnalisisFoda.Amenazas amenaza : as) {
                ps.setString(cont, amenaza.getAmenaza());
                cont++;
            }
            ps.execute();
            
            String Foda_Debilidades="INSERT INTO Foda_Debilidades(Analisis_Foda_Id,Debilidad1,Debilidad2,Debilidad3,Debilidad4,Debilidad5) values(?,?,?,?,?,?);";
            ps = conn.prepareStatement(Foda_Debilidades);
            cont = 2;
            ps.setString(1, AnalisisFodaId);
            for (DiagnosticoInicial.AnalisisFoda.Debilidades debilidade : formulario.getDiagnosticoInicial().getAnalisisFoda().getDebilidades()) {
                ps.setString(cont, debilidade.getDebilidad());
                cont++;
            }
            ps.execute();
            
            String Foda_Fortalezas="INSERT INTO Foda_Fortalezas(Analisis_Foda_Id,Fortaleza1,Fortaleza2,Fortaleza3,Fortaleza4,Fortaleza5) values(?,?,?,?,?,?);";
            ps = conn.prepareStatement(Foda_Fortalezas);
            ps.setString(1, AnalisisFodaId);
            cont = 2;
            for (DiagnosticoInicial.AnalisisFoda.Fortalezas fortalezas : formulario.getDiagnosticoInicial().getAnalisisFoda().getFortalezas()) {
                ps.setString(cont, fortalezas.getFortaleza());
                cont++;
            }
            ps.execute();
            
            String Foda_Oportunidades="INSERT INTO Foda_Oportunidades(Analisis_Foda_Id,Oportunidad1,Oportunidad2,Oportunidad3,Oportunidad4,Oportunidad5) values(?,?,?,?,?,?);";
            ps = conn.prepareStatement(Foda_Oportunidades);
            ps.setString(1, AnalisisFodaId);
            cont = 2;
            for (DiagnosticoInicial.AnalisisFoda.Oportunidades oportunidades : formulario.getDiagnosticoInicial().getAnalisisFoda().getOportunidades()) {
                ps.setString(cont, oportunidades.getOportunidad());
                cont++;
            }
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Inserta Datos del mercado
        try {
            preparedStatement = conn.prepareStatement(queryMercado);
            preparedStatement.setString(1, Folio);
            preparedStatement.setString(2, formulario.getMercado().getDefinicionDelMercado());
            preparedStatement.setString(3, formulario.getMercado().getPosicionDeLaEmpresa());
            preparedStatement.setString(4, formulario.getMercado().getPrincipalesCompetidores());
            preparedStatement.execute();
        } catch (Exception e) {
        }
        
        //Inserta datos de la relacion con marca chiapas
        try {
            preparedStatement = conn.prepareStatement(queryRelacionMarcaChiapas);
            preparedStatement.setString(1, Folio);
            preparedStatement.setString(2, formulario.getRelacionConMarcaChiapas().getEnQuePuedeAyudarMarcaChiapasASuEmpresa());
            preparedStatement.setString(3, formulario.getRelacionConMarcaChiapas().getComoPuedeSuEmpresaAyudarAMarcaChiapas());
            preparedStatement.execute();
        } catch (Exception e) {
        }
        
        return true;
    }
    private DatosDelProductor buscarProductor(String folio){
        String query = "SELECT * FROM Datos_Productor WHERE Folio='"+folio+"';";
        PreparedStatement ps;
        DatosDelProductor productor = null;
        
        try {
            ps = conn.prepareStatement(query);
            //ps.setString(1, folio);
            
            ResultSet rs = ps.executeQuery();
            if(rs.first()){
                productor = new DatosDelProductor();
                productor.setFolio(rs.getString("Folio"));
                productor.setNombreCompleto(rs.getString("Nombre_completo"));
                productor.setCURP(rs.getString("CURP"));
                productor.setTelefonoFijo(rs.getString("Telefono_Fijo"));
                productor.setCelular(rs.getString("Celular"));
                boolean aut = (rs.getInt("Autorizacion_uso_Correo") == 1) ? true:false;
                productor.setAutorizacionUsoCorreo(aut);
                productor.setEmail(rs.getString("Email"));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productor;
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
