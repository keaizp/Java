import javax.swing.*;
import java.awt.*;

public class panelMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("测试窗口");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		//第一个JPanel，使用默认的浮动布局
		JPanel panel01 =new JPanel();
		panel01.add(new JLabel("用户名"));
		panel01.add(new JTextField(10));
		
		JPanel panel02 =new JPanel();
		panel02.add(new JLabel("密  码"));
		panel02.add(new JPasswordField(10));
		
		JPanel panel03 =new JPanel();
		panel03.add(new JButton("登录"));
		panel03.add(new JButton("注册"));
		
		Box vBox =Box.createVerticalBox();
		vBox.add(panel01);
		vBox.add(panel02);
		vBox.add(panel03);
		
		jf.setContentPane(vBox);
		jf.pack();
		jf.setVisible(true);
	}
}