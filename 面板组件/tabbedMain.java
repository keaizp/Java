import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class tabbedMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		//����ѡ����
		final JTabbedPane tabbedPane =new JTabbedPane();
		
		//������ 1 ��ѡ���ѡ�ֻ���� ���⣩
		tabbedPane.addTab("Tab01",createTextPanel("TAB 01"));
		
		//������ 2 ��ѡ���ѡ����� ���� �� ͼ�꣩
		tabbedPane.addTab("Tab02", new ImageIcon("1.jpg"),createTextPanel("TAB 02"));
		
		//������ 3 ��ѡ���ѡ����� ���� ��ͼ�� �� tip��ʾ��
		tabbedPane.addTab("Tab03",new ImageIcon("2.jpg"),createTextPanel("TAB 03"),"This is a tab.");
		
		//���ѡ�ѡ��״̬�ı�ļ�����
		tabbedPane.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				System.out.println("��ǰѡ�е�ѡ���"+tabbedPane.getSelectedIndex());
			}
		});
		
		//����Ĭ��ѡ�е�ѡ�
		tabbedPane.setSelectedIndex(1);
		
		jf.setContentPane(tabbedPane);
		jf.setVisible(true);
	}
		
	//����һ����塣���������ʾһ����ǩ�����ڱ�ʾĳ��ѡ���Ҫ��ʾ������
	private static JComponent createTextPanel(String text){
		//������壬ʹ��һ�� 1�� 1�е����񲼾֣�Ϊ���ñ�ǩ�Ŀ���Զ�������壩
		JPanel panel =new JPanel(new GridLayout(1,1));
			
		//������ǩ
		JLabel label=new JLabel(text);
		label.setFont(new Font(null,Font.PLAIN,50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		//��ӱ�ǩ�����
		panel.add(label);
		
		return panel;
			
	}
	
}