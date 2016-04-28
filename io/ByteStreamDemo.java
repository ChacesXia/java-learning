//1、创建两个个文件对象
//2、创建一个文件对象输入流
//3、将输入流read到字符数组中
//4、创建一个文件对象输出流，将输出流写到文件二中
import java.io.*;
import java.util.*;
public class ByteStreamDemo{
	public static void copy(String pathname1,String pathname2) throws IOException{
		// 创建文件对象
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		// 创建文件流对象
		FileInputStream input = new FileInputStream(file1);
		FileOutputStream output = new FileOutputStream(file2);
		String s="";
		// 创建字节数组
		byte[] len = new byte[input.available()];
		input.read(len);
		output.write(len);
		// 关闭连接
		input.close();
		output.close();
		System.out.println("复制完成："+len.length+"kb");
	}
	public static void main(String[] args) throws IOException{
		// 在运行时候输入文件路径
		copy(args[0],args[1]);
	}
}