import javax.swing.*;
import java.awt.*;

public class bdMain{

public static void main(String[]args){

JFrame jf =new JFrame("���Դ���");
jf.setSize(350,250);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//�����������������ָ��ʹ�� �߽粼��
JPanel panel = new JPanel(new BorderLayout());

//����5����ť
JButton btnN=new JButton("Button_North");
JButton btnS=new JButton("Button_South");
JButton btnW=new JButton("Button_West");
JButton btnE=new JButton("Button_East");
JButton btnC=new JButton("Button_Center");

//�������ť��ӵ������е������λ
panel.add(btnN,BorderLayout.NORTH);
panel.add(btnS,BorderLayout.SOUTH);
panel.add(btnW,BorderLayout.WEST);
panel.add(btnE,BorderLayout.EAST);
panel.add(btnC,BorderLayout.CENTER);

jf.setContentPane(panel);
jf.setLocationRelativeTo(null);
jf.setVisible(true);


}
}