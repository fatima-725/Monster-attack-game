package newgame.src.objects;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
public class Time {
	public int Secondspassed=0;
	public int c=0;

	Timer mytimer=new Timer();
	TimerTask task=new TimerTask() {
		public void run()
		{
			Secondspassed++;
		
			++c;
			System.out.println("Seconds passed  "+Secondspassed);
			
		}
		};
	
	public Time(){
		// TODO Auto-generated method stub
		mytimer.scheduleAtFixedRate(task, 1000, 1000);
	}

}
