package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;


public class Controller {
    @FXML
    TextField text01;
    @FXML
    TextField text02;
    @FXML
    TextField Answer;
    int x,y;
    String arg01, arg02;

    public void execute(ActionEvent event){
        System.out.println("Outside try");
        try {
            String line;
            arg01 = text01.getText();
            arg02 = text02.getText();
            //rt.exec("E:\\SPL\\Button\\main.exe");
            System.out.println("Before pb");
            //System.out.println(arg01+arg02);
            Process process = new ProcessBuilder("E:\\SPL\\Button\\main.exe",arg01,arg02).start();
            System.out.println("After pb");
            InputStream is = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Answer.setText(line);
            }
            //process.waitFor();
            System.out.print("Process done");
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
