package com.example.mobilelec5demo;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdapter2  extends BaseAdapter {
    // data
    List<Song> adapterSongs2;

    public SongAdapter2(List<Song> adapterSongs2) {
        this.adapterSongs2 = adapterSongs2;
    }

    @Override
    public int getCount() {
        return adapterSongs2.size();
    }

    @Override
    public Object getItem(int i) {
        return adapterSongs2.get(i);
    }

    // can use this to return some sort of id if required
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_song2, viewGroup, false);
        }
        TextView txtViewSong2 = view.findViewById(R.id.txtViewSongItem2);
        ImageView imgViewSong2 = view.findViewById(R.id.imgViewSongItem2);
        ImageView imgViewPlayStop = view.findViewById(R.id.imgViewPlayStop);
        txtViewSong2.setText(adapterSongs2.get(i).getSongName());
        imgViewSong2.setImageResource(adapterSongs2.get(i).getSongPic());
        imgViewPlayStop.setImageResource(R.drawable.play);
       //  txtViewSong2.setGravity(Gravity.CENTER_VERTICAL);

        return view;
    }
}
