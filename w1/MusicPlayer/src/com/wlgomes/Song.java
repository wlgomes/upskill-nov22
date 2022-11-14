package com.wlgomes;

import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;

public class Song extends MusicArtifact {
    private Time duration;
    private File file;
    //default constructors:
        //empty constructor
    public Song(){}
        //construtor with all the paramethers previouly defined
    public Song(int songID, String title, Time duration, ArrayList<Album> album){
        this.id=songID;
        this.name=title;
        this.duration=duration;
        this.albums= new HashSet<Album>();
    }
    //constructor without album, to be added later
    public Song(int songID, String title, Time duration) {
        this.id = songID;
        this.name = title;
        this.duration = duration;
    }

    //getters and setters
    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }
    //toString returns properties of the class in text form



}
