import javax.swing.*;
import java.awt.*;
public class wgMain{
public static void main(String[]args){

JFrame jf=new JFrame("测试窗口");
jf.setSize(200,250);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
jf.setLocationRelativeTo(null);

GridLayout layout =new GridLayout(3,3);

layout.setHgap(10);
layout.setVgap(10);

JPanel panel =new JPanel(layout);

JButton btn01 =new JButton("按钮01");
JButton btn02 =new JButton("按钮02");
JButton btn03 =new JButton("按钮03");
JButton btn04 =new JButton("按钮04");
JButton btn05 =new JButton("按钮05");
JButton btn06 =new JButton("按钮06");
JButton btn07 =new JButton("按钮07");
JButton btn08 =new JButton("按钮08");

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