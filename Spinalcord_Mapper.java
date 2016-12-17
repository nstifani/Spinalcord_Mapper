import ij.*;
import ij.process.*;
import ij.gui.*;
import ij.plugin.*;
import ij.text.TextWindow;
import ij.io.Opener;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.awt.image.IndexColorModel;


public class Spinalcord_Mapper implements PlugIn {
  String path = "/Macros/";
  static boolean showArgs = true;

  public void run(String arg) {
    String msg = "";
    if (arg.equals("SC Registration")){
      SC_Registration();
      return;
    }

    if (arg.equals("Cell Detection")){
      Cell_Detection();
      return;
    }

    if (arg.equals("Spinalcord Mapper Toggle Autostart")){
      Spinalcord_Mapper_Toggle_Autostart();
      return;
    }


  }


  void SC_Registration() {
    IJ.runMacro(getText(path+"SC_Registration.txt"), "");
  }
  void Cell_Detection() {
    IJ.runMacro(getText(path+"Cell_Detection.txt"), "");
  }
    void Spinalcord_Mapper_Toggle_Autostart() {
    IJ.runMacro(getText(path+"Spinalcord_Mapper_Toggle_Autostart.txt"), "");
  }





  //  Loads a text file from within a JAR file using getResourceAsStream().
  String getText(String path) {
    String text = "";
    try {
      // get the text resource as a stream
      InputStream is = getClass().getResourceAsStream(path);
      if (is==null) {
        IJ.showMessage("Spinalcord_Mapper", "File not found in JAR at "+path);
        return "";
      }
      InputStreamReader isr = new InputStreamReader(is);
      StringBuffer sb = new StringBuffer();
      char [] b = new char [8192];
      int n;
      //read a block and append any characters
      while ((n = isr.read(b)) > 0)
      sb.append(b,0, n);
      // display the text in a TextWindow
      text = sb.toString();
    }
    catch (IOException e) {
      String msg = e.getMessage();
      if (msg==null || msg.equals(""))
      msg = "" + e;
      IJ.showMessage("Spinalcord_Mapper", msg);
    }
    return text;
  }

}
