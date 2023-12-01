package newgame.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import game.Globalposition;
import game.Mygame;

public class Enemy extends Globalposition {
private String image="/images/ene.png";
int speed=8;
int speed1=8;
	public Enemy(int x,int y)
{
	super(x,y);
}
	public void update()
	{
		x+=speed;
		y+=speed1;
		if(x>Mygame.WIDTH-32)
		{
			speed=-8;
		}
		if(x<0)
		{
			speed=8;
		}
		if(y>Mygame.HEIGHT)
		{
			speed1=-8;
		}
		if(y<0)
		{
			speed1=8;
		}
		

	}
public void draw (Graphics2D g2d)
{
	g2d.drawImage(getEnemyImage(),x,y,null);
}
public Rectangle getBounds()
{
	return new Rectangle (x,y,25,25);
}
public Image getEnemyImage()
{
	ImageIcon i=new ImageIcon(getClass().getResource(image));
	return i.getImage();
}
}
