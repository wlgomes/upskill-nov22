package com.wlgomes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public interface MusicArtifactInterface {
    LinkedList<Song> getTracks();

    void setTracks(LinkedList<Song> tracks);

    HashSet<Album> getAlbums();

    void setAlbums(HashSet<Album> albums);

    ArrayList<Playlist> getPlaylists();

    void setPlaylists(ArrayList<Playlist> playlists);

    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    HashSet<Artist> getArtists();

    void setArtists(HashSet<Artist> artists);

    boolean findSong(String title);


    //adds a song to tracks, all songs available.
    void addSong(Song song);

    void addSongs(LinkedList<Song> songs);

    void deleteSong(int id);
}
