package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Modelo.Contacto;
import Modelo.Enfermedades;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class VistaContactos implements iVistaContactos{

	@SuppressWarnings("unchecked")
	public VistaContactos(Stage primaryStage) throws IOException {
		TableView<Contacto> table;
		
		BorderPane border = new BorderPane();
		
		Scene scene = new Scene(border, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Info. Contactos");
        primaryStage.show();
        
      
    	
		
        //creamos una tabla y las columnas
        TableColumn<Contacto,String> columnaNombreCont=new TableColumn<>("Nombre del contacto") ; //<clase,tipo atributo>
        columnaNombreCont.setMaxWidth(200);
        columnaNombreCont.setCellValueFactory(new PropertyValueFactory<>("nombre_contacto")); //mismo nombre que la clase
        
        TableColumn<Contacto,String> columnaApellCont=new TableColumn<>("Apellido del contacto") ; //<clase,tipo atributo>
        columnaApellCont.setMaxWidth(200);
        columnaApellCont.setCellValueFactory(new PropertyValueFactory<>("apellido_contacto")); //mismo nombre que la clase
        
        TableColumn<Contacto,String> columnaTelef=new TableColumn<>("Telefono Fijo") ; //<clase,tipo atributo>
        columnaTelef.setMaxWidth(200);
        columnaTelef.setCellValueFactory(new PropertyValueFactory<>("telefono_fijo")); //mismo nombre que la clase
        
        TableColumn<Contacto,String> columnaTeleM=new TableColumn<>("Telefono celular") ; //<clase,tipo atributo>
        columnaTeleM.setMaxWidth(200);
        columnaTeleM.setCellValueFactory(new PropertyValueFactory<>("telefon_celular")); //mismo nombre que la clase
        
        TableColumn<Contacto,String> columnaEmail=new TableColumn<>("E-mail") ; //<clase,tipo atributo>
        columnaEmail.setMaxWidth(200);
        columnaEmail.setCellValueFactory(new PropertyValueFactory<>("e_mail")); //mismo nombre que la clase
        
        table =new TableView<>();
        table.setItems(getCont());
        table.getColumns().addAll(columnaNombreCont,columnaTelef,columnaTeleM,columnaEmail);
        
        border.setCenter(table);
        table.setEditable(true);}
      
        public ObservableList<Contacto>getCont() throws IOException{
   		 

  		  File f = new File ("src//application//Contactos");
  		  
  		  //System.out.println(url.getPath());
  		  FileReader fr =new FileReader(f);
  		  BufferedReader br = new BufferedReader(fr);
  		  
  		String line2="h h h h h";
    	String delim2=" ";
    	String[] tokens2 = line2.split(delim2);
  		  System.out.println(tokens2[0]+tokens2[1]+tokens2[2]+tokens2[3]+tokens2[4]);
  		  
        	ObservableList<Contacto> enf =FXCollections.observableArrayList();
        	String line;
        	String delim=" ";
        	while ((line=br.readLine())!=null ) {
        	String[] tokens = line.split(delim);
  			enf.add(new Contacto(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]));
  		}
        	return enf;
        }
        
        
		
	

	@Override
	public void LeerArchivoContactos(Stage primaryStage) throws IOException {
		
		
	}

}
