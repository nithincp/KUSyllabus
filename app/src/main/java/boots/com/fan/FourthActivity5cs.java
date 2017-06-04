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
public class FourthActivity5cs extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity5cs);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView821 = (TextView) findViewById(R.id.textView821);
        textView821.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs1.class));
            }
        });



        TextView textView822 = (TextView) findViewById(R.id.textView822);
        textView822.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs2.class));
            }
        });



        TextView textView823 = (TextView) findViewById(R.id.textView823);
        textView823.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs3.class));
            }
        });



        TextView textView824 = (TextView) findViewById(R.id.textView824);
        textView824.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs4.class));
            }
        });



        TextView textView825 = (TextView) findViewById(R.id.textView825);
        textView825.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs5.class));
            }
        });



        TextView textView826 = (TextView) findViewById(R.id.textView826);
        textView826.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs6.class));
            }
        });



        TextView textView827 = (TextView) findViewById(R.id.textView827);
        textView827.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs7.class));
            }
        });



        TextView textView828 = (TextView) findViewById(R.id.textView828);
        textView828.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity5cs.this, FifthActivity5cs8.class));
            }
        });



    }
}