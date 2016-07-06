package com.example.sam.soundfiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);

        // find sound file button
        Button soundFileButton = (Button) findViewById(R.id.sound_file);

        // set new OnClickListener on button
        soundFileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent to start NowPlayingActivity
                Intent nowPlaying = new Intent(FolderActivity.this, NowPlayingActivity.class);

                // start NowPlayingActivity
                startActivity(nowPlaying);
            }
        });
    }
}
