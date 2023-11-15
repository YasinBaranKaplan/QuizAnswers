import java.util.Scanner;

public class question2 {
	public static int Faktoriyel(int faktor) {
		int sonuc = 1;
		
		for(int i = 1 ; i<=faktor;i++) {
			sonuc=sonuc*i;
		}
		return sonuc;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen iki sayı giriniz => ");
		int sayi1 = input.nextInt();
		int sayi2 = input.nextInt();
		int index = sayi1;
		double sonuc =0;
		
		int[] dizi = new int[sayi2-sayi1+1];
			for(int k = 0 ; k<dizi.length; k++) {
				dizi[k]=index;
				index++;
			}
		
			for(int i = 0 ; i<dizi.length;i++) {
				System.out.print(dizi[i]+" ");
			}
			System.out.println();
	
			
			for(int i = 0 ; i<=sayi2-sayi1;i++){
			
			sonuc=sonuc+Faktoriyel(i+1)+dizi[i];
			
			if(i==sayi2-sayi1) {
				System.out.print(Faktoriyel(i+1)+"/"+dizi[i]);
			}
			else {
			System.out.print(Faktoriyel(i+1)+"/"+dizi[i]+"+");
			}
		}
			System.out.println();
	  System.out.println("Sonuc = "+sonuc);
	}

}
