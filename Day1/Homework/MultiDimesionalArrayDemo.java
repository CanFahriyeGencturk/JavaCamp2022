package odev1MiniProjeler;

public class MultiDimesionalArrayDemo {
	public static void main(String[] args) {
		System.out.println("********************* Video 16 *********************");

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "�stanbul ";
		sehirler[0][1] = "Bursa ";
		sehirler[0][2] = "Bilecik ";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {

			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("------------------");
		}
	}
}
