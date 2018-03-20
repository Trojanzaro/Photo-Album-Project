package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ControllerAlbum {

    @FXML private ImageView imageViewer;

    @FXML
    private void selectImage(ActionEvent event)
    {
        FileUpload image=new FileUpload();
        image.chooseImage();
        Image imageObj = new Image(image.getFile().toURI().toString());
        imageViewer.setImage(imageObj);
    }



}
