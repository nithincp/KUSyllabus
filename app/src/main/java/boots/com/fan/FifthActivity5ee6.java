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
public class FifthActivity5ee6 extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity5ee6);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView1320 = (TextView) findViewById(R.id.textView1320);
        textView1320.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee1.class));
            }
        });



        TextView textView1321 = (TextView) findViewById(R.id.textView1321);
        textView1321.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee2.class));
            }
        });


        TextView textView1322 = (TextView) findViewById(R.id.textView1322);
        textView1322.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee3.class));
            }
        });


        TextView textView1323 = (TextView) findViewById(R.id.textView1323);
        textView1323.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee4.class));
            }
        });


        TextView textView1324 = (TextView) findViewById(R.id.textView1324);
        textView1324.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee5.class));
            }
        });


        TextView textView1325 = (TextView) findViewById(R.id.textView1325);
        textView1325.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee6.class));
            }
        });


        TextView textView1326 = (TextView) findViewById(R.id.textView1326);
        textView1326.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity5ee6.this, SixthActivity5ee7.class));
            }
        });


    }
}
