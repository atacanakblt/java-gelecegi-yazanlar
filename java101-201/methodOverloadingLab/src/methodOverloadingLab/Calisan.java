package methodOverloadingLab;

import java.util.Date;

public class Calisan {

	private String isim;
	private String bolum;
	private Date iseGirişTarihi;
	
	public Calisan() {
		
	}
	
	public Calisan(String bolum) {
		this.bolum = bolum;
	}
	
	public Calisan(String bolum, String isim) {
		this.bolum = bolum;
		this.isim = isim;
	}
	
	public Calisan(String bolum, String isim, Date iseGirisDate) {
		this.bolum = bolum;
		this.isim = isim;
		this.iseGirişTarihi = iseGirisDate;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public Date getIseGirişTarihi() {
		return iseGirişTarihi;
	}
	public void setIseGirişTarihi(Date iseGirişTarihi) {
		this.iseGirişTarihi = iseGirişTarihi;
	}
	
	public void bilgileriYazdir() {
		System.out.println("İsim : " + isim);
		System.out.println("Bölüm : " + bolum);
		System.out.println("İşe Giriş Tarihi : " +iseGirişTarihi);
		System.out.println("------------------------------------------");

		
	}
	
	
}
