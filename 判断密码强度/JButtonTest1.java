import java.util.Scanner; 
public class JButtonTest1{ 
    public static void main ( String[] args ){ 
        Scanner scanner = new Scanner (System.in); 
        System.out.println ("判断输入的密码强度"); 
        while (scanner.hasNextLine ()) 
        { 
            String line = scanner.nextLine (); 
            if (line.matches ("^\\d+$")) 
            { 
                System.out.println ("数字弱"); 
            } 
            else 
				if (line.matches ("^[a-zA-Z]+$")) 
            { 
                System.out.println ("字母弱"); 
            } 
            else 
				if (line.matches ("(?i)^((\\d+[\\da-z]*[a-z]+)|([a-z]+[\\da-z]*\\d+)|([a-z]+[\\da-z]*[a-z]*)|(\\d+[\\da-z]*\\d*))$")) 
            {
                System.out.println ("密码强"); 
            } 
            else 
            {
                System.out.println ("我日要"); 
                scanner.close (); 
                break; 

            } 

        } 

    } 

}