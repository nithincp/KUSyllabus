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
public class FourthActivity7ee extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activit7ee);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView877 = (TextView) findViewById(R.id.textView877);
        textView877.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee1.class));
            }
        });



        TextView textView878 = (TextView) findViewById(R.id.textView878);
        textView878.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee2.class));
            }
        });



        TextView textView879 = (TextView) findViewById(R.id.textView879);
        textView879.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee3.class));
            }
        });



        TextView textView880 = (TextView) findViewById(R.id.textView880);
        textView880.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee4.class));
            }
        });



        TextView textView881 = (TextView) findViewById(R.id.textView881);
        textView881.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee5.class));
            }
        });



        TextView textView882 = (TextView) findViewById(R.id.textView882);
        textView882.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee6.class));
            }
        });



        TextView textView883 = (TextView) findViewById(R.id.textView883);
        textView883.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee7.class));
            }
        });



        TextView textView884 = (TextView) findViewById(R.id.textView884);
        textView884.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee8.class));
            }
        });


        TextView textView1629 = (TextView) findViewById(R.id.textView1629);
        textView1629.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee9.class));
            }
        });


        TextView textView1630 = (TextView) findViewById(R.id.textView1630);
        textView1630.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity7ee.this, FifthActivity7ee10.class));
            }
        });


    }
}
