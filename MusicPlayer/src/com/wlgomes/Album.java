package com.wlgomes;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Album extends MusicArtifact {
    private LinkedList<Song> albumTracks;
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
    public Album(int albumID, String title, ArrayList<Artist> artists) {
        this.id = albumID;
        this.name = title;
        this.artists = new HashSet<Artist>();
    }
    @Override
    public Song findSong(String title){
        for(Song song : albumTracks){
            if(song.getName().equals(title))
                return song;
        }
        return null;
    }
    @Override
    public void addSong(int songID, String title, Time duration) {
        if(super.findSong(title)!=null) {
            albumTracks.add(findSong(title));
            System.out.println("Track successfully added to the album.");
        }
        System.out.println("The track named "+title+" already exists in the album.");
    }


}
