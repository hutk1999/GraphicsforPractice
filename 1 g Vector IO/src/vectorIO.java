import javax.swing.*;
/**
 *
 * @author UJS
 */
public class  vectorIO{
    
    /** Creates a new instance of Main */
    public vectorIO() {
    }
   
    public static void main(String[] args) {
        int sum = 0; 
        int[] x = new int[4];
        for(int i = 0; i <= 3; i++){
        String input = JOptionPane.showInputDialog
					("Give element of vector");
        x[i] = Integer.parseInt(input);
        sum = sum +x[i];
        }
        for(int i = 0; i <= 3; i++)
            System.out.print( "  " + x[i]);
        System.out.println("  ");
        System.out.println(" The sum of the elements is: " + sum);
        System.exit(0);
    
    }
}

