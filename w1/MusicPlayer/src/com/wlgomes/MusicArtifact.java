package com.wlgomes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MusicArtifact implements MusicArtifactInterface {
    protected int id;
    protected String name;
    protected HashSet<Artist> artists = new HashSet<>();
    protected LinkedList<Song> tracks = new LinkedList<>();
    protected HashSet<Album> albums = new HashSet<>();

    @Override
    public LinkedList<Song> getTracks() {
        return tracks;
    }

    @Override
    public void setTracks(LinkedList<Song> tracks) {
        this.tracks = tracks;
    }

    @Override
    public HashSet<Album> getAlbums() {
        return albums;
    }


    @Override
    public void setAlbums(HashSet<Album> albums) {
        this.albums = albums;
    }


    @Override
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }


    @Override
    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    protected ArrayList<Playlist> playlists;


    @Override
    public int getId() {
        return id;
    }


    @Override
    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public HashSet<Artist> getArtists() {
        return artists;
    }


    @Override
    public void setArtists(HashSet<Artist> artists) {
        this.artists = artists;
    }


    @Override
    public boolean findSong(String title){
        if(tracks==null) return false;
        for(Song song : tracks){
            if(song.getName().equals(title))
                return true;
        }
        return false;
    }
    //adds a song to tracks, all songs available.
    @Override
    public void addSong(Song song){
        if(!findSong(song.getName())) {
            tracks.add(song);
            System.out.println("Track successfully added to the library.");
        }else
            System.out.println("The track named "+song.getName()+" already exists.");
    }
    @Override
    public void addSongs(LinkedList<Song> songs){
        for (Song song:songs)
            if(!findSong(song.getName())) {
            tracks.add(song);
            System.out.println("Track successfully added to the library.");
            }else
                System.out.println("The track named "+song.getName()+" already exists.");
    }


    @Override
    public void deleteSong(int id){
        //predicate filter
        tracks.removeIf(song -> song.getId() == id);
    }


}
