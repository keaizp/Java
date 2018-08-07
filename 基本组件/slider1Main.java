import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class slider1Main{
	public static void main(String[]args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		
		//创建一个滑块，最小值、最大值、初始值 分别为 0、20、10
		final JSlider slider =new JSlider(0,20,10);
		
		//设置主刻度间隔
		slider.setMajorTickSpacing(5);
		
		//设置次刻度间隔
		slider.setMinorTickSpacing(1);
		
		//绘制刻度和标签
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		//添加刻度改变监听器
		slider.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e){
				System.out.println("当前值："+slider.getValue());
			}
		});
		
		panel.add(slider);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}