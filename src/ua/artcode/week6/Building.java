package ua.artcode.week6;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by serhii on 9/10/16.
 */
public class Building {

    private int square;
    private List<Room> rooms;

    // nested - static class


    public static class Window {
        int height;
        int width;

        public Window(int height, int width) {
            this.height = height;
            this.width = width;
        }
    }

    public static class Some {
        public static void main(String[] args) {
            System.out.println("System out");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        }
    }


    private class Room {
        // use building info
        private int square;

        public Room(int square) {
            this.square = square;
        }
    }

    public static void main(){

    }


}
