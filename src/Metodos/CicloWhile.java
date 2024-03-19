
package Metodos;

import javax.swing.JOptionPane;

public class CicloWhile {
    
    private int num;

    public CicloWhile() {
    }
    
    public void numero_Par(){
        
        num = 1;
        
        while(num <=20 ){
            if (num%2 == 0){
                
                JOptionPane.showMessageDialog(null, num);
            }
            num++;
        }
    }
}//Fin Clase
