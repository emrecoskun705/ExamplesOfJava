package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Album> albums = new ArrayList<Album>();

    private static LinkedList<Song> playlist = new LinkedList<Song>();

//    private static ListIterator<Song> listIterator = playlist.listIterator();

    public static void main(String[] args) {


        Album album1 = new Album("Album1","emre");
        Album album2 = new Album("Album2","umut");
        
        albums.add(album1);
        albums.add(album2);
        
        album1.addSong("Music1",2.34);
        album1.addSong("Music2",2.23);
        album1.addSong("Music3",2.45);
        album1.addSong("Music4",3.50);
        album1.addSong("Music5",2.14);

        album2.addSong("Music6",2.32);
        album2.addSong("Music7",2.08);
        album2.addSong("Music8",2.12);
        album2.addSong("Music9",3.43);
        album2.addSong("Music10",2.12);

        boolean quit = false;
        int choice = 0;
        instructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    addSongInPlaylist();
                    break;
//                case 2:
//                    moveForwardInPlaylist();
//                    break;
//                case 3:
//                    moveBackwardInPlaylist();
//                    break;
                case 2:
                    showPlaylist();
                    break;
                case 3:
                    instructions();
                    break;
            }

        }

        ListIterator<Song> listIterator = playlist.listIterator();

        quit = false;
        boolean goingForward = false;
        instructions1();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
//                case 1:
//                    addSongInPlaylist();
//                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println(listIterator.next().getTitle());;
                    } else {
                        System.out.println("Reached end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous().getTitle());;
                    } else {
                        goingForward = true;
                        System.out.println("Beginning");
                    }
                    break;
                case 3:
                    showPlaylist();
                    break;
                case 4:
                    instructions1();
                    break;
            }

        }
    }

    private static void instructions1() {
        System.out.println("\t0 -- to quit\n" +
                "\t1 -- move forward\n" +
                "\t2 -- move backward\n" +
                "\t3 -- show play list\n" +
                "\t3 -- for instructions\n");
    }

    private static void instructions() {
        System.out.println("\t0 -- to quit\n" +
                            "\t1 -- add song in playlist\n" +
                            "\t2 -- show playlist\n" +
                            "\t3 -- for instructions\n");
    }

    private static void showPlaylist() {
        for(int i=0; i<playlist.size(); i++) {
            System.out.println((i+1) + " :" + playlist.get(i).getTitle());
        }
    }

//    private static void moveForwardInPlaylist() {
//        if(listIterator.hasNext()) {
//            System.out.println(listIterator.next());;
//        } else {
//            System.out.println("Reached end of the list");
//        }
//    }
//
//    private static void moveBackwardInPlaylist() {
//        if(listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous().getTitle());;
//        } else {
//            System.out.println("Beginning");
//        }
//    }


    private static void addSongInPlaylist() {
    // selectAlbum();
     //selectSong();
     addSong();
    }

    private static Album selectAlbum() {
        System.out.println("Albums: ");
        for(int i=0 ; i<albums.size(); i++) {
            System.out.println((i+1) + " :" + albums.get(i).getName());
        }
        System.out.println("Choose album:");
        int albumChoice = scanner.nextInt() - 1;
        scanner.nextLine();
        return albums.get(albumChoice);
    }

    private static Song selectSong() {
        ArrayList<Song> songList = selectAlbum().getSongs();
        System.out.println("Songs:");
        for(int i=0; i<songList.size(); i++) {
            System.out.println((i+1) + " :" + songList.get(i).getTitle());
        }
        System.out.println("Choose song: ");
        int songChoice = scanner.nextInt() - 1;
        scanner.nextLine();
//        Song song = songList.get(songChoice);
//        if(songList.contains(song)){
//            System.out.println(song.getTitle() + " already in the playlist");
//            return null;
//        }

        return songList.get(songChoice);
    }

    private static void addSong() {
        Song song = selectSong();
        playlist.add(song);


    }


}
