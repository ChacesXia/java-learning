// 1.����һ�����ڣ�������壬�����������˽�����������������ŵ���壬�����ŵ����ڣ�ѡ���ʵ��Ĳ��ֹ�������
package com.chaces;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.util.concurrent.*;

class WindowDemo extends JFrame{
  JFrame frame;
  public WindowDemo(){

  }
  // ע��Ҫ�׳��쳣
  public static void main (String[] args)throws Exception{
    WindowDemo wd=new WindowDemo();
  // ����jframe��jlabel
    JFrame frame1=new JFrame("Jframe Window");
    JLabel label1=new JLabel("label1");
  // ���jlabel��jframe��
    frame1.add(label1);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(300,300);
    frame1.setVisible(true);

    TimeUnit.SECONDS.sleep(1);

    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        label1.setText("������invoke�е�����Ч��");
      }
    });

    // label1.setText("hey;It's Changed!");
  }
}