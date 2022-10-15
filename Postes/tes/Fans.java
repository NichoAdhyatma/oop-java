public class Fans {
	private String name;

	public Fans() {
		this("noname");
	}

	public Fans(String name) {
		this.name = name;
	}

	public  void showName() {
		System.out.print(this.name + ": ");
	}

	public void watchingPerformance() {
		showName();
		System.out.println("melihat idolnya dari youtube");
	}

	public void watchingPerformance(Musician musician) {
		showName();
		System.out.print("melihat idolnya");
		musician.perform();
		System.out.println();
	}
	
}

class KpopFans extends Fans {
	public KpopFans() {
		super("noname");
	}

	public KpopFans(String name) {
		super(name);
	}

	public void watchingPerformance(Musician musician, String expression) {
		super.showName();
		System.out.print(expression + " melihat idolnya");
		musician.perform();
		System.out.println();
	}

	
}