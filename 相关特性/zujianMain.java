package swing;

import javax.swing.*;
import java.awt.*;

public class zujianMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//创建内容面板，使用浮动布局
		JPanel panel =new JPanel(new FlowLayout());
		
		//创建一个标签，设置其背景为灰色（方便查看组件边界）
		JLabel label =new JLabel("一个标签");
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		
		/*
		 * 设置标签的宽高，对于浮动布局，这里需要使用 首选尺寸，设置其他尺寸无效
		 */
		label.setPreferredSize(new Dimension(100,100));
		
		//这里设置光标将无效，因为对于浮动布局设置其子组件的坐标无意义，坐标将在绘制显示后自动确定
		//label.setLocation(...);
		
		panel.add(label);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
		//到了这里，组件已绘制显示完成，坐标和尺寸才真正确定

	}

}
