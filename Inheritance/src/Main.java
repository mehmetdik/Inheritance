
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel personel= new Personel("Mehmet","Dik",20);
		Ogrenciler ogrenci =new Ogrenciler("Mehmet","Dik",20,"Mühendislik","Bilgisayar",2012);
		Unicalisan calisan =new Unicalisan("Ahmet","FEVZİ",34,"Temizlikçi",2000,4385);
		
		System.out.println(personel.toString());
		System.out.println();
		System.out.println(ogrenci.toString());
		System.out.println(calisan.toString());
		
	}

}
