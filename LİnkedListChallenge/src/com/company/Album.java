package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration) {
        Song song = new Song(title,duration);
        if(hasSong(title)) {
            return false;
        }
        this.songs.add(new Song(title,duration));
        return true;
    }

    private boolean hasSong(String title) {
        for(int i=0; i<this.songs.size(); i++) {
            if(this.songs.get(i).getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

}



