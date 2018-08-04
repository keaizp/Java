import javax.swing.*;
import java.awt.*;
public class wgMain{
public static void main(String[]args){

JFrame jf=new JFrame("²âÊÔ´°¿Ú");
jf.setSize(200,250);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
jf.setLocationRelativeTo(null);

GridLayout layout =new GridLayout(3,3);

layout.setHgap(10);
layout.setVgap(10);

JPanel panel =new JPanel(layout);

JButton btn01 =new JButton("°´Å¥01");
JButton btn02 =new JButton("°´Å¥02");
JButton btn03 =new JButton("°´Å¥03");
JButton btn04 =new JButton("°´Å¥04");
JButton btn05 =new JButton("°´Å¥05");
JButton btn06 =new JButton("°´Å¥06");
JButton btn07 =new JButton("°´Å¥07");
JButton btn08 =new JButton("°´Å¥08");

panel.add(btn01);
panel.add(btn02);
panel.add(btn03);
panel.add(btn04);
panel.add(btn05);
panel.add(btn06);
panel.add(btn07);
panel.add(btn08);

jf.setContentPane(panel);
jf.setVisible(true);



}}