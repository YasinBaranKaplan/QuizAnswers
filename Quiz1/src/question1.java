import java.util.Random;


public class question1 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] dizi = {1,3,4,5,7};
		int[] array1 = new int[3];
		int[] array2 = new int[3];
		
		for(int i = 0; i<array1.length; i++) {
			int index = r.nextInt(dizi.length);
			array1[i]=dizi[index];
		}
		
		for(int i = 0; i<array1.length; i++) {
			int index = r.nextInt(dizi.length);
			array2[i]=dizi[index];
		}
		
		System.out.println("ilk dizi.");
		for(int i = 0;i<3;i++) {
			System.out.println(array1[i]);
		}
		System.out.println("ikinci dizi.");
		for(int i = 0;i<3;i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("Yeni dizi.");
		for(int k = 0;k<3;k++) {
			System.out.println(array1[k]+""+array2[k]+" "+array1[k]*array2[k]);
		}
	}
}
