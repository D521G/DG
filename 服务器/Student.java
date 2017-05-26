import java.net.*; 
import java.io.*;
import java.util.*;
public class Student{
	public static void main(String[] args){
		try{
			1Socket socket = new Socket("192.168.199.219",9111);
			OutputStream out  = socket.getOutputStream();
			out.write("asdfghj".getBytes());
		}catch(Exception e){
			
		}
	}	
}