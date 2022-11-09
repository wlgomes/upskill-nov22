package com.wlgomes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist extends MusicArtifact{
    private LinkedList<Song> playlistTracks;
    public LinkedList<Song> getTracks() {
        return this.playlistTracks;
    }

    public void setTracks(LinkedList<Song>playlistTracks) {
        this.playlistTracks = playlistTracks;
    }

    public Playlist() {
    }

    public Playlist(LinkedList<Song> playlistTracks) {
        this.playlistTracks = new LinkedList<Song>();
    }
    public boolean addToPlaylist(String title, LinkedList<Song> Playlist){
        if(findSong(title)!=null){
            Playlist.add(findSong(title));
            return true;
        }else{
            System.out.println("This song is not present in the library: "+title);
            return false;
        }

    }
}
