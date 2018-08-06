import javax.swing.*;
import java.awt.*;
public class labelMain{
	public static void main(String[]args){
	JFrame jf=new JFrame("测试窗口");
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	//创建内容面板，默认使用流式布局
	JPanel panel = new JPanel();
	
	//只显示文本
	JLabel label01 = new JLabel();
	label01.setText("Only Text");
	label01.setFont(new Font(null,Font.PLAIN,25));
	panel.add(label01);
	
	//只显示图片
	JLabel label02 =new JLabel();
	label02.setIcon(new ImageIcon("1.jpg"));
	panel.add(label02);
	
	//同时显示文本和图片
	JLabel label03 =new JLabel();
	label03.setText("文本和图片：");
	label03.setIcon(new ImageIcon("2.jpg"));
	label03.setHorizontalTextPosition(SwingConstants.CENTER);
	label03.setVerticalTextPosition(SwingConstants.BOTTOM);
	panel.add(label03);
	
	jf.setContentPane(panel);
	jf.pack();
	jf.setLocationRelativeTo(null);
	jf.setVisible(true);
	}
}