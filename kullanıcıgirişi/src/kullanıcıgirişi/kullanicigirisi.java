import java.applet.kullanicigirisi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class NewApplet extends kullanicigirisi implements ActionListener {

    String kuad� = "mesut";
    String kusifre = "123";
   
    Label ad� = new Label("Ad�n�z� girin:");
    TextField ad = new TextField(45);
    Label sfre = new Label("�ifrenizi yaz�n:");
    TextField sifre = new TextField(45);
    Button tamam = new Button("kullan�c� giri�i");
    Button Sil = new Button("Sil");

    public void init() {
        add(ad�);
        add(ad);
        add(sfre);
        add(sifre);
        add(tamam);
        tamam.addActionListener(this);
        add(Sil);
        Sil.addActionListener(this);

    }

    public void actionPerformed(ActionEvent Olay) {
       
        String Mesaj;
       
        if (Olay.getSource() == tamam) {
            if (ad.getText().equals(kuad�) && sifre.getText().equals(kusifre)) {
                Mesaj="Ba�ar�l� Giri�";
            } else {
                Mesaj="Ba�ar�s�z (Hatal�) Giri�";
            }
           
            JOptionPane.showMessageDialog(null, Mesaj);

        }
        if (Olay.getSource() == Sil) {
            ad.setText("");
            sifre.setText("");
        }
    }
}
 