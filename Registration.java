import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JOptioPane;
public class Registration extends JFrame implements ActionListener{

   private static JLabel title,name,email,crPassword,coPassword,country,state,phoneNo;
   private static JTextField nam,emai,crPass,coPass,countr,stat,phon; 
   private static JButton submit,clear,auto;

    Registration(){
        super();
        setSize(450, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1,p2,p3;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p1.setBackground(Color.GRAY);
        p2.setBackground(Color.WHITE);
        add(p1,BorderLayout.NORTH); add(p2,BorderLayout.CENTER);
        p3.setBackground(Color.WHITE);
        p2.setLayout(new GridLayout(8,2,3,10));

        title = new JLabel("Registration Form in Windows Form:");
        name = new JLabel("   Name:");
        email = new JLabel("   Email-ID:");
        crPassword = new JLabel("   Create Password:");
        coPassword = new JLabel("   Confirm Password:");
        country = new JLabel("   Country:");
        state = new JLabel("   State:");
        phoneNo = new JLabel("   Phone Number:");

        nam =new JTextField();
        emai = new JTextField();
        crPass = new JTextField();
        coPass = new JTextField();
        countr = new JTextField();
        stat = new JTextField();
        phon = new JTextField();

        submit = new JButton("Submit");
        submit.addActionListener(this);
        clear = new JButton("Clear");
        clear.addActionListener(this);
        auto = new JButton("Auto");
        auto.addActionListener(this);

        p1.add(title);

        p2.add(name);          p2.add(nam);
        p2.add(email);         p2.add(emai);
        p2.add(crPassword);    p2.add(crPass);
        p2.add(coPassword);    p2.add(coPass);
        p2.add(country);       p2.add(countr);
        p2.add(state);         p2.add(stat);
        p2.add(phoneNo);       p2.add(phon);

        p3.add(submit);  p3.add(clear);  p3.add(auto);
        
        p2.add(p3);
      
       
    }
    public static void main(String[] args) {
        new Registration();
    }
   
  
@Override
public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();


    if (actionCommand.equals("Submit")){
    String student = nam.getText();
   JOptionPane.showMessageDialog(null,"HI " +student+ ", Your Details have been Sumitted Successfully","Student's ERP Portal",JOptioPane.INFORMATION_MESSAGE);
     /*  try{
        if (e.getSource() == submit){
    ---args goes here
        }
    catch(Exception x){
    x.getMessage();*/
  }
 if (actionCommand.equals("Clear")){
    nam.setText("");
    emai.setText("");
    crPass.setText("");
    coPass.setText("");
    countr.setText("");
    stat.setText("");
    phon.setText("");
}
else if(actionCommand.equals("Auto")){
    nam.setText("TITUS");
    emai.setText("tituskirui30@gmail.com");
    crPass.setText("");
    coPass.setText("");
    countr.setText("KENYA");
    stat.setText("Kenya");
    phon.setText("+254712731233");
}
}
}
