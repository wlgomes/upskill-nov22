package com.wlgomes;

import java.util.HashSet;
import java.util.LinkedList;

public class Album extends MusicArtifact {
    private LinkedList<Song> albumTracks = new LinkedList<>();
    public LinkedList<Song> getTracks() {
        return this.albumTracks;
    }

    public void setTracks(LinkedList<Song>albumTracks) {
        this.albumTracks = albumTracks;
    }

    public Album() {
    }
    public Album(int albumID, String title, LinkedList<Artist> artists, LinkedList<Song> albumTracks) {
        this.id = albumID;
        this.name = title;
        this.artists = new HashSet<Artist>();
        this.albumTracks = new LinkedList<Song>();
    }
    //constructor without tracks so they can be added later
    public Album(int albumID, String title, HashSet<Artist> artists) {
        this.id = albumID;
        this.name = title;
        this.artists = new HashSet<Artist>();
    }
    @Override
    public boolean findSong(String title){
        for(Song song : albumTracks){
            if(song.getName().equals(title))
                return true;
        }
        return false;
    }
    @Override
    public void addSong(Song song) {
        if(!findSong(song.getName())) {
            albumTracks.add(song);
            System.out.println("Track successfully added to the album.");
        }else
            System.out.println("The track named "+song.getName()+" already exists in the album.");
    }

}



