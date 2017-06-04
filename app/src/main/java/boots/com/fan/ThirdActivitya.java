package boots.com.fan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 14/11/16.
 */
public class ThirdActivitya extends AppCompatActivity {
    MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.third_activity);
        mp = MediaPlayer.create(this, R.raw.click2);




        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){                mp.start();

                startActivity(new Intent(ThirdActivitya.this, FourthActivity3cs.class));
            }
        });


        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){                mp.start();

                startActivity(new Intent(ThirdActivitya.this, FourthActivity3ci.class));
            }
        });


        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){                mp.start();

                startActivity(new Intent(ThirdActivitya.this, FourthActivity3ee.class));
            }
        });


        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){                mp.start();

                startActivity(new Intent(ThirdActivitya.this, FourthActivity3ec.class));
            }
        });


        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){                mp.start();

                startActivity(new Intent(ThirdActivitya.this, FourthActivity3m.class));
            }
        });







    }



}
