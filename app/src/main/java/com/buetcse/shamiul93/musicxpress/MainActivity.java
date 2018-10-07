package com.buetcse.shamiul93.musicxpress;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.*;

public class MainActivity extends AppCompatActivity {

    public SoundPool soundPool ;
    public int cID, eID, fID, gID, aID, bID, dID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .build();

        soundPool = new SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .setMaxStreams(7)
                .build();

        cID = soundPool.load(getApplicationContext(), R.raw.note1_c,1);
        dID = soundPool.load(getApplicationContext(), R.raw.note2_d,1);
        eID = soundPool.load(getApplicationContext(), R.raw.note3_e,1);
        fID = soundPool.load(getApplicationContext(), R.raw.note4_f,1);
        gID = soundPool.load(getApplicationContext(), R.raw.note5_g,1);
        aID = soundPool.load(getApplicationContext(), R.raw.note6_a,1);
        bID = soundPool.load(getApplicationContext(), R.raw.note7_b,1);
    }

    public void playC(View v)
    {
        soundPool.play(cID, 1,1,0,0, 1);
    }
    public void playD(View v)
    {
        soundPool.play(dID, 1,1,0,0,1);
    }
    public void playE(View v)
    {
        soundPool.play(eID, 1,1,0,0,1);
    }
    public void playF(View v)
    {
        soundPool.play(fID, 1,1,0,0,1);
    }
    public void playG(View v)
    {
        soundPool.play(gID, 1,1,0,0,1);
    }
    public void playA(View v)
    {
        soundPool.play(aID, 1,1,0,0,1);
    }
    public void playB(View v)
    {
        soundPool.play(bID, 1,1,0,0,1);
    }
}
