package game.src.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import newgame.src.objects.Player;

public class Keyinput extends KeyAdapter  {
Player p;
public Keyinput(Player p)
{
	this.p=p;
}
public void keyPressed(KeyEvent e)
{
	p.keyPressed(e);
}
public void keyReleased(KeyEvent e)
{
	p.keyReleased(e);
}

}
