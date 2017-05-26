package six;  
  
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.util.ArrayList;  
  
public class ReadWriter {  
    static ArrayList<String> s=new ArrayList<String>();  
    public static ArrayList<String> readXinxi() throws IOException {  
        File file = new File("D:/student.txt");  
        BufferedReader br = new BufferedReader(new FileReader(file));  
        int i = 0;  
        while (true) {  
            s.add(br.readLine());  
            if(s.get(i)==null){  
                s.remove(i);  
                break;  
            }  
            i++;  
        }  
        br.close();  
        return s;  
    }  
      
      
    public static void writeXinxi() throws IOException {  
        File file1 = new File("D:/student.txt");  
        BufferedWriter br1 = new BufferedWriter(new FileWriter(file1));  
        for (int i = 0; i < s.size();i++) {  
            br1.write(s.get(i)+"\r\n");  
        }  
        br1.close();  
    }  
}  