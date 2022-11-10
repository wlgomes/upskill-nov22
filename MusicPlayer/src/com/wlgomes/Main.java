package com.wlgomes;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Artist ar1=new Artist(1,"Artist one");
    Artist ar2=new Artist(2,"Artist two");

    Song s2=new Song(2,"Track two",new Time(0,3,22));
    Song s3=new Song(3,"Track three",new Time(0,2,23));
    Song s4=new Song(4,"Track three",new Time(0,2,23));
    Album al1=new Album(1,"Album one",new HashSet<>(List.of(ar1)));
    Album al2=new Album(2,"Album two",new HashSet<>(List.of(ar1)));
    Album al3=new Album(3,"Album three",new HashSet<>(List.of(ar2)));

    MusicArtifact ma = new MusicArtifact();
    MusicArtifact album1= new Album();

    Song s1=new Song(1,"Track one",new Time(0,3,44));
    ma.addSong(s1);
    ma.addSong(s2);
    System.out.println(ma.getTracks().toString());
    ma.deleteSong(1);
    System.out.println(ma.getTracks().toString());
    al1.addSong(s1);
    System.out.println(al1.getTracks().toString());

    //add a linkedlist of songs (multiple songs at once) to the library
    LinkedList<Song> songs=new LinkedList<>();
    songs.add(s3);
    songs.add(s4);//this song has the same name as s3, so should fail
    ma.addSongs(songs);

    //add all tracks of an album to a playlist
    Playlist playlist=new Playlist();
    playlist.addSongs(new HashSet<>(List.of(al1)));
        System.out.println(playlist.getTracks().toString());
    }
}


