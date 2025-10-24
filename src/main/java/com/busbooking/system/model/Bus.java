package com.busbooking.system.model;

import jakarta.persistence.*;
import java.time.LocalTime;
import java.time.LocalDate;

@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String busName;
    private String source;
    private String destination;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private int seats;
    private double price;
    private String busType = "STANDARD";
    private boolean active = true;
    
    // New field for bus schedule dates
    private LocalDate startDate;
    private LocalDate endDate;
    private String operatingDays; // e.g., "MON,TUE,WED,THU,FRI,SAT,SUN"

    public Bus() {}

    public Bus(String busName, String source, String destination, LocalTime departureTime, 
               LocalTime arrivalTime, int seats, double price, String busType) {
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seats = seats;
        this.price = price;
        this.busType = busType;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusYears(1);
        this.operatingDays = "MON,TUE,WED,THU,FRI,SAT,SUN";
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBusName() { return busName; }
    public void setBusName(String busName) { this.busName = busName; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public LocalTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(LocalTime departureTime) { this.departureTime = departureTime; }

    public LocalTime getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(LocalTime arrivalTime) { this.arrivalTime = arrivalTime; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getBusType() { return busType; }
    public void setBusType(String busType) { this.busType = busType; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getOperatingDays() { return operatingDays; }
    public void setOperatingDays(String operatingDays) { this.operatingDays = operatingDays; }
}