package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import game.src.input.Controller;
import game.src.input.Keyinput;
import newgame.src.objects.Player;

public class Game extends JPanel implements ActionListener{
	
		private static final long serialVersionUID = 1L;
private String background="/images/Monster Attack game.png";
		Timer gamelooptimer;
Player p;
Controller c;
	public Game()
	{
		setFocusable(true);
		gamelooptimer=new Timer (10,this);
		gamelooptimer.start();
		p=new Player(5,5);
	c=new Controller();
		addKeyListener(new Keyinput(p));
		
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;

		g2d.drawImage(getBackgrondImage(), 0,0, this);
		p.draw(g2d);
		c.draw(g2d);
	}
	public Image getBackgrondImage()
	{
		ImageIcon i=new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}
@Override
	public void actionPerformed(ActionEvent ee) {
		// TODO Auto-generated method stub
	repaint();
	p.update();
c.update();
	}

}
