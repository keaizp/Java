import javax.swing.*;
import java.awt.*;
public class labelMain{
	public static void main(String[]args){
	JFrame jf=new JFrame("���Դ���");
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	//����������壬Ĭ��ʹ����ʽ����
	JPanel panel = new JPanel();
	
	//ֻ��ʾ�ı�
	JLabel label01 = new JLabel();
	label01.setText("Only Text");
	label01.setFont(new Font(null,Font.PLAIN,25));
	panel.add(label01);
	
	//ֻ��ʾͼƬ
	JLabel label02 =new JLabel();
	label02.setIcon(new ImageIcon("1.jpg"));
	panel.add(label02);
	
	//ͬʱ��ʾ�ı���ͼƬ
	JLabel label03 =new JLabel();
	label03.setText("�ı���ͼƬ��");
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