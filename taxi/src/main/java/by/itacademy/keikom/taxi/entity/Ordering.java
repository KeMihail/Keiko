package by.itacademy.keikom.taxi.entity;

import java.util.Date;

public class Ordering {

	private Integer orderingId;
	private Integer orderingClientId;
	private Integer orderingCarId;
	private Date timeOrdering;
	private Date timeOfArrivelCar;
	private Date arrivalTime;
	private Integer summa;
	private Integer distance;
	
	
	public Ordering(Integer orderingId, Integer orderingClientId, Integer orderingCarId, Date timeOrdering,
			Date timeOfArrivelCar, Date arrivalTime, Integer summa, Integer distance) {
		super();
		this.orderingId = orderingId;
		this.orderingClientId = orderingClientId;
		this.orderingCarId = orderingCarId;
		this.timeOrdering = timeOrdering;
		this.timeOfArrivelCar = timeOfArrivelCar;
		this.arrivalTime = arrivalTime;
		this.summa = summa;
		this.distance = distance;
	}
	public Integer getOrderingId() {
		return orderingId;
	}
	public void setOrderingId(Integer orderingId) {
		this.orderingId = orderingId;
	}
	public Integer getOrderingClientId() {
		return orderingClientId;
	}
	public void setOrderingClientId(Integer orderingClientId) {
		this.orderingClientId = orderingClientId;
	}
	public Integer getOrderingCarId() {
		return orderingCarId;
	}
	public void setOrderingCarId(Integer orderingCarId) {
		this.orderingCarId = orderingCarId;
	}
	public Date getTimeOrdering() {
		return timeOrdering;
	}
	public void setTimeOrdering(Date timeOrdering) {
		this.timeOrdering = timeOrdering;
	}
	public Date getTimeOfArrivelCar() {
		return timeOfArrivelCar;
	}
	public void setTimeOfArrivelCar(Date timeOfArrivelCar) {
		this.timeOfArrivelCar = timeOfArrivelCar;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Integer getSumma() {
		return summa;
	}
	public void setSumma(Integer summa) {
		this.summa = summa;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Ordering [orderingId=" + orderingId + ", orderingClientId=" + orderingClientId + ", orderingCarId="
				+ orderingCarId + ", timeOrdering=" + timeOrdering + ", timeOfArrivelCar=" + timeOfArrivelCar
				+ ", arrivalTime=" + arrivalTime + ", summa=" + summa + ", distance=" + distance + "]";
	}
	
	

}
