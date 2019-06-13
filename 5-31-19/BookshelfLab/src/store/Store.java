package store;

import java.time.LocalTime;

public abstract class Store {
    String name, address;
    int sqrFeet;
    LocalTime openAt, closedAt;
    boolean openSatuday, openSunday;
    public Store() {
    }

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSqrFeet() {
        return sqrFeet;
    }

    public void setSqrFeet(int sqrFeet) {
        this.sqrFeet = sqrFeet;
    }

    public LocalTime getOpenAt() {
        return openAt;
    }

    public void setOpenAt(int hr, int min) {
        this.openAt = LocalTime.of(hr,min);
    }

    public LocalTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(int hr, int min) {
        this.closedAt = LocalTime.of(hr, min);
    }

    public boolean isOpenSatuday() {
        return openSatuday;
    }

    public void setOpenSatuday(boolean openSatuday) {
        this.openSatuday = openSatuday;
    }

    public boolean isOpenSunday() {
        return openSunday;
    }

    public void setOpenSunday(boolean openSunday) {
        this.openSunday = openSunday;
    }

    public boolean isOpen(){
        return LocalTime.now().isAfter(openAt) && LocalTime.now().isBefore(closedAt);
    }
}
