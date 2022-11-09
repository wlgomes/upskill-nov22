package com.wlgomes;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MusicArtifact {
    protected int id;
    protected String name;
    protected HashSet<Artist> artists;
    protected LinkedList<Song> tracks;
    protected HashSet<Album> albums;

    public LinkedList<Song> getTracks() {
        return tracks;
    }

    public void setTracks(LinkedList<Song> tracks) {
        this.tracks = tracks;
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }


    public void setAlbums(HashSet<Album> albums) {
        this.albums = albums;
    }


    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }


    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    protected ArrayList<Playlist> playlists;


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


    public HashSet<Artist> getArtists() {
        return artists;
    }


    public void setArtists(HashSet<Artist> artists) {
        this.artists = artists;
    }


    public Song findSong(String title){
        for(Song song : tracks){
            if(song.getName().equals(title))
                return song;
        }
        return null;
    }
    //adds a song to tracks, all songs available.

    public void addSong(int id, String title, Time duration){
        if(findSong(title)==null) {
            tracks.add(new Song(id, title, duration));
            System.out.println("Track successfully added to the list.");
        }
        System.out.println("The track named "+title+" already exists.");
    }

    public void deleteSong(int id){
        //predicate filter
        tracks.removeIf(song -> song.getId() == id);
    }


}
