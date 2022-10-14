package UTS;

import javax.swing.JOptionPane;
/**
 * Created by 21343003_Alkindi Syamsi
 * @author KINNN
 */
public class UTS3 {
    public static void main(String[]args){
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukan Angka");
        angka = Integer.parseInt(a);
        
        if (angka >=0){
            JOptionPane.showMessageDialog(null, "Angka"+angka+"Merupakan bilangan Positif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka"+angka+"Merupakan bilangan Negatif");

        }
    }
}