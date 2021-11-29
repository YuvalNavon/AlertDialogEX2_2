package com.example.alertdialogex2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb1, adb2, adb3, adb4, adb5;
    AlertDialog ad1, ad2, ad3, ad4, ad5;
    Random rand;
    int randnum;
    LinearLayout screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();
        screen = (LinearLayout) findViewById(R.id.screen);


        adb1 = new AlertDialog.Builder(this);
        adb1.setTitle("Hello Albert");
        adb1.setMessage("How are you today?");
        ad1 = adb1.create();

        adb2 = new AlertDialog.Builder(this);
        adb2.setTitle("Hello Albert Again");
        adb2.setMessage("Are you excited for Hanukka?");
        adb2.setIcon(R.drawable.hanukkia);
        ad2 = adb2.create();

        adb3 = new AlertDialog.Builder(this);
        adb3.setTitle("Hello Albert Again Again");
        adb3.setMessage("Just kidding I don't care");
        adb3.setIcon(R.drawable.sike);
        adb3.setNeutralButton("GO BACK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad3 = adb3.create();

        adb4 = new AlertDialog.Builder(this);
        adb4.setTitle("Hello Albert Again Again Again");
        adb4.setMessage("Actually I do care, and look this button makes the background change colors");
        adb4.setPositiveButton("COLOR GO BRRRR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                randnum = rand.nextInt(5);
                if (randnum == 0) screen.setBackgroundColor(Color.RED);
                if (randnum == 1) screen.setBackgroundColor(Color.BLUE);
                if (randnum == 2) screen.setBackgroundColor(Color.GREEN);
                if (randnum == 3) screen.setBackgroundColor(Color.YELLOW);
                if (randnum == 4) screen.setBackgroundColor(Color.BLACK);

            }
        });
        adb4.setNeutralButton("GO BACK ):", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad4 = adb4.create();

        adb5 = new AlertDialog.Builder(this);
        adb5.setTitle("One last hello MR Levi");
        adb5.setMessage("I hope you have a happy Hanukka with these buttons that change the background color/reset it to white");
        adb5.setPositiveButton("COLOR GO BRRRR 2", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                randnum = rand.nextInt(5);
                if (randnum == 0) screen.setBackgroundColor(Color.RED);
                if (randnum == 1) screen.setBackgroundColor(Color.BLUE);
                if (randnum == 2) screen.setBackgroundColor(Color.GREEN);
                if (randnum == 3) screen.setBackgroundColor(Color.YELLOW);
                if (randnum == 4) screen.setBackgroundColor(Color.BLACK);

            }
        });
        adb5.setNegativeButton("Ashkenazi Button", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                screen.setBackgroundColor(Color.WHITE);
            }
        });
        adb5.setNeutralButton("BUH-BYE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad5 = adb5.create();



    }

    public void click1(View view)
    {
        ad1.show();
    }

    public void click2(View view)
    {
        ad2.show();

    }
    public void click3(View view)
    {
        ad3.show();

    }
    public void click4(View view)
    {
        ad4.show();
    }
    public void click5(View view)
    {
        ad5.show();
    }
}