import java.io.*;
import java.util.*;
class F{
  public static void main(String[] args) {
    File filepath =new File(".");
    tree(filepath);
    }
  }
  public static void tree(File files){
    if (files.length()==0) {
      System.out.println(files);
    } else{
      for (int i =0; i<files.length(); i++) {
        System.out.println(files[i].getPath());
        tree(files[i]);
      }
    }
  }
}