package com.example.mobilelec5demo;

public class Song {
    private String SongName;
    private int SongPic;
    private int SongRaw;

    public int getSongRaw() {
        return SongRaw;
    }

    public void setSongRaw(int songRaw) {
        SongRaw = songRaw;
    }

    public Song(String songName, int songPic, int songRaw) {
        SongName = songName;
        SongPic = songPic;
        SongRaw = songRaw;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public int getSongPic() {
        return SongPic;
    }

    public void setSongPic(int songPic) {
        SongPic = songPic;
    }
}
