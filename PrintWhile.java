/*NIM 		: 13020210067
NAMA		: YAYANG NURAVIN NABILAH
HARI/TANGGAL	:SELASA,21 MARET 2023*/

import java.util.Scanner;
public class PrintWhile {
	public static void main(String[] args) {

	int N;
	int i;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Nilai N > 0 = "); /* Inisialisasi */ 
	N = masukan.nextInt();
	i = 1; /* First Elmt */
	
	System.out.print ("Print i dengan WHILE: \n");
	while (i <= N) /* Kondisi pengulangan */
	{ System.out.println (i); /* Proses */
	i++; 
	}; 
	}
}