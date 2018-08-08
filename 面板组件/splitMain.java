import javax.swing.*;
public class splitMain{
	public static void main(String[]args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		//创建分隔面板
		JSplitPane splitPane =new JSplitPane();
		
		//设置左右两边显示的组件
		splitPane.setLeftComponent(new JButton("左边按钮"));
		splitPane.setRightComponent(new JButton("右边按钮"));
		
		//分隔条上显示快速 折叠/展开
		splitPane.setOneTouchExpandable(true);
		
		//设置分隔条的初始位置
		splitPane.setDividerLocation(150);
		
		//把分隔面板作为内容面板添加到窗口并显示
		jf.setContentPane(splitPane);
		jf.setVisible(true);
	}
}