// 创建一个jframe
// jframe上添加两个panel
// 左panel上添加列表
// 右边panel添加图片
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;


public class Dropdown{

  private JFrame frame;
  private JPanel panel1;
  private JPanel panel2;
  private JComboBox comboBox;
  private Icon [] images;
  private JLabel label;
  private JList lst;
  private String[] items={
    "image1","image2","image3","image4"
  };

  public Dropdown(){
    frame= new JFrame("By-Chaces");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
    frame.setSize(600,400);
    panel1=new JPanel();
    panel2=new JPanel();

    comboBox = new JComboBox();
    // 给comboBox添加项
    addItem();
    comboBox.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        int agr =((JComboBox)e.getSource()).getSelectedIndex();
        label.setIcon(images[agr]);
      }
    });
    images=new Icon[]{
      new ImageIcon(getClass().getResource("images/image1.png")),
      new ImageIcon(getClass().getResource("images/image2.png")),
      new ImageIcon(getClass().getResource("images/image3.gif")),
      new ImageIcon(getClass().getResource("images/image4.gif")),
    };

    panel1.add(comboBox);
    frame.add(BorderLayout.WEST,panel2);
    frame.add(BorderLayout.EAST,panel1);

    label = new JLabel();
    label.setIcon(images[0]);
    panel2.add(label);

    frame.setVisible(true);
  }
  private void addItem(){
    for (String s : items) {
      comboBox.addItem(s);
    }
  }

  public static void main(String[] args) {
    Dropdown dp = new Dropdown();
  }

}