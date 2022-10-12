public class Gun {
	private int bullets;

	public void shoot() {
		System.out.print("Gun");
	}
}

class MachineGun extends Gun {
	public void shoot() {
		System.out.print("Machine Gun");
	}
}

class LightMachineGun extends MachineGun {
	public void shoot() {
		System.out.print("Light Machine Gun");
	}
}

class MediumMachineGun extends MachineGun {
	public void shoot() {
		System.out.print("Medium Machine Gun");
	}
}