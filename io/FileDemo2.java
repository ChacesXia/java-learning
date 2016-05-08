// 编写程序，显示指定目录下的所有文件目录及所有子目录。
// 用递归实现
// 程序运行可以输入自定义的目录、默认目录为：当前文件所在的目录
// 自定义的输入结构为：java FileDemo2 “目录”
import java.io.*;
import java.util.*;
public class FileDemo2{
  private static int treeDeep=0;
  public static void main(String[] args) {
    File filepath = new File(".");
    if (args.length==0) {
      tree(filepath,0);
    } else{
      filepath = new File(args[0]);
      tree(filepath,0);
    }  
  }
  public static void tree(File files,int deep){
    if (files.list()==null) {
      return ;
    } else{
      treeDeep++;
      String[] filelist = files.list();
      for (int i =0; i<filelist.length; i++) {
        File newfile = new File(files+"/"+filelist[i]);
        // 表格化输出
        System.out.print(deep);
        System.out.print("├");
        for (int j =0; j<deep; j++) {
          System.out.print("─");
        }
        System.out.println(newfile);
        // 递归调用
        tree(newfile,treeDeep);
      }
    }
    treeDeep--;
  }
}