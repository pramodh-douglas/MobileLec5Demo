package com.example.mobilelec5demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> SongNames = new ArrayList<>(Arrays.asList("Bag Pipes", "Ukelele", "Drums"));
    List<Integer> SongPics = new ArrayList<>(Arrays.asList(R.drawable.bagpipes, R.drawable.ukulele, R.drawable.drums));
    List<Integer> SongRaws = new ArrayList<>(Arrays.asList(R.raw.bagpipes, R.raw.ukulele, R.raw.drums));
    List<Song> SongList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadModelData();

        // Instantiate ListView
        ListView listViewSongs = findViewById(R.id.listViewSongs);

        // Create adapter object
        SongAdapter songAdapter = new SongAdapter(SongList);

        // Set adapter object onto ListView
        listViewSongs.setAdapter(songAdapter);

        // Set onItemClick Listener for ListView
    }

    private void LoadModelData() {
        for(int i = 0; i < SongNames.size(); i++) {
            Song eachSong = new Song(SongNames.get(i), SongPics.get(i), SongRaws.get(i));

            SongList.add(eachSong);
        }
    }
}