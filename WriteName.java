import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
/*To Write the File
 * Step-1--->Ask the User to enter the Path.-->here FileNotFound Exception Possible.
 *     Path eg:D://name.txt.
 * Step-2--->Connect to the FileOutputStream Class by passing path to FOS class Constructor.
 * Step-3--->Ask the User to enter the data to the file.
 * Step-4--->To Call the write(byte[]b) Method by Passing the byte[] by using the getBytes().
 * Step-5--->To close the file By call the close().
 * */

public class WriteName {
  static Scanner s=new Scanner(System.in);
  static OutputStream fout;//here UpCasting
  static InputStream fin;//here UpCasting
  public static void main(String[] args) throws IOException {
	System.out.println("Enter the Path");
	String path=s.nextLine();//enter the path
	try {
		fout=new FileOutputStream(path);	
	}
	catch(Exception e) {
		System.out.println("Enter the correct path");
	}
        System.out.println("Please Enter...");
	String name=s.nextLine();
	byte[] b=name.getBytes();
	try {
		fout.write(b);
		fout.close();
	}
	catch(Exception e) {
		System.out.println("Please pass the correct data");
	}
	readName();
}
  public static void readName() throws IOException {
	  System.out.println("Please enter valid  the Path");
	  String path=s.nextLine();
	  fin=new FileInputStream(path);
	  byte[]b=fin.readAllBytes();
	  for(int i=0;i<b.length;i++) {
		  System.out.print((char)b[i]);
	  }
	  
  }
}
