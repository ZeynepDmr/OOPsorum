/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopBnmSorum;

public class TarihiYapilar {
	
	private String adi;
	private int yapimTarihi;
    private String eserMimari;

	
	TarihiYapilar(){
		
	}

	public TarihiYapilar(String adi, int yapimTarihi, String eserMimari){
		this.adi = adi;
		this.yapimTarihi = yapimTarihi;
		this.eserMimari = eserMimari;
	}
   
        public void bilgi(){
			System.out.println("Tarihi Yapılar; ");
        }

	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getYapimTarihi() {
		return yapimTarihi;
	}
	public void setYApimTarihi(int  yapimTarihi) {
		this.yapimTarihi =  yapimTarihi;
	}
	
    public String getEserMimari(){
        return eserMimari;
    }
	
	 public void setEserMimari(String eserMimari){
        this.eserMimari = eserMimari;
	
	 }
}
