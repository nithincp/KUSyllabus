package boots.com.fan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 28/6/16.
 */
public class FifthActivity5ec6 extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity5ec6);
        mp = MediaPlayer.create(this, R.raw.click2);


        TextView textView1211 = (TextView) findViewById(R.id.textView1211);
        textView1211.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec1.class));
            }
        });



        TextView textView1212 = (TextView) findViewById(R.id.textView1212);
        textView1212.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec2.class));
            }
        });


        TextView textView1213 = (TextView) findViewById(R.id.textView1213);
        textView1213.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec3.class));
            }
        });


        TextView textView1214 = (TextView) findViewById(R.id.textView1214);
        textView1214.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec4.class));
            }
        });


        TextView textView1215 = (TextView) findViewById(R.id.textView1215);
        textView1215.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec5.class));
            }
        });


        TextView textView1216 = (TextView) findViewById(R.id.textView1216);
        textView1216.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec6.class));
            }
        });


        TextView textView1217 = (TextView) findViewById(R.id.textView1217);
        textView1217.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ec6.this, SixthActivity5ec7.class));
            }
        });





    }
}
