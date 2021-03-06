public class VehicleTest {

	public void run() {
		Vehicle v1 = new Vehicle("Volvo", "S80", 2008, 10, "VBG984");
		Vehicle v2 = new Vehicle("BMW", "M8", 2019, 12, "VBG985");
		Vehicle v3 = new Vehicle("Ferrari", "Roma", 2020, 15, "VBG986");

		System.out.println("Brand \t\tModel \t\tModelYear \tRange \tlicence");
		System.out.println("-------\t\t-------\t\t---------\t------\t-------");
		v1.display();
		v2.display();
		v3.display();
	}

	public static void main(String[] args) {

		VehicleTest v = new VehicleTest();
		v.run();
		VehicleRegistry vr = new VehicleRegistry();
		vr.addList();
		vr.getObjects();
		System.out.println("-----------------");
		vr.getList();
		vr.removeList();
		vr.setMaps();
		System.out.println("based on licence plate::" + vr.getMaps("VBG984"));

	}

}
