package application;

import java.io.IOException;

import controlador.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VistaLog implements iVistaLog{

	@Override
	public String getClaveUsuario() {
			
		return null;
	}

	
	@Override
	public void start(Stage primaryStage) {
		Controlador micontrolador = new Controlador();
		primaryStage.setTitle("Ingrese Clave");
        primaryStage.show();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 0, 0, 0));

        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);
        
        
        Text scenetitle = new Text("Bienvenido, ingrese su clave");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 3, 1); 										//columna 0 fila 0 column span 2 row span 1

        
               
        Label pw = new Label("Clave:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        //boton
        
        Button btn = new Button("Aceptar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 2);
        
        //texto de comprobacion
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 4);
        
        //Boton Emergencia
        Image imageOk = new Image(getClass().getResourceAsStream("emergencia.jpg"),100,80,false,false);
        //texto Emergencia
        final Text actiontarget2 = new Text();
        grid.add(actiontarget2, 0, 7,1,1);
        Button button3 = new Button("", new ImageView(imageOk));
        grid.add(button3,1, 7,1,1);
        actiontarget2.setText("Info. Emergencia");
        
        //Boton Contacto
        Image imageOk2 = new Image(getClass().getResourceAsStream("contacto.png"),100,80,false,false);
        //texto Contacto
        final Text actiontarget3 = new Text();
        grid.add(actiontarget3, 2, 7,1,1);     
        Button button4 = new Button("", new ImageView(imageOk2));
        grid.add(button4,3, 7,1,1);
        actiontarget3.setText("Info. Contacto");
        
        
        //actionDelBotonAceptar
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
            	try {
					if (micontrolador.ComprobarClave(pwBox.getText())==false){
						System.out.println(pwBox.getText());
						actiontarget.setFill(Color.FIREBRICK);
		                actiontarget.setText("Clave Incorrecta");
					}
					else {
						Menu_Principal mp= new Menu_Principal();
						Stage secondstage =new Stage();
						primaryStage.close();
						mp.start(secondstage);
					}
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
            	
                
            }
        });
        
        //Action del Boton emergencia
        button3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Stage tercStage = new Stage();
				try {
					VistaEmergencia ve =new VistaEmergencia(tercStage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
        	
        	
        
        });
      //Action del Boton Contactos
        button4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Stage cuartStage = new Stage();
				try {
					VistaContactos vc =new VistaContactos(cuartStage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
        	
        	
        
        });
        
        
	}
	
	
	
}
