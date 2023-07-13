import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login1 implements ActionListener{ 
    private static JLabel label;
    private static JTextField userText;
    private static JPasswordField passText;
    private static JButton loginButton;
    private static JLabel success;
    private static JLabel passwordJLabel;
    private static JFrame frame;
    private static JRadioButton showRadio;

    public Login1() {
        JPanel panel = new JPanel();
        frame = new JFrame();
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.RED);
        frame.setLocationRelativeTo(null);

        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username");
        label.setBounds(30, 20, 80, 25);
        panel.add(label);

        userText = new JTextField();
        userText.setBounds(120, 20, 165, 25);
        panel.add(userText);

        passwordJLabel = new JLabel("Password");
        passwordJLabel.setBounds(30, 50, 80, 25);
        panel.add(passwordJLabel);

        JLabel forgot = new JLabel("Forgot password?");
        forgot.setBounds(30, 175, 150, 12);
        panel.add(forgot);

        showRadio = new JRadioButton("Show Password");
        showRadio.setBounds(30, 83, 130, 25);
        panel.add(showRadio);

        passText = new JPasswordField(20);
        passText.setEchoChar('*');
        passText.setBounds(120, 50, 165, 25);
        panel.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 110, 35);
        panel.add(loginButton);
        loginButton.setBackground(Color.BLUE);

        loginButton.addActionListener(this);
        showRadio.addActionListener(this);

        // success = new JLabel("");
        // success.setBounds(30, 150, 300, 25);
        // panel.add(success);

        frame.setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loginButton) {
                String user = userText.getText();
                String password = new String(passText.getPassword());

                if (user.equals("admin") && password.equals("admin")) {
                    // success.setText("Welcome Admin");
                    // frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Welcome","Administrator",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"Invalid username or password!",password, JOptionPane.WARNING_MESSAGE);
                }
            } else if (e.getSource() == showRadio) {
                if (showRadio.isSelected()) {
                    passText.setEchoChar((char)0);
                } else {
                    passText.setEchoChar('*');
                }
            }
        }
        catch(Exception x){
           x.getMessage();
        }
    }


    public static void main(String[] args) {
        Login1 l =  new Login1();
       
    }
}
