import javax.swing.*;
public class Table
{
	JFrame f;
	Table()
	{
		f= new JFrame();
		String data[][]={{"110","Alex","12000"},{"120","Ben","10000"},{"130","Chris","32000"}};
		String col[]={"Id","Name","Salary"};
		JTable jt= new JTable(data,col);
		jt.setBounds(30,40,200,300);
		JScrollPane sp= new JScrollPane(jt);
		f.add(sp);
		f.setSize(600,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String agrs[])
	{
		new Table();
	}
}