import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Hashtable;

public class slider2Main{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		
		//����һ�����顣��Сֵ�����ֵ����ʼֵ �ֱ�Ϊ 0��20��10
		final JSlider slider=new JSlider(0,20,10);
		
		//�������̶ȼ��
		slider.setMajorTickSpacing(5);
		
		//���ôο̶ȼ��
		slider.setMinorTickSpacing(1);
		
		//���ƿ̶Ⱥͱ�ǩ
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		//���û��鷽��Ϊ��ֱ����
		slider.setOrientation(SwingConstants.VERTICAL);
		
		//��ָ���Ŀ̶�ֵ��ʾ�Զ����ǩ
		Hashtable<Integer,JComponent> hashtable =new Hashtable<Integer,JComponent>();
		hashtable.put(0,new JLabel("Start"));
		hashtable.put(10,new JLabel("Middle"));
		hashtable.put(20,new JLabel("End"));
		
		//���̶�ֵ���Զ����ǩ�Ķ�Ӧ��ϵ���õ����飨���ú�����ʾĬ�ϵĿ̶�ֵ��
		slider.setLabelTable(hashtable);
		
		//��ӿ̶ȸı������
		slider.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				System.out.println("��ǰֵ��"+slider.getValue());
			}
		});
		
		panel.add(slider);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}