package ioDemo;
//1�������������ļ�����
//2������һ���ļ�����������
//3����������read���ַ�������
//4������һ���ļ�������������������д���ļ�����
import java.io.*;
public class FileDemo{
	public static void main(String[] args) throws IOException{
		String pathname1 = "test.txt";
		String pathname2 = "test2.txt";
		 File file1 = new File(pathname1);
		 File file2 = new File(pathname2);
		// String[] list = file.list();
		// Arrays.sort(list);
		// for(String item: list){
		// 	System.out.println(item);
		// }
		// System.out.println(file.exists());
		// // System.out.println(file.delete());
		// System.out.println(file.getTotalSpace());
		// System.out.println(file.getUsableSpace());
		// System.out.println(file.hashCode());
		// System.out.println(file.length());

		FileInputStream input = new FileInputStream(file1);
		FileOutputStream output = new FileOutputStream(file2);
		output.write(input.read());
//		input.read(new byte[]);
		input.close();
		output.close();
//		BufferedInputStream buff = new BufferedInputStream(file);
		System.out.println(input.read());
	}
}