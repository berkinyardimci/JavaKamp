package intro;

import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {
		
		// camelCase --> degisken_isimlerinde
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.13;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun){
			System.out.println("Dolar düþtü");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi");
		}
		else {
			System.out.println("Dolar Eþittir");
		}
		
		String[] krediler =
			{
				"Hýzlý Kredisi",
				"Meb Kredisi",
				"Msb Kredisi",
				"Çiftçi Kredisi",
				"Konut Kredisi",
			};
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {100,200,300,400,500};
		sayilar1 = sayilar2;
		sayilar2[0] =100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);

	}
	
	
	
}
 