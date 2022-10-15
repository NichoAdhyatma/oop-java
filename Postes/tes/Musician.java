public class Musician {

	public void perform() {
		System.out.print(" beraksi di atas panggung");
	}

}

class Singer extends Musician {
	public void perform() {
		super.perform();
		System.out.print(" bernyanyi dengan merdu");
	}
}


class Kpop extends Singer {
	public void perform() {
		super.perform();
		System.out.print(" dan ngedance");
	}
}

class Biduan extends Singer {
	public void perform() {
		super.perform();
		System.out.print(" dengan cengkok melayu");
	}
}



