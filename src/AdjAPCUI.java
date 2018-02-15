 // MyTextFieldDemo.java: Add two numbers in the text fields
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdjAPCUI extends JFrame implements ActionListener
{
  // Declare three text fields
  private JTextField jtfNum1, jtfNum2, jtfResult;
  private JButton jbtAdd; // Declare "Calculate" button

  // Main method
  public static void main(String[] args)
  {
    AdjAPCUI frame = new AdjAPCUI();
    frame.pack();
    
    frame.setVisible(true);
  }

  // Constructor
  public AdjAPCUI()
  {
    setTitle("Adjusted APC Rate Calculator");
//    setBackground(Color.yellow);
//    setForeground(Color.black);

    // Use panel p1 to group text fields
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    p1.add(new Label("Unadjusted APC Rate"));
    p1.add(jtfNum1 = new JTextField(6));
    p1.add(new Label("WI"));
    p1.add(jtfNum2 = new JTextField(6));
    p1.add(new Label("Result"));
    p1.add(jtfResult = new JTextField(10));
    jtfResult.setEditable(false);   // Set jtfResult noneditable

    // Use panel p2 for the button
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(jbtAdd = new JButton("Calculate"));
    
     
    
    // Set FlowLayout for the frame and add panels to the frame
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(p1, BorderLayout.CENTER);
    getContentPane().add(p2, BorderLayout.SOUTH);

    // Register listener
    jbtAdd.addActionListener(this);
    
  }

  // Handle the add operation
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == jbtAdd)
    {
      // Get int values from text fields and use trim() to
      // trim extraneous space in the text field
    double   num1 = (Double.parseDouble(jtfNum1.getText().trim()));
     double  num2 = (Double.parseDouble(jtfNum2.getText().trim()));
     double  result = ((double)((num1*0.6)*num2)+(double)(num1*0.4));
     double rt = Math.round(result*100)/100.0d;
             
        jtfResult.setText(String.valueOf(rt));
      // Set result in TextField jtfResult
      //jtfResult.setText(String.valueOf(result));
    }
   

  }
}