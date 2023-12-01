package game;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



import newgame.src.objects.Linked;
import java.awt.event.*;
import java.io.IOException;
import java.util.Vector;
import java.awt.Color;
import java.awt.FlowLayout;



	public class Menu extends JFrame implements ActionListener {
		
		private static final long serialVersionUID = 1L;
		public String n1;
		Mygame g=new Mygame(1);
		Linked list=new Linked();
		JButton newGame, rank, quit;
		JLabel l1;
	
		public Menu(){
			//super("MONSTER ATTACK");
		}
		
			public void menu() {
				pack();
				setSize(1400,800);
				setContentPane(new JLabel(new ImageIcon("C:\\Users\\HP\\Desktop\\Bank\\Monster Attack1.png")));
				setLayout(new FlowLayout());
				l1=new JLabel();
				add(l1);
				setSize(1400,800);
				//setLocationRelativeTo(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				setVisible(true);
				setFocusable(true);

				newGame = new JButton("New Game");
				rank = new JButton("Rank");
				quit = new JButton("Quit");

				//Font newButtonFont=new Font(newGame.getFont().getName(),Font.BOLD,newGame.getFont().getSize());
				newGame.setFont(new Font(Font.SERIF, Font.BOLD, 16));
				rank.setFont(new Font(Font.SERIF, Font.BOLD, 16));
				quit.setFont(new Font(Font.SERIF, Font.BOLD, 16));



				newGame.setForeground(Color.white);
				rank.setForeground(Color.white);
				quit.setForeground(Color.white);



				Color color=new Color(128,0,0);
				newGame.setBackground(color);
				rank.setBackground(color);
				quit.setBackground(color);



				newGame.setBounds(500,300,250,80);
				rank.setBounds(500,400,250,80);
				quit.setBounds(500,500,250,80);

				add(newGame);
				add(rank);
				add(quit);
				//setSize(250,300);
				setResizable(true);
				setLayout(null);
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				newGame.addActionListener(this);
				rank.addActionListener(this);
				quit.addActionListener(this);


		}
		
			void table() {

				Color color=new Color(153,0,0);
				JFrame f=new JFrame();
				f.pack();
				DefaultTableModel model = new DefaultTableModel();
				JTable table = new JTable(model);
				table.setBackground(color);
				table.setForeground(Color.white);
				JTableHeader tableHeader = table.getTableHeader();
				tableHeader.setBackground(Color.black);
				tableHeader.setForeground(Color.white);
				tableHeader.setFont(new Font(Font.SERIF, Font.BOLD, 12));

				Vector row = new Vector();
				Linked ll=new Linked();
				Linked l1=new Linked();
				table.setBounds(30,40,200,300);
				JScrollPane sp=new JScrollPane(table);
				f.add(sp);
				f.setSize(300,400);
				f.setVisible(true);
				try {
				int i=0;
				l1=ll.readFromFile();
				Node node;
				Node head = null;
				node=l1.head;
				model.addColumn("RANK");
				model.addColumn("NAME");
				model.addColumn("TIME TAKEN");
				int rank=1;
				while(node!=null) {
				String Name=node.name;
				int t=node.timetaken;
				//model.addRow(row);
				model.addRow(new Object[]{rank,Name, t+"sec"});
				//row.add(rank);
				//row.add(Name);
				//row.add(t);

				rank++;
				node=node.next;
				}



				} catch (IOException e) {
				e.printStackTrace();
				}
				}
		public void message(int a)
		{
			if (a==1)
			{
				
				JOptionPane.showMessageDialog (null, "CONGRATULATIONS YOU WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
				
				menu();
				g.disappear();
				
				
			}
			if (a==2)
			{
				JOptionPane.showMessageDialog (null, "TIME UP", "RESULT", JOptionPane.INFORMATION_MESSAGE);
				menu();
				g.disappear();
				
				
			}
			if (a==3)
			{
				JOptionPane.showMessageDialog (null, "3 LIVES LOST", "RESULT", JOptionPane.INFORMATION_MESSAGE);
								menu();
				
				g.disappear();
				
				
			}
			
		}
		

public static void main(String[] args) {
			// TODO Auto-generated method stub
Menu obj=new Menu();
obj.menu();
		}

@Override
public void actionPerformed(ActionEvent a) {
// TODO Auto-generated method stub
if(a.getSource()==newGame) {
n1=JOptionPane.showInputDialog("Name: ");
System.out.println("menu name "+n1);


//JFrame f=new JFrame();
//d.add( new JLabel ("Rules \n Rules"));
JOptionPane.showMessageDialog (null, "You have maximum 3 lives to win within 10 seconds", "RULES", JOptionPane.INFORMATION_MESSAGE);
list.setname(n1);
Mygame ob=new Mygame();
dispose();

//dispose();

}
if(a.getSource()==rank) {
//JOptionPane.showMessageDialog(null,name);
table();
}
if(a.getSource()==quit) {
dispose();
}
}



}

