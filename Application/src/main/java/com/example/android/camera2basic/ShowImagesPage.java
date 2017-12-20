package com.example.android.camera2basic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ShowImagesPage extends AppCompatActivity {
    ImageView pane;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_images);
        pane = findViewById(R.id.imageView);
        count = 0;
        if(Camera2BasicFragment.images.get(count) != null)
        pane.setImageBitmap(Camera2BasicFragment.images.get(count));
    }
    public void upImage(View view) {
        if(Camera2BasicFragment.images.get(++count) != null)
            pane.setImageBitmap(Camera2BasicFragment.images.get(count));
        else
            count = 0;
    }
    public void downImage(View view) {
        if (Camera2BasicFragment.images.get(--count) != null)
                pane.setImageBitmap(Camera2BasicFragment.images.get(count));
        else
            count = 3;

    }

}
