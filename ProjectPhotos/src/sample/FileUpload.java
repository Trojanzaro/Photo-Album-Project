package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUpload {
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    private   File file;

    public void chooseImage()
    {

    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Select Image");

    FileChooser.ExtensionFilter imageFilter=new FileChooser.ExtensionFilter("Image Files","*.png","*.jpeg");

    fileChooser.getExtensionFilters().add(imageFilter);
    fileChooser.setSelectedExtensionFilter(imageFilter);



     file = fileChooser.showOpenDialog(null);
        //FileInputStream fin=new FileInputStream(file);

        while(file == null)
        {
            //System.out.println(file.getName());
            Alert alert=new Alert(Alert.AlertType.ERROR, "Invalid File type");
            alert.setTitle("ERROR 20");
            alert.showAndWait();
            file = fileChooser.showOpenDialog(null);
        }

    }
}
