package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class popupmenuMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jf =new JFrame("测试窗口");
		jf.setSize(300, 300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel =new JPanel();
		
		//直接在内容面板上添加鼠标监听器
		panel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//鼠标点击（按下并抬起）
			}
			public void mousePressed(MouseEvent e) {
				//鼠标按下
			}
			public void mouseReleased(MouseEvent e) {
				//鼠标释放
				
				//如果是鼠标右键，则显示弹出菜单
				if(e.isMetaDown()) {
					showPopupMenu(e.getComponent(),e.getX(),e.getY());
				}
			}
			public void mouseEntered(MouseEvent e) {
				//鼠标进入组件区域
			}
			public void mouseExited(MouseEvent e) {
				//鼠标离开组件区域
			}
		});
		
		jf.setContentPane(panel);
		jf.setVisible(true);
		

	}
	
	public static void showPopupMenu(Component invoker,int x,int y) {
		//创建 弹出菜单 对象
		JPopupMenu popupMenu =new JPopupMenu();
		
		//创建一级菜单
		JMenuItem copyMenuItem =new JMenuItem("复制");
		JMenuItem pasteMenuItem =new JMenuItem("粘贴");
		JMenu editMenu =new JMenu("编辑"); //需要添加 二级子菜单 的菜单，使用JMenu
		JMenuItem fileMen =new JMenuItem("文件");
		
		//创建二级菜单
		JMenuItem findMenuItem =new JMenuItem("查找");
		JMenuItem replaceMenuItem =new JMenuItem("替换");
		//添加二级菜单 到编辑 一级菜单
		editMenu.add(findMenuItem);
		editMenu.add(replaceMenuItem);
		
		//添加一级菜单 到弹出菜单
		popupMenu.add(copyMenuItem);
		popupMenu.add(pasteMenuItem);
		popupMenu.addSeparator();
		popupMenu.add(editMenu);
		popupMenu.add(fileMen);
		
		//添加菜单项的点击监听器
		copyMenuItem.addActionListener(new ActionListener() {
			@Override
			public void  actionPerformed(ActionEvent e) {
				System.out.println("复制 被点击");
			}
		});
		
		//在指定位置显示弹出菜单
		popupMenu.show(invoker, x, y);
	}

}
