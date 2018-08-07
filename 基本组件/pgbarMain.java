import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pgbarMain{
	private static final int MIN_PROGRESS=0;
	private static final int MAX_PROGRESS=100;
	
	private static int currentProgress = MIN_PROGRESS;
	
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel =new JPanel();
		
		//����һ��������
		final JProgressBar progressBar =new JProgressBar();
		
		//���ý��ȵ� ��Сֵ �� ���ֵ
		progressBar.setMinimum(MIN_PROGRESS);
		progressBar.setMaximum(MAX_PROGRESS);
		
		//���õ�ǰ����ֵ
		progressBar.setValue(currentProgress);
		
		//���ưٷֱ��ı����������м���ʾ�İٷ�����
		progressBar.setStringPainted(true);
		
		//��ӽ��ȸı�֪ͨ
		progressBar.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				System.out.println("��ǰ����ֵ��"+progressBar.getValue()+";"+"���Ȱٷֱȣ�"+progressBar.getPercentComplete());
			}
		});
		
		//��ӵ��������
		panel.add(progressBar);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
		
		//ģ����ʱ�������ȣ�ÿ�� 0.5 ����½���
		new Timer(500,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				currentProgress++;
				if(currentProgress>MAX_PROGRESS){
					currentProgress=MIN_PROGRESS;
				}
				progressBar.setValue(currentProgress);
			}
		}).start();
	}
}