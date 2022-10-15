public class Supervisor {
	public Supervisor(){}
	
	public void mengamati(Karyawan karyawan){
		System.out.print("Supervisor mengamati karyawan yang sedang bekerja");
		karyawan.bekerja();
		System.out.println();
	}
}