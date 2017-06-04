package boots.com.fan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity6cs extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity6cs);
        mp = MediaPlayer.create(this, R.raw.click2);
        TextView textView901 = (TextView) findViewById(R.id.textView901);
        textView901.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs1.class));
            }
        });



        TextView textView902 = (TextView) findViewById(R.id.textView902);
        textView902.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs2.class));
            }
        });



        TextView textView903 = (TextView) findViewById(R.id.textView903);
        textView903.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs3.class));
            }
        });



        TextView textView904 = (TextView) findViewById(R.id.textView904);
        textView904.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs4.class));
            }
        });



        TextView textView905 = (TextView) findViewById(R.id.textView905);
        textView905.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs5.class));
            }
        });



        TextView textView906 = (TextView) findViewById(R.id.textView906);
        textView906.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs6.class));
            }
        });



        TextView textView907 = (TextView) findViewById(R.id.textView907);
        textView907.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs7.class));
            }
        });



        TextView textView908 = (TextView) findViewById(R.id.textView908);
        textView908.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6cs.this, FifthActivity6cs8.class));
            }
        });
    }
}
