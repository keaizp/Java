import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class btn1Main{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(200,200);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		//����һ����ť
		final JButton btn = new JButton("���԰�ť");
		
		//��Ӱ�ť�ĵ���¼�������
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//��ȡ�����¼�Դ���ǰ�ť����
				//JButton btn =(JButton) e.getSource();
				System.out.println("��ť�����");
			}
		});
		
		panel.add(btn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}