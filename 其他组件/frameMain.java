package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final JFrame jf=new JFrame("测试窗口");
		jf.setSize(400,400);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel =new JPanel();
		
		JButton btn =new JButton("Show New Window");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNewWindow(jf);
			}
		});
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
	public static void showNewWindow(JFrame relativeWindow) {
		JFrame newJFrame =new JFrame("新的窗口");
		 newJFrame.setSize(250,250);
		 newJFrame.setLocationRelativeTo(null);
		 newJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		 newJFrame.setResizable(false);
		 JPanel panel=new JPanel(new GridLayout(1,1));
		 JLabel label =new JLabel("这是一个窗口");
		 label.setFont(new Font(null,Font.PLAIN,25));
		 label.setHorizontalAlignment(SwingConstants.CENTER);
		 label.setVerticalAlignment(SwingConstants.CENTER);
		 panel.add(label);
		 newJFrame.setContentPane(panel);
		 newJFrame.setVisible(true);
		 
	}

}
