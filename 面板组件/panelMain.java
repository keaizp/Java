import javax.swing.*;
import java.awt.*;

public class panelMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		//��һ��JPanel��ʹ��Ĭ�ϵĸ�������
		JPanel panel01 =new JPanel();
		panel01.add(new JLabel("�û���"));
		panel01.add(new JTextField(10));
		
		JPanel panel02 =new JPanel();
		panel02.add(new JLabel("��  ��"));
		panel02.add(new JPasswordField(10));
		
		JPanel panel03 =new JPanel();
		panel03.add(new JButton("��¼"));
		panel03.add(new JButton("ע��"));
		
		Box vBox =Box.createVerticalBox();
		vBox.add(panel01);
		vBox.add(panel02);
		vBox.add(panel03);
		
		jf.setContentPane(vBox);
		jf.pack();
		jf.setVisible(true);
	}
}