import java.util.Random;

public class question4 {
	public static void main(String[] args) {
	Random r = new Random();
	int[] dizi = {1,3,5,7,9};
	int[] rastgeleSayilar = new int[3];
	int enKucukCarpim =Integer.MAX_VALUE;
	int enBuyukCarpim = Integer.MIN_VALUE;
	int a = r.nextInt(1,15);
	
	
	for(int i=0;i<rastgeleSayilar.length;i++) {
		int index = r.nextInt(dizi.length);
		rastgeleSayilar[i]=dizi[index];
	}

	
	for(int i = 0 ; i<rastgeleSayilar.length;i++) {
		
		int carpim = a*rastgeleSayilar[i];
		System.out.println(a+" X "+rastgeleSayilar[i]+" ="+carpim);
		if(enKucukCarpim>carpim) {
			enKucukCarpim=carpim;
		}
	}
	
	System.out.println();
	System.out.println("En küçük değer => "+enKucukCarpim);
	System.out.println();
	 
	for(int i= 0; i<3;i++) {
		System.out.println(enKucukCarpim+" X "+enKucukCarpim*(i+1)+" ="+enKucukCarpim*(enKucukCarpim*(i+1)));
		if(enBuyukCarpim<enKucukCarpim*(enKucukCarpim*(i+1))){
			enBuyukCarpim=enKucukCarpim*(enKucukCarpim*(i+1));
		}
	}
	
	System.out.println(); 
	System.out.println("En Büyük Değer => "+enBuyukCarpim);
	System.out.println();
	
  }
}
