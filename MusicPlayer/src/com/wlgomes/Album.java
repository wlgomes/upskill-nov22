package com.wlgomes;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album extends MusicArtifact {
    private ArrayList<Song> tracks;

    public ArrayList<Song> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Song> tracks) {
        this.tracks = tracks;
    }

    public Album() {
    }
    public Album(int idAlbum, String title, ArrayList<Artist> artist, ArrayList<Song> tracks) {
        this.id = idAlbum;
        this.name = title;
        this.artists = new ArrayList<Artist>();
        this.tracks = new ArrayList<Song>();
    }
    //constructor without tracks so they can be added later
    public Album(int idAlbum, String title, ArrayList<Artist> artist) {
        this.id = idAlbum;
        this.name = title;
        this.artists = artist;
    }
    public boolean addSong(int id, String title, Time duration){
        if(findSong(title)==null) {
            tracks.add(new Song(id, title, duration));
            System.out.println("Track successfully added to the list.");
            return true;
        }
        System.out.println("The track named "+title+" already exists.");
        return false;
    }
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> Playlist){
        int index = trackNumber - 1;
        if(index >0 && index <= this.tracks.size()){
            Playlist.add(this.tracks.get(index));
            return true;
        }
        System.out.println("This track number is not present in the album "+getName());
        return false;
    }
    public boolean addToPlaylist(String title, LinkedList<Song> Playlist){
        if(findSong(title)!=null){
            Playlist.add(findSong(title));
            return true;
        }else{
            System.out.println("This track number is not present in the album "+title);
            return false;
        }

    }

}
