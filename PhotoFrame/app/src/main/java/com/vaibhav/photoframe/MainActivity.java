package com.vaibhav.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton pre , next;
    ImageView pic;
    TextView textView;
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void perv(View v){
        String idX="pic"+ currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(5+currentImage-1)%5;
        String idY="pic"+ currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);


    }
    public void next(View v){
        String idX="pic"+ currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(currentImage+1)%5;
        String idY="pic"+ currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);

    }


}
