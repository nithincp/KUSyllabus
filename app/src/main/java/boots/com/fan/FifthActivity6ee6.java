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
public class FifthActivity6ee6 extends AppCompatActivity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity6ee6);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView1558 = (TextView) findViewById(R.id.textView1558);
        textView1558.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ee6.this, SixthActivity6ee1.class));
            }
        });



        TextView textView1559 = (TextView) findViewById(R.id.textView1559);
        textView1559.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ee6.this, SixthActivity6ee2.class));
            }
        });


        TextView textView1560 = (TextView) findViewById(R.id.textView1560);
        textView1560.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ee6.this, SixthActivity6ee3.class));
            }
        });


        TextView textView1561 = (TextView) findViewById(R.id.textView1561);
        textView1561.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ee6.this, SixthActivity6ee4.class));
            }
        });


        TextView textView1562 = (TextView) findViewById(R.id.textView1562);
        textView1562.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ee6.this, SixthActivity6ee5.class));
            }
        });


        TextView textView1563 = (TextView) findViewById(R.id.textView1563);
        textView1563.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity6ee6.this, SixthActivity6ee6.class));
            }
        });




    }
}
