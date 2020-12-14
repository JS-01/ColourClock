package colourclock;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.awt.Toolkit;

public class ColourClock {

    //setup the global variables
    public static int CurrentHours;
    public static int CurrentMinutes;
    public static int CurrentSeconds;

    public static void main(String[] args) {
        //set up the GUI
        ClockGUI l = new ClockGUI();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth(); //get the screen width
        int ySize = (int)tk.getScreenSize().getHeight();//get the screen height
        
        l.setSize(xSize,ySize); //the left number is width and right is heightx 
        l.setVisible(true);

    }

    
    

}
