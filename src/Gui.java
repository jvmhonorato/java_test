import javax.swing.JOptionPane;

public class Gui {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello"+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter our height"));    
        JOptionPane.showMessageDialog(null, "Your height is " + height);


 }
}
