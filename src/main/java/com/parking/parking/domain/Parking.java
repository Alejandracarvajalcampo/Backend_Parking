package com.parking.parking.domain;

public class Parking {

    private int parkingId;
    private int carCapacity;
    private int motorcycleCapacity;
    private int carSpaceAvailable;
    private int motorcycleSpaceAvailable;

    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public int getMotorcycleCapacity() {
        return motorcycleCapacity;
    }

    public void setMotorcycleCapacity(int motorcycleCapacity) {
        this.motorcycleCapacity = motorcycleCapacity;
    }

    public int getCarSpaceAvailable() {
        return carSpaceAvailable;
    }

    public void setCarSpaceAvailable(int carSpaceAvailable) {
        this.carSpaceAvailable = carSpaceAvailable;
    }

    public int getMotorcycleSpaceAvailable() {
        return motorcycleSpaceAvailable;
    }

    public void setMotorcycleSpaceAvailable(int motorcycleSpaceAvailable) {
        this.motorcycleSpaceAvailable = motorcycleSpaceAvailable;
    }
}
