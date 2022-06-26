
public class LocalAndGlobalDegiskenlerr {
	
	
	static int sonuc = 0;
	/* local degişken : tanımladığı kod bloğu içerisinde(döngü,metod,kontrol yapıları)
	 * içinde tanımlanır. sadece tanımlandığı kod bloğu içerisinde çağrılır.
	 * güncelleme yapılır.tanımlandığı kod bloğu dışında bu değişkenkere erişim sağlanmaz.
	 * erişim sağlanmadığı için tuttuğu değeri bilemeyiz.
	 * Global değişkenler: sınıfın her yerinde erişilebilen değişkenlerdir.	
	 */

	public static void main(String[] args) {
	
		for(int i = 1;i<100; i ++) {
			sonuc = sonuc +1;
			
			
		}System.out.println(sonuc);
		

	}
	

}
