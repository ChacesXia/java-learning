//1�������������ļ�����
//2������һ���ļ�����������
//3����������read���ַ�������
//4������һ���ļ�������������������д���ļ�����
import java.io.*;
import java.util.*;
public class ByteStreamDemo{
	public static void copy(String pathname1,String pathname2) throws IOException{
		// �����ļ�����
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		// �����ļ�������
		FileInputStream input = new FileInputStream(file1);
		FileOutputStream output = new FileOutputStream(file2);
		String s="";
		// �����ֽ�����
		byte[] len = new byte[input.available()];
		input.read(len);
		output.write(len);
		// �ر�����
		input.close();
		output.close();
		System.out.println("������ɣ�"+len.length+"kb");
	}
	public static void main(String[] args) throws IOException{
		// ������ʱ�������ļ�·��
		copy(args[0],args[1]);
	}
}