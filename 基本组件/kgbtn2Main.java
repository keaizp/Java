import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class kgbtn2Main{
	public static void main(String []args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		JPanel panel=new JPanel();
		
		//�������ذ�ť
		JToggleButton toggleBtn=new JToggleButton();
		
		//�������ò����ư�ť�߿�
		toggleBtn.setBorderPainted(false);
		
		//���� ѡ�� �� δѡ�� ʱ��ʾ��ͼƬ
		toggleBtn.setSelectedIcon(new ImageIcon("��ť-��.png"));
		toggleBtn.setIcon(new ImageIcon("��ť-��.png"));
		
		//��� toggleBtn ��״̬���ı�ļ���
		toggleBtn.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				//��ȡ�¼�Դ�������ذ�ť����
				JToggleButton toggleBtn =(JToggleButton)e.getSource();
				System.out.println(toggleBtn.getText()+"�Ƿ�ѡ��:"+toggleBtn.isSelected());
				
			}
		});
		
		panel.add(toggleBtn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}