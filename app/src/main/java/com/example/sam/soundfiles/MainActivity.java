package com.example.sam.soundfiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find folder button
        Button folderButton = (Button) findViewById(R.id.folder);

        // set new OnClickListener on button
        folderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent to start FolderActivity
                Intent folder = new Intent(MainActivity.this, FolderActivity.class);

                // start FolderActivity
                startActivity(folder);
            }
        });
    }
}
