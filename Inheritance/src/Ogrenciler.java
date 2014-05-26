
public class Ogrenciler extends Personel {
	 String fakulte;
	 String bolum;
	 int ogrncinum;
	 
	 public String getFakulte() {
		return fakulte;
	}
	public void setFakulte(String fakulte) {
		this.fakulte = fakulte;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public int getOgrncinum() {
		return ogrncinum;
	}
	public void setOgrncinum(int ogrncinum) {
		this.ogrncinum = ogrncinum;
	}
	public Ogrenciler(String isim,String soyisim,int yas,String fakulte,String Bolum,int ogrncinum)
	{
		super(isim,soyisim,yas);
		this.bolum=bolum;
		this.fakulte=fakulte;
		this.ogrncinum=ogrncinum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nFakültesi"+" "+getFakulte()+" "+"\nBölümü"+" "+getBolum();
		}
	
}
