// 1������һ��JFrame
// 2��JFrameʹ��BorderLayout���֣���center��south
// 3��center��һ��JPanel��south��һ��JPanel
// 4��center��JPanel��һ��CardLayout���֡�
// 5��south������ť��ʵ����һҳ����һҳ

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
    JFrame frame = new JFrame("CardLayoutDemo by �ĳ�");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(600,400);

    // ����CardLayout���ֹ�����
    CardLayout cardLayout = new CardLayout();
    JPanel panel1 = new JPanel(cardLayout);

    // ��ͼƬ��ӵ�JLabel�ϣ�����JLabel��ӵ�panel1��
    for(int i =0;i<images.length;i++){
      JLabel label =new JLabel();
      label.setIcon(images[i]);
      panel1.add(label);
    }

    JPanel panel2 = new JPanel();

    frame.add(BorderLayout.CENTER,panel1);
    frame.add(BorderLayout.SOUTH,panel2);

    JButton btnPre=new JButton("��һҳ");
    JButton btnNext=new JButton("��һҳ");
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