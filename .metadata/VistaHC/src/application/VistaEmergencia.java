package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import Modelo.Enfermedades;
import Modelo.Ficha_identificacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VistaEmergencia implements iVistaEmergencia{

	@SuppressWarnings("unchecked")
	public VistaEmergencia(Stage primaryStage) throws IOException {
		TableView<Enfermedades> table;
		TableView<Ficha_identificacion> table2;
	
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5); //separacion de las columnas
		grid.setVgap(0);
		grid.setPadding(new Insets(0, 0, 0, 0));
		
		
		Scene scene = new Scene(grid, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Info. Emergencia");
        primaryStage.show();
		
        //creamos una tabla y las columnas
        TableColumn<Enfermedades,String> columnaNombreEnf=new TableColumn<>("Enfermedad/Condicion") ; //<clase,tipo atributo>
        columnaNombreEnf.setMinWidth(100);
        columnaNombreEnf.setResizable(true);
        columnaNombreEnf.setCellValueFactory(new PropertyValueFactory<>("nombre_enf")); //mismo nombre que la clase
        
        TableColumn<Ficha_identificacion, String>columnCampo = new TableColumn<>("Campo ");
        columnCampo.setMinWidth(100);
        columnCampo.setPrefWidth(500);
        columnCampo.setResizable(true);
        columnCampo.setCellValueFactory(new PropertyValueFactory<>("campo")); //mismo nombre que la clase
        
        TableColumn<Ficha_identificacion, String>columnadatos = new TableColumn<>("Datos personales");
        columnadatos.setMinWidth(100);
        columnadatos.setPrefWidth(500);

        columnadatos.setResizable(true);
        columnadatos.setCellValueFactory(new PropertyValueFactory<>("dato")); //mismo nombre que la clase
        
        
        table =new TableView<>();
        table2 =new TableView<>();
        
        table.setItems(getEnf());
        table2.setItems(getFicha());
        
        
        table.getColumns().addAll(columnaNombreEnf);
        table2.getColumns().addAll(columnCampo,columnadatos);
        grid.add(table2, 0,0);
        grid.add(table, 1, 0);
        
        table.autosize();
        table2.autosize();
        table.setEditable(true);
      
      
        
        
		LeerArchivoEmergencia();
		LeerArchivoAntecedentes();
		
	}
	  public ObservableList<Enfermedades>getEnf() throws IOException{
		 

		  File f = new File ("src//application//Emergencias");
		  
		  //System.out.println(url.getPath());
		  FileReader fr =new FileReader(f);
		  BufferedReader br = new BufferedReader(fr);
		  
		  
		  
      	ObservableList<Enfermedades> enf =FXCollections.observableArrayList();
      	String line;
      	while ((line=br.readLine())!=null ) {
			enf.add(new Enfermedades(line));
		}
      	return enf;
      }
	
	  public ObservableList<Ficha_identificacion>getFicha() throws IOException{
			 

		  File f2 = new File ("src//application//FichaId");
		  
		  //System.out.println(url.getPath());
		  FileReader fr2 =new FileReader(f2);
		  BufferedReader br2 = new BufferedReader(fr2);
		  
		  
		  
      	ObservableList<Ficha_identificacion> fid =FXCollections.observableArrayList();
      	String line;
      	String delim =" ";
    	while ((line=br2.readLine())!=null ) {
      		
    		String[] tokens =line.split(delim); 
      		fid.add(new Ficha_identificacion(tokens[0],tokens[1]));
		}
      	return fid;
      }
	
	@Override
	public void LeerArchivoEmergencia() throws IOException {
		
	}

	@Override
	public void LeerArchivoAntecedentes() {
		
	}

	
		
}
