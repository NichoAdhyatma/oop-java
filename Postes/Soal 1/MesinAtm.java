public class MesinAtm {
		public void ambilUang(KartuAtm card) {
			System.out.print("Anda dapat mengambil uang hingga ");
			card.ambilUang();
			System.out.println();
		}
}