import  javax.swing.*;
public class nullMain{
public static void main(String []args){

JFrame jf=new JFrame("���Դ���");
jf.setSize(300,300);
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//����������壬ָ������ Ϊnull����ʹ�þ��Բ���
JPanel panel =new JPanel(null);

//������ť
JButton btn01 =new JButton("Button01");
//���ð�ť������
btn01.setLocation(50,50);
//���ð�ť�Ŀ��
btn01.setSize(100,50);
panel.add(btn01);

//������ť
JButton btn02 =new JButton("Button02");
//���ð�ť�Ľ��ޣ�����Ϳ�ߣ������ð�ť������Ϊ��50,100�������Ϊ100,50
btn02.setBounds(50,100,100,50);
panel.add(btn02);

//��ʾ����
jf.setContentPane(panel);
jf.setVisible(true);

/*
*Ҳ������jf.setVisible(true)֮����Ӱ�ť
*
*jf.setVisible(true)֮�����������п�ߣ�
*ʹ����������ʱ��jf.setVisible(true)֮����ӵ������Ҳ�ᱻ�������Բ��������ø����������Ҫ�ֶ�ָ������Ϳ�ߣ���
*/

JButton btn03=new JButton("Button03");
btn03.setBounds(panel.getWidth()-100,panel.getHeight()-50,100,50);
panel.add(btn03);
}
}