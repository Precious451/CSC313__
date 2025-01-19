# CSC313__
 */
public class Question1 {

     public static void main(String[] args) {
        int rows = 6;  
        int cols = 12; 
        
        for (int i = 0; i < rows * cols; i++) {
            if (i % cols < 3) {
                System.out.print("*");  
            } else if (i % cols >= 3 && i % cols < 6) {
                System.out.print("=");  
            } else {
                System.out.print("=");  
            }
            
            if (i % cols == cols - 1) {
                System.out.println();  
            }
        }
    
          System.out.println("   ");


    
        int row = 6;  
        int col = 9;  

        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                if (j < 3) {
                   
                   
                    System.out.print("*");
                } else if (j >= 3 && j < 6) {
                   
                    System.out.print("=");
                } else {
                    
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
    }
}
    
