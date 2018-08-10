package swing;

import javax.swing.*;
import java.awt.*;

public class tableMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jf=new JFrame("测试窗口");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//创建内容面板，使用边界布局
		JPanel panel =new JPanel(new BorderLayout());
		
		//表头（列名）
		Object[] columnNames = {"姓名","语文","数学","英语","总分"};
		
		//表格所有行数据
		Object[][] rowData = {
				{"张三",80,80,80,240},
				{"John",70,80,90,240},
				{"Sue",70,70,70,210},
				{"Jane",80,70,60,210},
				{"Joe",80,70,60,210}
		};
		//创建一个表格，指定 所有行数据 和表头
		JTable table =new JTable(rowData,columnNames);
		
		//把 表头 添加到容器顶部（使用普通的中间容器添加，表头 和 内容 需要分开添加）
		panel.add(table.getTableHeader(),BorderLayout.NORTH);
		//把表格内容 添加到容器中心
		panel.add(table,BorderLayout.CENTER);
		
		jf.setContentPane(panel);
		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}

}
