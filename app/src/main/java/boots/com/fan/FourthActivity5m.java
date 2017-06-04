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
public class FourthActivity5m extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity5m);
        mp = MediaPlayer.create(this, R.raw.click2);
        TextView textView845 = (TextView) findViewById(R.id.textView845);
        textView845.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m1.class));
            }
        });



        TextView textView846 = (TextView) findViewById(R.id.textView846);
        textView846.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m2.class));
            }
        });



        TextView textView847 = (TextView) findViewById(R.id.textView847);
        textView847.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m3.class));
            }
        });



        TextView textView848 = (TextView) findViewById(R.id.textView848);
        textView848.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m4.class));
            }
        });



        TextView textView849 = (TextView) findViewById(R.id.textView849);
        textView849.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m5.class));
            }
        });



        TextView textView850 = (TextView) findViewById(R.id.textView850);
        textView850.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m6.class));
            }
        });



        TextView textView851 = (TextView) findViewById(R.id.textView851);
        textView851.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m7.class));
            }
        });



        TextView textView852 = (TextView) findViewById(R.id.textView852);
        textView852.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5m.this, FifthActivity5m8.class));
            }
        });

    }
}