// ��д������ʾָ��Ŀ¼�µ������ļ�Ŀ¼��������Ŀ¼��
// �õݹ�ʵ��
// �������п��������Զ����Ŀ¼��Ĭ��Ŀ¼Ϊ����ǰ�ļ����ڵ�Ŀ¼
// �Զ��������ṹΪ��java FileDemo2 ��Ŀ¼��
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
        // ������
        System.out.print(deep);
        System.out.print("��");
        for (int j =0; j<deep; j++) {
          System.out.print("��");
        }
        System.out.println(newfile);
        // �ݹ����
        tree(newfile,treeDeep);
      }
    }
    treeDeep--;
  }
}