package boots.com.fan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 28/9/16.
 */
public class FifthActivity7ec6 extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity7ec6);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView1641 = (TextView) findViewById(R.id.textView1641);
        textView1641.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7ec6.this, SixthActivity7ec21.class));
            }
        });



        TextView textView1642 = (TextView) findViewById(R.id.textView1642);
        textView1642.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7ec6.this, SixthActivity7ec22.class));
            }
        });


        TextView textView1643 = (TextView) findViewById(R.id.textView1643);
        textView1643.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7ec6.this, SixthActivity7ec23.class));
            }
        });


        TextView textView1664 = (TextView) findViewById(R.id.textView1664);
        textView1664.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7ec6.this, SixthActivity7ec24.class));
            }
        });


        TextView textView1665 = (TextView) findViewById(R.id.textView1665);
        textView1665.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7ec6.this, SixthActivity7ec25.class));
            }
        });

        TextView textView1723 = (TextView) findViewById(R.id.textView1723);
        textView1723.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7ec6.this, SixthActivity7ec26.class));
            }
        });



    }
}
