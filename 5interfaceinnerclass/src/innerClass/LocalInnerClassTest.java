package innerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LocalInnerClassTest
{
   public static void main(String[] args)
   {
	   TalkingClock2 clock = new TalkingClock2();
      clock.start(1000, true);

      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}

class TalkingClock2
{
   public void start(int interval, final boolean beep)
   {
      class TimePrinter implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (beep) Toolkit.getDefaultToolkit().beep();
         }
      }
      ActionListener listener = new TimePrinter();
      Timer t = new Timer(interval, listener);
      t.start();
   }
}










