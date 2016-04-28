package lession6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	private static JFrame frame;
	private static JPanel upPanel;
	private static JPanel leftPanel;
	private static JPanel rightPanel;
	private static BorderLayout bLayout;
	private static GridLayout gLayout;
	public double output = 0d;
	// 定义操作数和运算符
	public String num1="";
	public String num2="";
	int oprator; //操作符，1,2,3,4代表加减乘除
	private JButton b[] = new JButton[12];
	
//	构造方法
	public Calculator(){
		creatFrame("我的计算器");
	}
	public void creatFrame(String title){
		frame = new JFrame(title);
		
		bLayout =new BorderLayout();
		frame.setLayout(bLayout);
		creatUpPanel();
//		creatDownPanel();
		creatLeftPanel();
		creatRightPanel();
		frame.add(BorderLayout.NORTH, upPanel);
		frame.add(BorderLayout.CENTER, leftPanel);
		frame.add(BorderLayout.EAST, rightPanel);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
//	public void creatDownPanel(){
//		downPanel = new JPanel();
//		bLayout =new BorderLayout();
//		downPanel.setLayout(bLayout);
//		
//		creatLeftPanel();
//		creatRightPanel();
//		
//		downPanel.add(BorderLayout.WEST,leftPanel);
//		downPanel.add(BorderLayout.EAST,rightPanel);
//	}
	
	public void creatUpPanel(){
		upPanel = new JPanel();
		JLabel label = new JLabel("输出：");
		upPanel.add(BorderLayout.WEST,label);
		
	}	
	public JPanel creatLeftPanel(){
		gLayout = new GridLayout(4,3,15,10);
		leftPanel = new JPanel();
		leftPanel.setLayout(gLayout);
		for(int i=1;i<=9;i++){
			leftPanel.add(creatButton(i+"",i,3,3));
		}
		leftPanel.add(creatButton("0",0,3,3));
		return leftPanel;
	}	
	public JPanel creatRightPanel(){
		gLayout = new GridLayout(5,1);
		
		rightPanel = new JPanel();
		rightPanel.setLayout(gLayout);
		rightPanel.add(creatButton("+",3,3));
		rightPanel.add(creatButton("-",3,3));
		rightPanel.add(creatButton("x",3,3));
		rightPanel.add(creatButton("÷",3,3));
		rightPanel.add(creatButton("=",3,3));
		return rightPanel;
	}
	
	
	public JButton creatButton(String key,int value, int x, int y){
		JButton button = new JButton(key);
		button.addActionListener(this);
		return button;
	}
	// 重载createbutton
	public JButton creatButton(String key, int x, int y){
		JButton button = new JButton(key);
		button.addActionListener(this);
		return button;
	}
//	事件监听
	public void actionPerformed (ActionEvent e){
		switch(e.getActionCommand()){
			case "+":
				System.out.println(num1);
//				num2 +=e.getActionCommand();
//				output = Integer.parseInt(num1)+Integer.parseInt(num2); break;
			case "-": 
				num2 +=e.getActionCommand();
				output = Integer.parseInt(num1)-Integer.parseInt(num2); break;
			case "x":
				num2 +=e.getActionCommand();
				output = Integer.parseInt(num1)*Integer.parseInt(num2); break;
			case "÷": 
				num2 +=e.getActionCommand();
				output = Integer.parseInt(num1)/Integer.parseInt(num2); break;
			default:
				num1+=e.getActionCommand();
				System.out.println(num1);
				break;
			
		}
		
	}
	
	public static void main(String[] args) {
		// 创建一个实例
		Calculator ca =new Calculator();
	}

}
