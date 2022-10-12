public class Tes1 {
	public static void main(String args[]) {
		MesinAtm mesinAtm = new MesinAtm();
		
		mesinAtm.ambilUang(new KartuAtm());
		mesinAtm.ambilUang(new KartuSilver());
		mesinAtm.ambilUang(new KartuGold());
		mesinAtm.ambilUang(new KartuPlatinum());
	}
}