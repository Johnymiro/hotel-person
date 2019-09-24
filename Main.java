package org.academiadecodigo.stringrays;

public class Main {

    public static void main(String[] args) {


        Hotel hotel1 = new Hotel(34, "IBIS");
        Person person1 = new Person();

        person1.checkRoomAvailable(hotel1);

        person1.doCheckIn(hotel1);

        person1.checkRoomAvailable(hotel1);

        person1.doCheckOut(hotel1);

        person1.checkRoomAvailable(hotel1);

    }

}
