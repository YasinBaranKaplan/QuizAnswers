import java.util.Scanner;

public class question3 {
	public static void main(String[]args) {
		int[] dizi1 = new int[3];
		int[] dizi2 = new int[3];
		int[] dizi3 = new int[3];
		int[][] matris = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen birinci dizinin üç elemanını giriniz => ");
		for(int i = 0 ;i<dizi1.length;i++) {
			dizi1[i]=input.nextInt();
		}
		
		System.out.println("Lütfen ikinci dizinin üç elemanını giriniz => ");
		for(int i = 0 ;i<dizi2.length;i++) {
			dizi2[i]=input.nextInt();
		}
		
		System.out.println("Lütfen üçüncü dizinin üç elemanını giriniz => ");
		for(int i = 0 ;i<dizi3.length;i++) {
			dizi3[i]=input.nextInt();
		}
		
		System.out.println("3X3 lük yeni bir matris oluşturldu.");
		
		matris[0]=dizi1;
		matris[1]=dizi2;
		matris[2]=dizi3;
		
		for(int i = 0; i<matris.length; i++) {
			for(int k = 0; k<matris[0].length;k++) {
				System.out.print(matris[i][k]+" ");
			}
		  System.out.println();	
		}
		
		System.out.println("Matrisin değişen sonuçları.");
		for(int i = 0; i<matris.length; i++) {
			for(int k = 0; k<matris[0].length;k++) {
				System.out.print(matris[i][k]*matris[i][k]+" ");
			}
		  System.out.println();	
		}
  }
}
