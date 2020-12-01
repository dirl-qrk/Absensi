/*

* To change this template, choose Tools | Templates

* and open the template in the editor.

*/

package siakadsmk;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import javax.swing.JOptionPane;

/**

*

* @author OnyOn IaK

*/

public class koneksi {

    public Properties myPanel, myLanguage;

    private String strNamaPanel;

    /** Creates a new instance of koneksi */

    public koneksi(){

}

public String SettingPanel(String nmPanel){

      try{

          myPanel = new Properties();

          myPanel.load(new FileInputStream("conn/koneksi.ini"));

          strNamaPanel = myPanel.getProperty(nmPanel);

      }catch (IOException e){

            JOptionPane.showMessageDialog(null,"Tidak Ada Koneksi","Error",JOptionPane.INFORMATION_MESSAGE);

            System.err.println(e.getMessage());

            System.exit(0);

      }

      return strNamaPanel;

      }

  }