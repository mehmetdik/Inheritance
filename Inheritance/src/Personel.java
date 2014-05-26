
public class Personel {

	private String isim;
	private String soyisim;
	private int yas;
	
	public Personel(){
		isim="Henüz girilmedi";
		soyisim="Henüz girilmedi";
		yas=0;
	}
	public Personel(String isim,String soyisim,int yas)
	{
		this.isim=isim;
		this.soyisim=soyisim;
		this.yas=yas;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getIsim() {
		return isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public int getYas() {
		return yas;
	}
		
	
	public String getKimlikBilgileri(){
		return"KimlikBilgileri:isim:"+isim+"Soyisim:"+soyisim+"Yasi:"+yas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"KimlikBilgileri:\nisim:"+isim+"\nSoyisim:"+soyisim+"\nYasi:"+yas;
	}
	
}
