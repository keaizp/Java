import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pfMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel =new JPanel();
		
		//���������ָ���ɼ�����Ϊ10��
		final JPasswordField passwordField =new JPasswordField(10);
		panel.add(passwordField);
		
		//����һ����ť��������ȡ����������������
		JButton btn =new JButton("�ύ");
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("�ύ������Ϊ��"+new String(passwordField.getPassword()));
			}
		});
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
		
	}
}