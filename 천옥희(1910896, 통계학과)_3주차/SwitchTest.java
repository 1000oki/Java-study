import java.io.*;

class SwitchTest {
    public static void main(String[] args)
    {
        System.out.println("Switch Test!");

        try {
            {
                char c = (char)System.in.read();
                switch(c){
                    case 'y' : System.out.println("yes"); break;
                    case 'Y' : System.out.println("yes"); break;
                    case 'n' : break;
                    case 'N' : System.out.println("No"); break;
                    default : System.out.println("Wrong Character"); break;
                }
            }
        } 
        catch (IOException e) 
        NegativeArraySizeException{
            System.out.println("Read Error");
        }
    }
}
