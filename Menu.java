import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Menu
{
	JMenu m,sm;
	JMenuItem i1,i2,i3,i4;
	Menu()
	{
		JFrame f=new JFrame();
		JMenuBar mb=new JMenuBar();
		m=new JMenu("Menu");
		sm=new JMenu("SubMenu");
		i1=new JMenuItem("Open");
		i2=new JMenuItem("New");
		i3=new JMenuItem("Help");
		i4=new JMenuItem("About");
		m.add(i1);
		m.add(i2);
		sm.add(i3);
		sm.add(i4);
		m.add(sm);
		mb.add(m);
		f.setJMenuBar(mb);
		f.setSize(600,600);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String args[])
	{
		new Menu();
	}
}