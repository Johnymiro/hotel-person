package org.academiadecodigo.stringrays;

public class Hotel {

    private int numOfRoomAvailable;
    private String name;

    private  Boolean keysGiven = false;

    private Room[] rooms = new Room[numOfRoomAvailable];


    public Hotel(int numOfRoomAvailable, String name){

        this.numOfRoomAvailable = numOfRoomAvailable;
        this.name = name;

        for(int i = 0; i < numOfRoomAvailable; i++){

            rooms[i] = new Room(i + 1);
        }
    }





    public boolean checkIn(){

        int roomNumber = 0;


        for(int i = 0; i < rooms.length; i++){

            if(rooms[i].getRoomAvailable()){
                roomNumber = i;
                break;
            }

            else if(i == rooms.length - 1 && !rooms[i].getRoomAvailable()){
                return rooms[i].getRoomAvailable();
            }
        }



        if(rooms[roomNumber].getRoomAvailable()){

            keysGiven = true;
            rooms[roomNumber].setRoomAvailable(!keysGiven);
        }

        return keysGiven;
    }



    public Boolean ckeckOut(int roomNumber){

        if(keysGiven){

            keysGiven = false;
            rooms[roomNumber].setRoomAvailable(!keysGiven);



        }

        return keysGiven;
    }

    public int getNumOfRoomAvailable(){
        return this.numOfRoomAvailable;
    }

    public String getName(){

        return this.name;
    }
}

