/*
Soruda sizden şunlar istenmektedir: 
Tarihi Yapılar isimli bir sınıf oluşturunuz. Bu sınıfa; 'adi' ,
'yapimTarihi', 'eserMimari', isimlerinde özellikler tanımlayınız.
(Özelliklerde private erişim düzenleyicisinden yararlanınız.)
Sınıfa, özelliklere değer atayan bir yapıcı metot tanımlayınız.
Sınıf, 'IbadetYapilari' isimli bir alt sınıf içersin. Bu sınıfa ise
'Camiler' isimli bir alt sınıf tanımlayınız. Bu Camiler sınıfının 'bulunduguSehir' 
isimli bir özelligi bulunmalıdır.
Çeşitli metotlar( en azbiri tanesi polymorphsim içermelidir) ve geliştireceğiniz 
içerikle yukarıda sizden istenilenleri,
aşağıdaki paragrafta bulunan bilgilerden faydalanarak kodlayınız. 

[ Selimiye Camii, 1575 yilinda Mimar Sinan tarafından Edirne'de yapılmıştır. ]

Çıktı Şu şekilde olmalıdır:

Tarihi Yapılar; 
Camiler
Yapı Bilgieri: 
Yapı Adı: Selimiye Camii
Yapılış Tarihi: 1575
Eserin Mimari: Mimar Sinan
Bulunduğu Şehir: Edirne

 */
package oopBnmSorum;
/**
 *
 * @zeynep
 */
public class OOPTarihiYapilar {

   
    public static void main(String[] args) { 
  
        TarihiYapilar yapi = new TarihiYapilar();
        yapi.bilgi();
        
        
      Camiler cami = new Camiler("Selimiye Camii", 1575, "Mimar Sinan", "Edirne");
      cami.bilgi();
        
        System.out.println("Yapı Adı: " + cami.getAdi());
        System.out.println("Yapılış Tarihi: " + cami.getYapimTarihi());
	    System.out.println("Eserin Mimari: " + cami.getEserMimari());
		System.out.println("Bulunduğu Şehir: " + cami.getBulunduguSehir());
		
		
    }
    
}
