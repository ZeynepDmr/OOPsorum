/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopBnmSorum;

public class Camiler extends IbadetYapilari{

	private String bulunduguSehir;

	public Camiler (String adi, int yapimTarihi, String eserMimari) {
		super (adi, yapimTarihi, eserMimari);
		this.bulunduguSehir="Edirne";
		
	}

	public Camiler(String adi, int yapimTarihi, String eserMimari, String bulunduguSehir){
		super(adi, yapimTarihi, eserMimari);
		this.bulunduguSehir=bulunduguSehir;
	}
        
        public void bilgi(){
            System.out.println("Yapı Bilgieri: ");
        }
        
	public String getBulunduguSehir() {
		return this.bulunduguSehir;
	}

	public void setBulunduguSehir(String bulunduguSehir) {
		this.bulunduguSehir = bulunduguSehir;
	}

}
