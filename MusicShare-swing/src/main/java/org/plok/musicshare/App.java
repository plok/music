package org.plok.musicshare;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.ejb.EJB;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.plok.musicshare.facade.MusicianFacadeRemote;

/**
 * Hello world!
 *
 */
public class App 
{
    @EJB
    private static MusicianFacadeRemote facade;

    
    public void run(){
        
        JFrame frame = new JFrame("demo");
        
        int count = facade.count();
        
        frame.getContentPane().add(new JLabel(String.valueOf(count)),BorderLayout.CENTER);
        
                JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel,BorderLayout.NORTH);
        
        frame.pack();
        frame.setVisible(true);

    }
    
    
        private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    
    public static void main( String[] args )
    {
     
                //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                   App app = new App();
               app.run();
            }
        });
      
    }
}
