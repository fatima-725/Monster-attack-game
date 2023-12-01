package newgame.src.objects;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.Globalposition;
import game.Menu;
import game.Mygame;

import game.src.input.Controller;

public class Player extends Globalposition  {
	Linked l=new Linked();
	
	Menu m=new Menu();
Mygame demo=new Mygame(1);
	

	//String n=m.name;
	Time ob= new Time();
	
	
	int t1;
	public int count=0;
	public int c=0;

	private String playerimage="/images/a.png"; 
	int velx=0;
	int vely=0;
	
	
	  private LinkedList<Enemy> e=Controller.getEnemyBounds();
	  
	
	public Player(int x,int y)
	{
		super(x,y);
	}
	
	

public void update() {
	
	
	
	x+=velx;
	y+=vely;
	
	//collision with outside
	if (x<0)
	{
		x=0;
	}
	if (y<0)
	{
		y=0;
	}
	if (x>1400)
	{
		if(ob.Secondspassed<=10)
		{
			l.settime(ob.c);
			ob.mytimer.cancel();
		l.add();
			//l.printList();
			m.message(1);
			

			
		System.out.println("minimum time "+ ob.c+ " seconds");
			
			
		String st1="CONGRATULATIONS YOU WON  "+" time "+ob.c+" seconds";
		
		System.out.println(st1);
		System.out.println("lives used"+count);
	
		}
		else {
			
			ob.mytimer.cancel();
			String st="time is up "+"Seconds passed " +ob.Secondspassed;
			
			//JOptionPane.showMessageDialog(null,st);
			System.out.println(st);
			System.out.println("Seconds passed "+ob.Secondspassed);
			
			m.message(2);
			//m1.menu();
			
			
		}
	}
	if(ob.Secondspassed>10)
	{
		
		ob.mytimer.cancel();
		String s="time is up "+"Seconds passed " +ob.Secondspassed;
		
		//JOptionPane.showMessageDialog(null,s);
		System.out.println(s);
		System.out.println("Seconds passed "+ob.Secondspassed);
		
		m.message(2);
		//m1.menu();
		
	}
	if (y>800) {
		y=0;
	}
	Collision();
	
	
}


public void Collision()
{
 
	for(int i=0;i<e.size();++i)
	{
		if(getBounds().intersects(e.get(i).getBounds()))
		{	
			++count;
		
			System.out.println("count "+count);
		}
		if(count>15)
		{
			
			String st="3 lives lost";
			//JOptionPane.showMessageDialog(null,st);
			System.out.println(st);
			
			m.message(3);
			//m1.menu();
		
			
		
			}		
		
		
		
		
	}
	
}
public void keyPressed(KeyEvent e)
{
	int key=e.getKeyCode();
	if(key==KeyEvent.VK_RIGHT)
	{
		velx=5;
	}
	else if (key==KeyEvent.VK_LEFT)
	{
		velx=-5;
	}
	else if (key==KeyEvent.VK_DOWN)
	{
		vely=5;
	}
	else if (key==KeyEvent.VK_UP)
	{
		vely=-5;
	}
}
public void keyReleased(KeyEvent e)
{
	int key=e.getKeyCode();
	if(key==KeyEvent.VK_RIGHT)
	{
		velx=0;
	}
	else if (key==KeyEvent.VK_LEFT)
	{
		velx=0;
	}
	else if (key==KeyEvent.VK_DOWN)
	{
		vely=0;
	}
	else if (key==KeyEvent.VK_UP)
	{
		vely=0;
	}
	}
public Rectangle getBounds()
{
	return new Rectangle (x,y,50,50);
}
public void draw(Graphics2D g2d)
{
	g2d.drawImage(getPlayerImage(), x,y, null);
	
	g2d.draw(getBounds());
}
public Image getPlayerImage()
{
	ImageIcon i=new ImageIcon(getClass().getResource(playerimage));
	return i.getImage();
}
}
