/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author dam
 */
public class LibretaDirecciones extends Application {
     private Stage escenarioPrincipal;
     private BorderPane layoutPrincipal;
     private AnchorPane vistaPersona;
    @Override
    public void start(Stage primaryStage) {
      
       this.escenarioPrincipal=primaryStage;
       //cambio el titulo del escenario principal
       this.escenarioPrincipal.setTitle("Libreta de direcciones");
       
       //metodo que inicializa el layout principal
       initLayoutPrincipal();
       //muestra la lista persona
       muestraListaPersona();
    }
    
    public void initLayoutPrincipal(){
        //cargar con el layout principal
        FXMLLoader loader =new FXMLLoader();
        URL location=LibretaDirecciones.class.getResource(".../view/VistaPrincipal.fxml");
        loader.setLocation(location);
         try {
             layoutPrincipal=loader.load();
         } catch (IOException ex) {
             Logger.getLogger(LibretaDirecciones.class.getName()).log(Level.SEVERE, null, ex);
         }
        //cargo y muestro la escena que contiene ese layout principal
        Scene escena=new Scene(layoutPrincipal);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }
    
    public void muestraListaPersona(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
