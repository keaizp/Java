import javax.swing.*;
public class splitMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		//�����ָ����
		JSplitPane splitPane =new JSplitPane();
		
		//��������������ʾ�����
		splitPane.setLeftComponent(new JButton("��߰�ť"));
		splitPane.setRightComponent(new JButton("�ұ߰�ť"));
		
		//�ָ�������ʾ���� �۵�/չ��
		splitPane.setOneTouchExpandable(true);
		
		//���÷ָ����ĳ�ʼλ��
		splitPane.setDividerLocation(150);
		
		//�ѷָ������Ϊ���������ӵ����ڲ���ʾ
		jf.setContentPane(splitPane);
		jf.setVisible(true);
	}
}