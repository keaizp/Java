import javax.swing.*;
import java.awt.*;

public class layeredMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane =new JLayeredPane();
		
		//����:100
		JPanel panel_100_1 =createPanel(Color.RED,"L=100,p=1",30,30,100,100);
		layeredPane.add(panel_100_1,new Integer(100));
		
		//������200������λ�ã�0�����ڶ�����
		JPanel panel_200_0 =createPanel(Color.GREEN,"L=200,p=0",70,70,100,100);
		layeredPane.add(panel_200_0,new Integer(200),0);
		
		//������200������λ�ã�1
		JPanel panel_200_1 =createPanel(Color.CYAN,"L=200,p=1",110,110,100,100);
		layeredPane.add(panel_200_1,new Integer(200),1);
		
		//������300
		JPanel panel_300 =createPanel(Color.YELLOW,"L=300",150,150,100,100);
		layeredPane.add(panel_300,new Integer(300));
		
		jf.setContentPane(layeredPane);
		jf.setVisible(true);
	}
	
	//����һ���������
	private static JPanel createPanel(Color bg,String text,int x,int y,int width,int height){
		//����һ��JPanel��ʹ�� 1�� 1�е����񲼾�
		JPanel panel =new JPanel(new GridLayout(1,1));
		
		//����������λ�úͿ��
		panel.setBounds(x,y,width,height);
		
		//����panel�ı���
		panel.setOpaque(true);
		panel.setBackground(bg);
		
		//������ǩ��������Ӧ����
		JLabel label =new JLabel(text);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		panel.add(label);
		
		return panel;
	}
}