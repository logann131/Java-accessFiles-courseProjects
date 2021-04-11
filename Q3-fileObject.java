/* Nam Phu Nguyen (Logan)
   CS141 
   Programing Assignment
   */
import java.util.*;//declare .util.* package
import java.io.*;//declare the .io.* package
class Q3{

   public static void main(String[] args)
      throws FileNotFoundException{ //throw the exception
      
         Scanner input = new Scanner (new File("Q3.txt")); // Scanner object (Q3.txt)
         
         while (input.hasNextLine()){ //test satement if there is another line
         
            String line = input.nextLine(); // line equals to the lines in Q3.txt
            Scanner lineScan = new Scanner (line);//Scan the lines
            
            
            while (lineScan.hasNext()){ // test if there is another token
             
            String token = lineScan.next();
                if (token.equals("death")) { // use equals to to compare the word
                  
                  
                  token=" love ";
               
               }
                if (token.equals("death-mark'd")) { // since this token is "death-mark'd, I gotta make a separate if statement for this case"
                  
                  
                  token=" love-mark's";
               
               }
               System.out.print(" "+token);
            
         
         }
         
         System.out.println();
      }
      
      }


} // end of class
