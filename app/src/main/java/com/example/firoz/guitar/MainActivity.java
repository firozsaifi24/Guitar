package com.example.firoz.guitar;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
Button b1,b2,b3,b4,b5,b6;
    public MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.button);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);

        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.string1);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //mp.start();
                        Log.i("Action","Down");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mp.start();
                        Log.i("Action","Move");
                        break;
                    case MotionEvent.ACTION_UP:
                        //mp.start();
                        Log.i("Action","Up");
                        break;
                }
                return true;
            }
        });
        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.string2);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mp.start();
                        break;
                    case MotionEvent.ACTION_UP:
                        //mp.start();
                        break;
                }
                return true;
            }
        });
        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.string3);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mp.start();
                        break;
                    case MotionEvent.ACTION_UP:
                        //mp.start();
                        break;
                }
                return true;
            }
        });

        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.string4);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mp.start();
                        break;
                    case MotionEvent.ACTION_UP:
                        //mp.start();
                        break;
                }
                return true;
            }
        });

        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.string5);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mp.start();
                        break;
                    case MotionEvent.ACTION_UP:
                        //mp.start();
                        break;
                }
                return true;
            }
        });

        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp=MediaPlayer.create(getApplicationContext(),R.raw.string6);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        //mp.start();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mp.start();
                        break;
                    case MotionEvent.ACTION_UP:
                        //mp.start();
                        break;
                }
                return true;
            }
        });
      /*  b1.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                mp=MediaPlayer.create(MainActivity.this,R.raw.string1);
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_HOVER_ENTER:
                            mp.start();
                            break;
                    case MotionEvent.ACTION_HOVER_MOVE:
                        mp.start();
                        break;
                    case MotionEvent.ACTION_HOVER_EXIT:
                        mp.start();
                        break;

                }
                return true;
            }
        });*/


        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mp = MediaPlayer.create(getApplicationContext(),R.raw.string1);
                    mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mp = MediaPlayer.create(getApplicationContext(),R.raw.string2);
                    mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(),R.raw.string3);
                mp.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(),R.raw.string4);
                mp.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(),R.raw.string5);
                mp.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(),R.raw.string6);
                mp.start();
            }
        });*/


    }
    /*public void onClick(View v)
    {
        switch(v.getId()) {
            case R.id.button2:
                mp = MediaPlayer.create(this, R.raw.string1);
                mp.start();
                break;

            case R.id.button3:
                mp = MediaPlayer.create(this, R.raw.string2);
                mp.start();
                break;

            case R.id.button4:
                mp = MediaPlayer.create(this, R.raw.string3);
                mp.start();
                break;

            case R.id.button:
                mp = MediaPlayer.create(this, R.raw.string4);
                mp.start();
                break;

            case R.id.button5:
                mp = MediaPlayer.create(this, R.raw.string5);
                mp.start();
                break;

            case R.id.button6:
                mp = MediaPlayer.create(this, R.raw.string6);
                mp.start();
                break;
        }
    }*/
}
