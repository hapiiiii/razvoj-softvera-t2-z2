package ba.unsa.etf.rs.t2.z2;

import com.sun.javafx.scene.control.InputField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField informacija;
    public Label rezultat;

    public int sumaCifara(int broj) {

        int suma = 0;
        do {
            suma = suma + ((int) broj % 10);
            broj = (int) broj / 10;
        } while (broj != 0);
        return suma;
    }
    public void oke(ActionEvent actionEvent) {

        try{
            String unos = informacija.getText();
            if(Integer.parseInt(unos)<0) {rezultat.setText("broj je negativan !!");}else{
                int broj = Integer.parseInt(unos);
                String rez = new String();
                for (int i = 1; i <= broj; i++) {

                    if (i%sumaCifara(i)==0) {
                        rez =rez+i+ " ";
                    }
                }

                rezultat.setText(rez);}
        }catch (NumberFormatException erorr){
            rezultat.setText("unos nije broj");
        }
    }

}