package reduc;

import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Main {

  static final File DIR = new File("/home/david/Documents/octavo/RPYAA/reduccion/src/reduccion");
  static final String[] EXTEN = new String[]{"jpg","png","jpeg"};
  static final FilenameFilter IMG_FILTER = new FilenameFilter(){

    @Override
    public boolean accept(final File dir, final String name) {
      for(final String ext: EXTEN){
        return (name.endsWith("." + ext));
      }
      return false;
    }
  };

  public static void main(String[] args) {
    int procesos = Integer.parseInt(args[0]);
    if(DIR.isDirectory()){
      Reductor reduc = new Reductor(DIR.listFiles(IMG_FILTER),procesos);
      reduc.exec();
    }
  }
}
