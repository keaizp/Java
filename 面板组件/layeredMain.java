import javax.swing.*;
import java.awt.*;

public class layeredMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane =new JLayeredPane();
		
		//层数:100
		JPanel panel_100_1 =createPanel(Color.RED,"L=100,p=1",30,30,100,100);
		layeredPane.add(panel_100_1,new Integer(100));
		
		//层数：200，层内位置：0（层内顶部）
		JPanel panel_200_0 =createPanel(Color.GREEN,"L=200,p=0",70,70,100,100);
		layeredPane.add(panel_200_0,new Integer(200),0);
		
		//层数：200，层内位置：1
		JPanel panel_200_1 =createPanel(Color.CYAN,"L=200,p=1",110,110,100,100);
		layeredPane.add(panel_200_1,new Integer(200),1);
		
		//层数：300
		JPanel panel_300 =createPanel(Color.YELLOW,"L=300",150,150,100,100);
		layeredPane.add(panel_300,new Integer(300));
		
		jf.setContentPane(layeredPane);
		jf.setVisible(true);
	}
	
	//创建一个面板容器
	private static JPanel createPanel(Color bg,String text,int x,int y,int width,int height){
		//创建一个JPanel，使用 1行 1列的网格布局
		JPanel panel =new JPanel(new GridLayout(1,1));
		
		//设置容器的位置和宽高
		panel.setBounds(x,y,width,height);
		
		//设置panel的背景
		panel.setOpaque(true);
		panel.setBackground(bg);
		
		//创建标签并设置相应属性
		JLabel label =new JLabel(text);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		panel.add(label);
		
		return panel;
	}
}