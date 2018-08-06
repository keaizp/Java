import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btn2Main{
	public static void main(String[]args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(200,200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		JPanel panel =new JPanel();
		
		final JButton btn =new JButton();
		
		//设置按钮的默认图片
		btn.setIcon(new ImageIcon("按钮-关.png"));
		
		//设置按钮被点击时的图片
		btn.setPressedIcon(new ImageIcon("按钮-开.png"));
		
		//不绘制边框
		btn.setBorderPainted(false);
		
		//添加按钮点击事件监听器
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("按钮被点击了");
			}
		});
		
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}