package by.itacademy.keikom.taxi.entity;

public class Car {
	
	private Integer carId;
	private String carModel;
	private Integer carReleaseYear;
	private Integer carNumberOfSeats;
	private String carClass;
	
	
	public Car(Integer carId, String carModel, Integer carReleaseYear, Integer carNumberOfSeats, String carClass) {
		super();
		this.carId = carId;
		this.carModel = carModel;
		this.carReleaseYear = carReleaseYear;
		this.carNumberOfSeats = carNumberOfSeats;
		this.carClass = carClass;
	}
	
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Integer getCarReleaseYear() {
		return carReleaseYear;
	}
	public void setCarReleaseYear(Integer carReleaseYear) {
		this.carReleaseYear = carReleaseYear;
	}
	public Integer getCarNumberOfSeats() {
		return carNumberOfSeats;
	}
	public void setCarNumberOfSeats(Integer carNumberOfSeats) {
		this.carNumberOfSeats = carNumberOfSeats;
	}
	public String getCarClass() {
		return carClass;
	}
	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carModel=" + carModel + ", carReleaseYear=" + carReleaseYear
				+ ", carNumberOfSeats=" + carNumberOfSeats + ", carClass=" + carClass + "]";
	}
	
	

}
