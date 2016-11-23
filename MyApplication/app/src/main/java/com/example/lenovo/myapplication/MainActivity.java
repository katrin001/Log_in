package com.example.lenovo.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout linearLayout;
    Button bDog, bCat, bFish;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bDog = (Button) findViewById(R.id.b_Dog);
        bCat = (Button) findViewById(R.id.b_Cat);
        bFish = (Button) findViewById(R.id.b_Fish);
        bDog.setOnClickListener(this);
        bCat.setOnClickListener(this);
        bFish.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b_Dog:
                text.setText("Dogs barking ");
                break;
            case R.id.b_Cat:
                text.setText("\n" + "cats meowing ");
                break;
            case R.id.b_Fish:
                text.setText("\n" + "Fish don't say anything ");
                break;
        }
            linearLayout = (LinearLayout) findViewById (R.id.conteiner);

            ArrayList<Animals> animals = new ArrayList<>();
            animals.add(new Dog("Rex", R.drawable.dog1));
            animals.add(new Dog("Oscar", R.drawable.dog2));
            animals.add(new Dog("Lucky", R.drawable.dog3));
            animals.add(new Dog("Barsic", R.drawable.cat1));
            animals.add(new Dog("Murchic", R.drawable.cat2));
            animals.add(new Dog("Lucy", R.drawable.cat3));
            animals.add(new Dog("Carl", R.drawable.fish1));
            animals.add(new Dog("Fred", R.drawable.fish2));
            animals.add(new Dog("Sharky", R.drawable.fish3));
            for (Animals animal : animals) {

                ImageView image = new ImageView(this);
                image.setImageResource(animal.getImageId());
                image.setLayoutParams(new ActionBar.LayoutParams(500, 500));

                TextView text = new TextView(this);
                text.setText(animal.getName());

                linearLayout.addView(image);
                linearLayout.addView(text);
            }
        }
    }







