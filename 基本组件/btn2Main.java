import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btn2Main{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(200,200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		JPanel panel =new JPanel();
		
		final JButton btn =new JButton();
		
		//���ð�ť��Ĭ��ͼƬ
		btn.setIcon(new ImageIcon("��ť-��.png"));
		
		//���ð�ť�����ʱ��ͼƬ
		btn.setPressedIcon(new ImageIcon("��ť-��.png"));
		
		//�����Ʊ߿�
		btn.setBorderPainted(false);
		
		//��Ӱ�ť����¼�������
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("��ť�������");
			}
		});
		
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}