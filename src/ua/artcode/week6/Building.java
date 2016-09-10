package ua.artcode.week6;

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

    private class Room {
        // use building info
        private int square;

        public Room(int square) {
            this.square = square;
        }
    }



}
