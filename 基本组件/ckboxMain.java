import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ckboxMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		JPanel panel=new JPanel();
		
		//������ѡ��
		JCheckBox checkBox01 =new JCheckBox("����");
		JCheckBox checkBox02 =new JCheckBox("�㽶");
		JCheckBox checkBox03 =new JCheckBox("ѩ��");
		JCheckBox checkBox04 =new JCheckBox("��֦");
		JCheckBox checkBox05 =new JCheckBox("����");
		JCheckBox checkBox06 =new JCheckBox("ƻ��");
		
		//��ӵ�һ����ѡ���״̬���ı�ļ�����������ѡ�������Ҫ����״̬�ı䣬��ɰ��˷�����Ӽ�����
		checkBox01.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				//��ȡ�¼�Դ������ѡ����
				JCheckBox checkBox =(JCheckBox)e.getSource();
				System.out.println(checkBox.getText()+"�Ƿ�ѡ�У�"+checkBox.isSelected());
			}
		});
		
		//����Ĭ�ϵ�һ����ѡ��ѡ��
		checkBox01.setSelected(true);
		
		panel.add(checkBox01);
		panel.add(checkBox02);
		panel.add(checkBox03);
		panel.add(checkBox04);
		panel.add(checkBox05);
		panel.add(checkBox06);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}