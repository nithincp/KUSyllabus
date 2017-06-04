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
public class FifthActivity6ec6 extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity6ec6);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView1518 = (TextView) findViewById(R.id.textView1518);
        textView1518.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec1.class));
            }
        });



        TextView textView1519 = (TextView) findViewById(R.id.textView1519);
        textView1519.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec2.class));
            }
        });


        TextView textView1520 = (TextView) findViewById(R.id.textView1520);
        textView1520.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec3.class));
            }
        });


        TextView textView1521 = (TextView) findViewById(R.id.textView1521);
        textView1521.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec4.class));
            }
        });


        TextView textView1522 = (TextView) findViewById(R.id.textView1522);
        textView1522.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec5.class));
            }
        });


        TextView textView1523 = (TextView) findViewById(R.id.textView1523);
        textView1523.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec6.class));
            }
        });


        TextView textView1524 = (TextView) findViewById(R.id.textView1524);
        textView1524.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ec6.this, SixthActivity6ec7.class));
            }
        });



    }
}
