
public class Unicalisan extends Personel {

	String meslek;
	int maas;
	int persno;
	public String getMeslek() {
		return meslek;
	}
	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public int getPersno() {
		return persno;
	}
	public void setPersno(int persno) {
		this.persno = persno;
	}
	
	public Unicalisan(String isim,String soyisim,int yas,String meslek,int maas,int persno)
	{
		super(isim,soyisim,yas);
		this.meslek=meslek;
		this.maas=maas;
		this.persno=persno;
				
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nMeslek="+" "+getMeslek()+"\nMaas="+" "+getMeslek()+"\nPersno="+" "+getPersno();
	}
	
}
