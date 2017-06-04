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
public class FourthActivity7cs extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activit7cs);

        mp = MediaPlayer.create(this, R.raw.click2);
        TextView textView861 = (TextView) findViewById(R.id.textView861);
        textView861.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs1.class));
            }
        });



        TextView textView862 = (TextView) findViewById(R.id.textView862);
        textView862.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs2.class));
            }
        });



        TextView textView863 = (TextView) findViewById(R.id.textView863);
        textView863.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs3.class));
            }
        });



        TextView textView864 = (TextView) findViewById(R.id.textView864);
        textView864.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs4.class));
            }
        });



        TextView textView865 = (TextView) findViewById(R.id.textView865);
        textView865.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs5.class));
            }
        });



        TextView textView866 = (TextView) findViewById(R.id.textView866);
        textView866.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs6.class));
            }
        });



        TextView textView867 = (TextView) findViewById(R.id.textView867);
        textView867.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs7.class));
            }
        });



        TextView textView868 = (TextView) findViewById(R.id.textView868);
        textView868.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7cs.this, FifthActivity7cs8.class));
            }
        });
    }
}
