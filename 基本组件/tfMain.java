import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tfMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel =new JPanel();
		
		//�����ı���ָ���ɼ�����Ϊ8��
		final JTextField textField =new JTextField(8);
		textField.setFont(new Font(null,Font.PLAIN,20));
		panel.add(textField);
		
		//����һ����ť��������ȡ�ı����е��ı�
		JButton btn =new JButton("�ύ");
		btn.setFont(new Font(null,Font.PLAIN,20));
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("�ύ��"+textField.getText());
			}
		});
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}