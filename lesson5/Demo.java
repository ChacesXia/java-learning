import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;

import com.SwingConsole.SwingConsole;

class Demo extends JFrame{
  public Demo(){
    // setLayout();
    // setBorder();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    panel1.setLayout(new FlowLayout());
    panel1.add(new JScrollPane());
    panel1.add(new JButton("1"));
    panel1.add(new JButton("2"));
    panel1.add(new JButton("3"));
    panel1.add(new JButton("4"));

    panel2.setLayout(new BorderLayout());
    panel2.add(BorderLayout.CENTER,new JTextArea(30,40));

    // panel3.setLayout(new FlowLayout(4));
    // add(new JScrollPane(panel3));

    panel3.setLayout(new BorderLayout());

    panel3.add(new JButton("1"));

    panel2.add(BorderLayout.EAST,panel3);

    add(BorderLayout.NORTH,panel1);
    add(BorderLayout.CENTER,panel2);
  }
  public static void main (String[] args) {
    SwingConsole.run(new Demo(),800,400);
  }
}