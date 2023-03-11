/* NIM		: 13020210067
NAMA		: YAYANG NURAVIN NABILAH
HARI/TANGGAL	: SABTU,11 MARET 2023*/
	
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
public class Bacakar {
	public static void main(String[] args) throws IOException { // TODO Auto-generated method stub
	char cc; int bil;
	InputStreamReader isr = new 
	InputStreamReader(System.in); 
	BufferedReader dataIn = new BufferedReader(isr);
	BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
	System.out.print ("hello\n");
	System.out.print("baca 1 karakter : ");
	cc =dataIn.readLine().charAt(0); 
	System.out.print("baca 1 bilangan : ");
	bil =Integer.parseInt(datAIn.readLine());
	System.out.print (cc +"\n" +bil+"\n"); 
	System.out.print ("bye \n");
	}
}