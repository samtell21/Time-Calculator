/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.calculater;

/**
 *
 * @author Sam
 */
import javax.swing.JOptionPane;
public class TimeCalculater
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int m = 0;
        int s = 0;
        int cont = JOptionPane.YES_OPTION;
        while(cont == JOptionPane.YES_OPTION)
        {
            String ms = JOptionPane.showInputDialog("Enter Minutes");
                int mt = Integer.parseInt(ms);
            String ss = JOptionPane.showInputDialog("Enter Seconds");
                int st = Integer.parseInt(ss);
            m += mt;
            s += st;
            cont = JOptionPane.showConfirmDialog(null, "Another value?", null, JOptionPane.YES_NO_OPTION);
        }
        m += s/60;
        s = s%60;
        
        JOptionPane.showMessageDialog(null, m+" minutes and "+s+" seconds");
    }
    
}
