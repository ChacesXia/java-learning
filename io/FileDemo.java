// ��д������ʾָ��Ŀ¼�µ������ļ�Ŀ¼��������Ŀ¼��
// �û�����һ��·����
// ����һ���ݹ麯�����������·����û����Ŀ¼���г���Ŀ¼�б����ҵݹ����
// �����г���Ŀ¼�б����б�����Ŀ¼����Ŀ�������øõݹ麯����
// �û�����һ��·����
// �������ݹ麯����
//   1���ж�
import java.io.*;
import java.util.*;
public class FileDemo{
  public FileDemo(){
  }
  public static void main(String[] args) {
    // �г���ǰĿ¼�µ�������Ŀ¼
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