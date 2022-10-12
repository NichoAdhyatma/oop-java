public class Player{
	public String type = "Player shoots with ";

	public void shooting(Gun gun) {
		System.out.print(type);
		gun.shoot();
		System.out.println();
	}
}