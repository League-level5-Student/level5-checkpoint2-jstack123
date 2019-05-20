
public class CarMPGEntry implements Comparable{
	public float mpg;
	public int cylinders;
	public float displacement;
	public float horsePower;
	public float weight;
	public float acceleration;
	public int modelYear;
	public int	origin;
	public String carName;
	@Override
	public int compareTo(Object c) {
		CarMPGEntry car = (CarMPGEntry) c;
		return this.carName.compareTo(car.carName);
	}
}

