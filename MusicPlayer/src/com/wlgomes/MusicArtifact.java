package com.wlgomes;

import java.util.ArrayList;

public class MusicArtifact {
    protected int id;
    protected String name;
    protected ArrayList<Artist> artists;
    protected ArrayList<Song> tracks;
    protected ArrayList<Album> albums;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }

    public Song findSong(String title){
        for(Song song : tracks){
            if(song.getName().equals(title))
                return song;
        }
        return null;
    }
    public void deleteSong(int id){
        //predicate filter
        tracks.removeIf(song -> song.getId() == id);
    }


}
