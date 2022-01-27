package com.danielradonic;

public class Room {
    private Walls wall;
    private Door door;
    private Window window;
    private Bed bed;
    private NightStand nightStand;

    public Room(Walls wall, Door door, Window window, Bed bed, NightStand nightStand) {
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.bed = bed;
        this.nightStand = nightStand;
    }

    public Walls getWall() {
        return wall;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public Bed getBed() {
        return bed;
    }

    public NightStand getNightStand() {
        return nightStand;
    }

    public void switchNightStandLight() {
        nightStand.getLamp().switchOnOff();
    }

    public void openCloseDoor() {
        System.out.print("The door is ");
        door.setOpenClose();
    }

    public void openCloseWindow() {
        System.out.print("The window is ");
        window.setOpenClose();
    }


}
