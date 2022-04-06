package saturday02;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Bey
 */
public class Bitcoin  implements Initializable{

      

    @FXML
    private Button playBtn;

    @FXML
    private Button pauseBtn;

    @FXML
    private Button stopBtn;

    @FXML
    private Button dashboardBtn;

    @FXML
    private Button exitBtn;


     Stage stage;
    Scene scene;
    Parent root;
      @FXML
    private MediaView view;
    private File file;
    private Media media;
     MediaPlayer mediaPlayer;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        
        file = new File("btc.mp4v"); 
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
    }
          
          
    @FXML
    void playVideo(ActionEvent event) {

        playBtn.setOnAction(actionEvent -> {
          mediaPlayer.play();
        });

    }

    @FXML
    void exitApp(ActionEvent event) {

    }

    @FXML
    void pauseVideo(ActionEvent event) {

    }

   
    
    @FXML
    void stopVideo(ActionEvent event) {

    }

    @FXML
  public void returntoDashboard(ActionEvent event) throws IOException {
        
         dashboardBtn.setOnAction(actionEvent -> {
              try {
                root = FXMLLoader.load(getClass().getResource("DashboardFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(Bitcoin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });

    }

    

}
