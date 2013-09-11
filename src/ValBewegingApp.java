import java.awt.BorderLayout;
import javax.swing.JFrame;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class ValBewegingApp extends JFrame
{
	JFrame frame = null;

   public ValBewegingApp()  // constructor
   {
	  frame = new JFrame();
      frame.setSize (500, 600);
      frame.setTitle ("valbeweging");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);

      ControlePaneelNoord noordpaneel = new ControlePaneelNoord();
      ValBewegingPaneel valpaneel = new ValBewegingPaneel (this, noordpaneel);
      // waarom wordt het frame-object doorgegeven aan het valpaneel-object? 
      
      frame.setLayout(new BorderLayout());

      frame.add (noordpaneel, BorderLayout.NORTH);
      frame.add (valpaneel, BorderLayout.CENTER);
      setLocationRelativeTo(null);
      setVisible(true);
   }

   public static void main (String [] args)
   {
      new ValBewegingApp();
   }

}
