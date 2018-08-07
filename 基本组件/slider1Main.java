import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class slider1Main{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		
		//����һ�����飬��Сֵ�����ֵ����ʼֵ �ֱ�Ϊ 0��20��10
		final JSlider slider =new JSlider(0,20,10);
		
		//�������̶ȼ��
		slider.setMajorTickSpacing(5);
		
		//���ôο̶ȼ��
		slider.setMinorTickSpacing(1);
		
		//���ƿ̶Ⱥͱ�ǩ
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
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