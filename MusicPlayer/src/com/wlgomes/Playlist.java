package com.wlgomes;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Playlist extends MusicArtifact {
    private LinkedList<Song> playlistTracks = new LinkedList<>();

    public LinkedList<Song> getTracks() {
        return this.playlistTracks;
    }

    public void setTracks(LinkedList<Song> playlistTracks) {
        this.playlistTracks = playlistTracks;
    }

    public Playlist() {
    }

    public Playlist(LinkedList<Song> playlistTracks) {
        this.playlistTracks = new LinkedList<Song>();
    }

    //add song to playlist
    @Override
    public void addSong(Song song) {
        if (findSong(song.getName())) {
            playlistTracks.add(song);

        } else {
            System.out.println("This song is not present in the library: " + song.getName());
        }
    }
    public void addSongs(HashSet<Album> albums) {
        LinkedList<Song> songsFromAlbums = new LinkedList<>();
        for (Album album : albums)
            songsFromAlbums = album.getTracks();
        for (Song song : songsFromAlbums)
            if (playlistTracks.contains(song))
                System.out.println("The track named " + song.getName() + " already exists in the playlist.");
            else
                playlistTracks.add(song);
        System.out.println("Track successfully added to the library.");
    }
}
