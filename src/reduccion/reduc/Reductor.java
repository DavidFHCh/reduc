package reduc;

import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;


public class Reductor {

  static int activos = 0;
  int procesos;
  File[] imgs;

  public Reductor(File[] imgs, int procesos) {
      this.procesos = procesos;
      this.imgs = imgs;
  }

  public synchronized static void  aumentarActivos(){
    Reductor.activos++;
  }

  public synchronized static void  disminuirActivos(){
    Reductor.activos--;
  }

  public void exec(){
      
  }

}
