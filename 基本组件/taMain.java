import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class taMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		
		//����һ�� 5 �� 10 �е��ı�����
		final JTextArea textArea =new JTextArea(5,10);
		//�����Զ�����
		textArea.setLineWrap(true);
		panel.add(textArea);
		
		//����һ���ύ��ť�������ť��ȡ�����ı�
		JButton btn=new JButton("�ύ");
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("�ύ��"+textArea.getText());
			}
		});
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}