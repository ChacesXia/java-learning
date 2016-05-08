// 编写程序，显示指定目录下的所有文件目录及所有子目录。
// 用户输入一个路径；
// 创建一个递归函数；当输入的路径下没有子目录，列出该目录列表，并且递归结束
// 否则，列出该目录列表，对列表中是目录的项目继续调用该递归函数；
// 用户输入一个路径；
// 如果进入递归函数：
//   1、判断
import java.io.*;
import java.util.*;
public class FileDemo{
  public FileDemo(){
  }
  public static void main(String[] args) {
    // 列出当前目录下的所有子目录
    File filepath =new File(".");
    ArrayList al = search(filepath,new ArrayList<File>());
    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
  }
  public static ArrayList<File> search(File filepath,ArrayList<File> result){
    File[] files = filepath.listFiles();
    if (files==null) {
      return result;
    }
    for (File file :files ) {
      if(file.isDirectory()){
        result.add(file);
        search(file,result);
      }else {
        result.add(file);
      }
    }
    return result;
  }
}