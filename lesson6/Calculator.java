import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
  private JPanel upPanel = new JPanel();
  private JPanel rightPanel = new JPanel();
  private JTextField t1;
//  private JLabel label;
  
  StringBuffer str;
//   ����������������
  double x,y;
  int oprator; //��������1,2,3,4����Ӽ��˳�
  private JButton b[] = new JButton[12];
  private JButton op[] = new JButton[8]; //�������ܰ�ť
  
//  ���췽��
  public Calculator(){
    super("�ҵļ�����By-chaces");
    Container c = getContentPane();
    
    t1 = new JTextField(30);  
        t1.setEditable(false);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        str = new StringBuffer();
//        ����ı������
        upPanel.add(t1);
        upPanel.setLayout(new GridLayout(4,1));
//    ��Ӽ�����
    for(int i=0;i<10;i++){
      b[i]=new JButton(""+i);
      b[i].addActionListener(this);
    }
//    ʵ������ť
    b[10]= new JButton("-/+");  b[11]= new JButton(".");  
        op[0]= new JButton("/");       op[1]= new JButton("Back");  
        op[2]= new JButton("*");       op[3]= new JButton("C");  
        op[4]= new JButton("+");       op[5]= new JButton("Sqrt");  
        op[6]= new JButton("-");       op[7]= new JButton("="); 
//     ���ǰ��ɫ
        for(int i=0;i<12;i++)  
        {  
            b[i].setForeground(Color.blue);  
        }
        
//        ��ӵ����
        rightPanel.add(b[7]); rightPanel.add(b[8]); rightPanel.add(b[9]); rightPanel.add(op[0]); rightPanel.add(op[1]);  
        rightPanel.add(b[4]); rightPanel.add(b[5]); rightPanel.add(b[6]); rightPanel.add(op[2]); rightPanel.add(op[3]);  
        rightPanel.add(b[1]); rightPanel.add(b[2]); rightPanel.add(b[3]); rightPanel.add(op[4]); rightPanel.add(op[5]);  
        rightPanel.add(b[0]); rightPanel.add(b[10]); rightPanel.add(b[11]);rightPanel.add(op[6]);rightPanel.add(op[7]);  
        rightPanel.setLayout(new GridLayout(4,5,5,5));  
//        ��Ӽ�����
        b[10].addActionListener(this);  b[11].addActionListener(this); 
        for(int i=0;i<op.length;i++){
          op[i].addActionListener(this);
        }
//        ��panel��ӵ�container��
        c.add(upPanel);  
        c.add(rightPanel); 
        c.setLayout(new FlowLayout());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô��ڹرն���  
        setVisible(true);   //����Ϊ�ɼ�  
        setResizable(false); //��ֹ������ܴ�С  
        setSize(400,300);   //���ô��ڴ�С  
  }


//  �¼�����
  public void actionPerformed (ActionEvent e){
    if(e.getSource()==op[3]){
//      ���
      clear();
    }else if(e.getSource()==b[10]){
//      ȡ��
      reverse();
    }else if(e.getSource()==op[4]){
//      �ӷ�
      plus();
    }else if(e.getSource()==op[6]){
//      ����
      minus();
    }else if(e.getSource()==op[2]){
//      �˷�
      multiply();
    }else if(e.getSource()==op[0]){
//      ����
      division();
    }else if(e.getSource()==op[7]){
//      ����
      ab();
    }else if(e.getSource()==op[5]){
//      ��ƽ����   
           sqrt();
        }else{
          if(e.getSource()==b[0]){  
//            ѡ����0
                if(t1.getText().trim().equals("0")){}  
                else  t1.setText(str.append(e.getActionCommand()).toString());  
                y=Double.parseDouble(t1.getText().trim());   
            }
            else if (e.getSource()==op[1]){
//              back
                if(!t1.getText().trim().equals("0")){
                  if(str.length()!=1){   
                      t1.setText(str.delete(str.length()-1,str.length()).toString());   
                  }else{   
                    str.setLength(0);   
                  }
                }   
                y=Double.parseDouble(t1.getText().trim());   
            }
            else{
              t1.setText(str.append(e.getActionCommand()).toString());
          y=Double.parseDouble(t1.getText().trim());
            }
    }
  }
  public void sqrt(){
     x=Double.parseDouble(t1.getText().trim());   
         if(x<0)  
         {  
             t1.setText("error");  
         }  
         else  
         {  
             t1.setText(""+Math.sqrt(x));  
         }  
         str.setLength(0);  
         y=0;  
  }
  public void ab(){
    str.setLength(0);  
        switch(oprator)  
        {  
            case 0: t1.setText(""+(x+y));break;
            case 1: t1.setText(""+(x-y));break;
            case 2: t1.setText(""+(x*y));break;
            case 3: t1.setText(""+(x/y));break;
        }
  }
  public void division(){
    x=Double.parseDouble(t1.getText().trim());  
        str.setLength(0);
        y=0;
        oprator=3; 
  }
  public void multiply(){
    x=Double.parseDouble(t1.getText().trim());  
        str.setLength(0);
        y=0;
        oprator=2;
  }
  public void minus(){
    x=Double.parseDouble(t1.getText().trim());  
        str.setLength(0);  
        y=0d;  
        oprator=1; 
  }
  public void plus(){
    x=Double.parseDouble(t1.getText().trim());
    str.setLength(0);
    y=0d;
    oprator=0;
  }
  public void clear(){
    t1.setText("0");
    str.setLength(0);
  } 
  public void reverse(){
    x=Double.parseDouble(t1.getText().trim());
    t1.setText(""+(-x));
//    str.setLength(0);
    
  }
  public static void main(String[] args) {
//    ����һ��ʵ��
    Calculator ca =new Calculator();
  }

}
