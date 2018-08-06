import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class kgbtn2Main{
	public static void main(String []args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		JPanel panel=new JPanel();
		
		//创建开关按钮
		JToggleButton toggleBtn=new JToggleButton();
		
		//首先设置不绘制按钮边框
		toggleBtn.setBorderPainted(false);
		
		//设置 选中 和 未选中 时显示的图片
		toggleBtn.setSelectedIcon(new ImageIcon("按钮-开.png"));
		toggleBtn.setIcon(new ImageIcon("按钮-关.png"));
		
		//添加 toggleBtn 的状态被改变的监听
		toggleBtn.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				//获取事件源（即开关按钮本身）
				JToggleButton toggleBtn =(JToggleButton)e.getSource();
				System.out.println(toggleBtn.getText()+"是否选中:"+toggleBtn.isSelected());
				
			}
		});
		
		panel.add(toggleBtn);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}