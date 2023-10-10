package com.example.mobilelec5demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        // SongAdapter songAdapter = new SongAdapter(SongList);

        // Create adapter object with song adapater 2
        SongAdapter2 songAdapter = new SongAdapter2(SongList);


        // Set adapter object onto ListView
        listViewSongs.setAdapter(songAdapter);

        // Set onItemClick Listener for ListView
        listViewSongs.setOnItemClickListener((AdapterView<?> adapterView, View view, int i, long l) -> {
            Toast.makeText(this, "Clicked On " + SongList.get(i).getSongName(), Toast.LENGTH_SHORT).show();
        });
    }

    private void LoadModelData() {
        for(int i = 0; i < SongNames.size(); i++) {
            Song eachSong = new Song(SongNames.get(i), SongPics.get(i), SongRaws.get(i));

            SongList.add(eachSong);
        }
    }
}