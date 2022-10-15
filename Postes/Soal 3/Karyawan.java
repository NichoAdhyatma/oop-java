public class Karyawan {
	public void bekerja(){
		System.out.print(" ");
	}
}


class Programmer extends Karyawan {

	public void bekerja(){
		super.bekerja();
		System.out.print("membuat aplikasi");
	}
}

class LeadProgrammer extends Programmer{

	public void bekerja(){
		System.out.print(" membuat design aplikasi");
	}
}
                         

class CleaningService extends Karyawan {
	public void bekerja(){
		super.bekerja();
		System.out.print("membersihkan toilet");
	}
}

