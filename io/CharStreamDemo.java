//1�������������ļ�����
//2������һ���ļ�����������
//3����������read���ַ�������
//4������һ���ļ�������������������д���ļ�����
import java.io.*;
import java.util.*;
public class CharStreamDemo{
	public static void copy(String pathname1,String pathname2) throws IOException{
		// �����ļ�����
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		// �����ļ�������
		// FileReader input = new FileReader(file1);
		String s="";
		String temp = "";
		BufferedReader input = new BufferedReader(new FileReader(file1));
		BufferedWriter output = new BufferedWriter(new FileWriter(file2));
		StringBuilder out = new StringBuilder();
		while((temp = input.readLine()) != null){
			out.append(temp + "\n");
		}
		input.close();
		// System.out.println(out);
		String out2 = new String(out,"GBK");
		output.write(out.toString());
		output.close();

		System.out.println("������ɣ�"+out.length()+"kb");
	}
	public static void main(String[] args) throws IOException{
		// ������ʱ�������ļ�·��
		copy(args[0],args[1]);
	}
}