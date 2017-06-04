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
public class FifthActivity5m6 extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity5m6);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView1387 = (TextView) findViewById(R.id.textView1387);
        textView1387.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m1.class));
            }
        });



        TextView textView1388 = (TextView) findViewById(R.id.textView1388);
        textView1388.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m2.class));
            }
        });


        TextView textView1389 = (TextView) findViewById(R.id.textView1389);
        textView1389.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m3.class));
            }
        });


        TextView textView1390 = (TextView) findViewById(R.id.textView1390);
        textView1390.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m4.class));
            }
        });


        TextView textView1391 = (TextView) findViewById(R.id.textView1391);
        textView1391.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m5.class));
            }
        });


        TextView textView1392 = (TextView) findViewById(R.id.textView1392);
        textView1392.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m6.class));
            }
        });


        TextView textView1393 = (TextView) findViewById(R.id.textView1393);
        textView1393.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m7.class));
            }
        });

        TextView textView1800 = (TextView) findViewById(R.id.textView1800);
        textView1800.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m8.class));
            }
        });

        TextView textView1801 = (TextView) findViewById(R.id.textView1801);
        textView1801.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m9.class));
            }
        });

        TextView textView1805 = (TextView) findViewById(R.id.textView1805);
        textView1805.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m10.class));
            }
        });

        TextView textView1804 = (TextView) findViewById(R.id.textView1804);
        textView1804.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5m6.this, SixthActivity5m11.class));
            }
        });

    }
}
