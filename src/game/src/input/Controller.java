package game.src.input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import newgame.src.objects.Enemy;

public class Controller {
static LinkedList<Enemy> e=new LinkedList<Enemy>();
Enemy TempEnemy;

public Controller() {
	addenemy(new Enemy(100,1300));
	//addenemy(new Enemy(300,1100));
		addenemy(new Enemy(500,900));
	//addenemy(new Enemy(700,600));
	addenemy(new Enemy(900,300));
	//addenemy(new Enemy(1100,1300));
	addenemy(new Enemy(800,100));
	//addenemy(new Enemy(600,600));
		addenemy(new Enemy(100,1700));
	//addenemy(new Enemy(100,1800));
	addenemy(new Enemy(100,2000));
	
	
}
public void draw(Graphics2D g2d) {
	for(int i=0;i<e.size();i++)
	{
		 TempEnemy=e.get(i);
		 TempEnemy.draw(g2d);
		 
	}
}
public void update()
{
	for(int i=0;i<e.size();i++)
	{
		 TempEnemy=e.get(i);
		 /*if(TempEnemy.x<20)
		 {
			 removeenemy(TempEnemy);
			 
		}*/ 
		 TempEnemy.update();
		 
	}
}
public void addenemy(Enemy enemy)
{
	e.add(enemy);
}
public void removeenemy(Enemy enemy)
{
	e.remove(enemy);
}
public static LinkedList<Enemy> getEnemyBounds()
{
	return e;
}
}

