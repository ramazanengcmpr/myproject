package deneme;


public class denemeodev3 {
    private String ad;
    private int yas;

    public denemeodev3(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci [ad=" + ad + ", yas=" + yas + "]";
    }

    public static void main(String[] args) {
    	String str = "baris yildiz";
   char karakter =str.charAt(3);
   System.out.println(karakter);
   String altDize=str.substring(karakter);
   System.out.println(altDize);
    	
   int index=str.indexOf(karakter);
   System.out.println(index);
   int index1=str.indexOf("java");
   System.out.println(index1);
   String buyukHarf=str.toUpperCase();
   String kucukHarf=str.toLowerCase();
   System.out.println(buyukHarf);
    	denemeodev3 ogrenci = new denemeodev3("Ahmet", 20);

        // toString() metodunu çağırma
        String ogrenciBilgisi = ogrenci.toString();

        // Varsayılan toString() çıktısı
        System.out.println("Varsayılan toString(): " + ogrenciBilgisi);

        // Özelleştirilmiş toString() çıktısı
        System.out.println("Özelleştirilmiş toString(): " + ogrenci);
    }
}
