import java.applet.kullanicigirisi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class NewApplet extends kullanicigirisi implements ActionListener {

    String kuadý = "mesut";
    String kusifre = "123";
   
    Label adý = new Label("Adýnýzý girin:");
    TextField ad = new TextField(45);
    Label sfre = new Label("Þifrenizi yazýn:");
    TextField sifre = new TextField(45);
    Button tamam = new Button("kullanýcý giriþi");
    Button Sil = new Button("Sil");

    public void init() {
        add(adý);
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
            if (ad.getText().equals(kuadý) && sifre.getText().equals(kusifre)) {
                Mesaj="Baþarýlý Giriþ";
            } else {
                Mesaj="Baþarýsýz (Hatalý) Giriþ";
            }
           
            JOptionPane.showMessageDialog(null, Mesaj);

        }
        if (Olay.getSource() == Sil) {
            ad.setText("");
            sifre.setText("");
        }
    }
}
 