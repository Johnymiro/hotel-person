package org.academiadecodigo.stringrays;

public class Person {

    private boolean gotRoom;


    public void doCheckIn(Hotel hotel) {

        gotRoom = hotel.checkIn();
        if (gotRoom) {
            System.out.println("Check-in successfull, you got the room.\n");
        }
        else {
            System.out.println("Check-in fail.\n");
        }

    }


    public void doCheckOut(Hotel hotel) {

        gotRoom = hotel.ckeckOut();

        if (!gotRoom) {
            System.out.println("Check-out successfull.\n");
        }
        else {
            System.out.println("Check-out fail.\n");
        }


    }

    public void checkRoomAvailable(Hotel hotel) {

        System.out.println("Hotel " + hotel.getName() + " has: " + hotel.getNumOfRoomAvailable() + " rooms available");
    }

    public Boolean getGotRoom() {

        return gotRoom;
    }
}
