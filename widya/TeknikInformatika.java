/*	Nama	: Widya Wardani
  	kelas	: B1 TI
	waktu	: 21.57
  hari/tgl : senin/16 maret 2020
*/
public class TeknikInformatika{
	public static void main(String[] args){
			int detik, menit, jam, sisa1,sisa2;
			detik = 5200;
	
		jam = detik/3600;
		sisa1 = detik%3600;
		
		menit = (int) sisa1/60;
		sisa2 = sisa1%60;
		
		System.out.println("Hasil Konversi : " + detik + " Detik = " + jam + " Jam : " + menit + " Menit : " + sisa2 + " Detik");
	
	}
}