// 1、创建一个JFrame
// 2、JFrame使用BorderLayout布局，有center和south
// 3、center是一个JPanel，south是一个JPanel
// 4、center的JPanel是一个CardLayout布局。
// 5、south两个按钮，实现上一页和下一页

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutDemo extends JFrame{
  private Icon[] images;
  public CardLayoutDemo(){
    images=new Icon[]{
      new ImageIcon(getClass().getResource("images/image1.png")),
      new ImageIcon(getClass().getResource("images/image2.png")),
      new ImageIcon(getClass().getResource("images/image3.gif")),
      new ImageIcon(getClass().getResource("images/image4.gif")),
    };
    JFrame frame = new JFrame("CardLayoutDemo by 夏晨");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(600,400);

    // 创建CardLayout布局管理器
    CardLayout cardLayout = new CardLayout();
    JPanel panel1 = new JPanel(cardLayout);

    // 将图片添加到JLabel上，并将JLabel添加到panel1上
    for(int i =0;i<images.length;i++){
      JLabel label =new JLabel();
      label.setIcon(images[i]);
      panel1.add(label);
    }

    JPanel panel2 = new JPanel();

    frame.add(BorderLayout.CENTER,panel1);
    frame.add(BorderLayout.SOUTH,panel2);

    JButton btnPre=new JButton("上一页");
    JButton btnNext=new JButton("下一页");
    btnPre.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        cardLayout.previous(panel1);
      }
    });
    btnNext.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        cardLayout.next(panel1);
      }
    });
    panel2.add(btnPre);
    panel2.add(btnNext);

    frame.setVisible(true);
  }
  public static void main(String[] args) throws Exception{
    CardLayoutDemo cld=new CardLayoutDemo();
  }
}