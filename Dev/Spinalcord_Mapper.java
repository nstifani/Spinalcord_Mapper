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
    if (arg.equals("Merge Images")){
      Merge_Images();
      return;
    }
    if (arg.equals("Normalize Intensity")){
      Normalize_Intensity();
      return;
    }
    if (arg.equals("Orient Images")){
      Orient_Images();
      return;
    }
    if (arg.equals("Align Images")){
      Align_Images();
      return;
    }
    if (arg.equals("Resize Images")){
      Resize_Images();
      return;
    }
    if (arg.equals("Simple Registration")){
      Simple_Registration();
      return;
    }
    if (arg.equals("Alignment and Registration")){
      Alignment_and_Registration();
      return;
    }
    if (arg.equals("Manual Cell Detection")){
      Manual_Cell_Detection();
      return;
    }
    if (arg.equals("Auto Cell Detection")){
      Auto_Cell_Detection();
      return;
    }
    if (arg.equals("Spinalcord Mapper Toggle Autostart")){
      Spinalcord_Mapper_Toggle_Autostart();
      return;
    }


  }

  void Merge_Images() {
    IJ.runMacro(getText(path+"Merge_Images.txt"), "");
  }
  void Normalize_Intensity() {
    IJ.runMacro(getText(path+"Normalize_Intensity.txt"), "");
  }
  void Orient_Images() {
    IJ.runMacro(getText(path+"Orient_Images.txt"), "");
  }
  void Align_Images() {
    IJ.runMacro(getText(path+"Align_Images.txt"), "");
  }
  void Resize_Images() {
    IJ.runMacro(getText(path+"Resize_Images.txt"), "");
  }
  void Simple_Registration() {
    IJ.runMacro(getText(path+"Simple_Registration.txt"), "");
  }
  void Alignment_and_Registration() {
    IJ.runMacro(getText(path+"Alignment_and_Registration.txt"), "");
  }
  void Manual_Cell_Detection() {
    IJ.runMacro(getText(path+"Manual_Cell_Detection.txt"), "");
  }
  void Auto_Cell_Detection() {
    IJ.runMacro(getText(path+"Auto_Cell_Detection.txt"), "");
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
