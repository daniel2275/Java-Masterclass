package com.danielradonic;


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public static Album createAlbum(String albumName, String artistName){
        return new Album(albumName,artistName);
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public Song findSong(int songIndex) {
        for (Song song : this.songs) {
            if (songIndex >= 0 && songIndex < this.songs.size()) {
                return this.songs.get(songIndex);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1 ;
        if (index >= 0 && index < this.songs.size()) {
            playList.add(this.songs.get(index));
            System.out.println("Added track -> [" + trackNumber + "] Name ->" + this.songs.get(index).getTitle());
            return true;
        }
        System.out.println("Not found track [" + trackNumber + "]");
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song foundSong = findSong(songTitle);
        if (foundSong != null) {
            playList.add(foundSong);
            System.out.println(songTitle + " <- Added ");
            return true;
        }
        System.out.println(songTitle + "<- Not found ");
        return false;
    }

    public boolean removeSong(Song removeSong) {
        if (removeSong !=null) {
            songs.remove(removeSong);
            return true;
        }
        return false;
    }

    public void listSongs(){
        System.out.println("Listing of songs:");
        System.out.println("=================================");
        for (Song song: songs){
            System.out.println(songs.indexOf(song) + " : " + song.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
}
