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
public class FourthActivity6m extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity6m);
        mp = MediaPlayer.create(this, R.raw.click2);
        TextView textView925 = (TextView) findViewById(R.id.textView925);
        textView925.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m1.class));
            }
        });



        TextView textView926 = (TextView) findViewById(R.id.textView926);
        textView926.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m2.class));
            }
        });



        TextView textView927 = (TextView) findViewById(R.id.textView927);
        textView927.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m3.class));
            }
        });



        TextView textView928 = (TextView) findViewById(R.id.textView928);
        textView928.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m4.class));
            }
        });



        TextView textView929 = (TextView) findViewById(R.id.textView929);
        textView929.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m5.class));
            }
        });



        TextView textView930 = (TextView) findViewById(R.id.textView930);
        textView930.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m6.class));
            }
        });



        TextView textView931 = (TextView) findViewById(R.id.textView931);
        textView931.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m7.class));
            }
        });



        TextView textView932 = (TextView) findViewById(R.id.textView932);
        textView932.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity6m.this, FifthActivity6m8.class));
            }
        });
    }
}
