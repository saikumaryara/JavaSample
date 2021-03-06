import java.io.Serializable;

public class TruckVehicle extends Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;
	static int height;
	static int width;
	static int length;

	static {
		height = 10;
		width = 20;
		length = 40;
	}

	public TruckVehicle(String make, String model, int modelyear, double kpl, String licence) {
		super(make, model, modelyear, kpl, licence);
	}

	public int cargoArea() {
		int area = height * width * length;
		return area;
	}

	public void display() {
		System.out.println(super.make + "\t\t" + super.model + "\t\t " + super.modelyear + "\t\t" + super.Range() + "\t"
				+ super.licence + "\t" + height + "\t" +width + "\t" +length + "\t"
				+ this.cargoArea());

	}

}
