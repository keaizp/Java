import  javax.swing.*;
public class nullMain{
public static void main(String []args){

JFrame jf=new JFrame("测试窗口");
jf.setSize(300,300);
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//创建内容面板，指定布局 为null，则使用绝对布局
JPanel panel =new JPanel(null);

//创建按钮
JButton btn01 =new JButton("Button01");
//设置按钮的坐标
btn01.setLocation(50,50);
//设置按钮的宽高
btn01.setSize(100,50);
panel.add(btn01);

//创建按钮
JButton btn02 =new JButton("Button02");
//设置按钮的界限（坐标和宽高），设置按钮的坐标为（50,100），宽高为100,50
btn02.setBounds(50,100,100,50);
panel.add(btn02);

//显示窗口
jf.setContentPane(panel);
jf.setVisible(true);

/*
*也可以在jf.setVisible(true)之后添加按钮
*
*jf.setVisible(true)之后，内容面板才有宽高；
*使用其他布局时，jf.setVisible(true)之后添加的组件，也会被当做绝对布局来布置该组件（即需要手动指定坐标和宽高）；
*/

JButton btn03=new JButton("Button03");
btn03.setBounds(panel.getWidth()-100,panel.getHeight()-50,100,50);
panel.add(btn03);
}
}