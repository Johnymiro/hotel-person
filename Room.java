package org.academiadecodigo.stringrays;

public class Room {

    private boolean roomAvailable = true;
    private int roomNumber;

    public Room(int roomNumber){

        this.roomNumber = roomNumber;
    }


    public void setRoomAvailable(boolean roomAvailable){

        this.roomAvailable = roomAvailable;
    }

    public boolean getRoomAvailable(){

        return roomAvailable;
    }

    public int getRoomNumber(){

        return roomNumber;
    }
}
