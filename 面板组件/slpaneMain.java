import javax.swing.*;
import java.awt.*;

public class slpaneMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//�����ı��������
		JTextArea textArea =new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font(null,Font.PLAIN,18));
		
		//����������壬ָ��������ʾ��ͼʾ�����textArea��,��ֱ������һֱ��ʾ��ˮƽ�������Ӳ���ʾ
		JScrollPane scrollPane =new JScrollPane(
		textArea,
		ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
		);
		
		jf.setContentPane(scrollPane);
		jf.setVisible(true);
	}
}