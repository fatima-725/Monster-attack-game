package game;
import java.util.Timer;



import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;
public class Mygame {
public static final int WIDTH = 1400,HEIGHT=800;
public static JFrame myFrame;
public String name2;
public Mygame()
{



JFrame myFrame=new JFrame("Monster Attack");



myFrame.pack();
myFrame.setSize(WIDTH,HEIGHT);

//myFrame.setResizable(false);
myFrame.setLocationRelativeTo(null);
myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
myFrame.setVisible(true);
myFrame.add(new Game());

//myFrame.dispose();
}
public Mygame(int n)
{

}
public void disappear()
{
myFrame.dispose();



}




public static void main(String[] args) {
// TODO Auto-generated method stub
//Mygame obj=new Mygame();
}



}