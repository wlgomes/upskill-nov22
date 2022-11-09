package com.wlgomes;

import java.sql.Time;
import java.util.HashSet;
import java.util.LinkedList;

public class Artist extends MusicArtifact{
    private LinkedList<Song> artistTracks;
    private HashSet<Album> artistAlbums;

    public Artist() {
    }

    public Artist(int artistID, String name) {
        this.id=artistID;
        this.name=name;
    }

}
