package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    public void openLoginForm(ActionEvent event) throws IOException
    {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("AlbumMain.fxml"));
        Parent albumOpen=loader.load();
        Scene AlbumScene=new Scene(albumOpen);

        ControllerAlbum controller=loader.getController();


        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(AlbumScene);
        window.show();
    }

}



