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
public class FourthActivity8ec extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity8ec);
        mp = MediaPlayer.create(this, R.raw.click2);


        TextView textView933 = (TextView) findViewById(R.id.textView933);
        textView933.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec1.class));
            }
        });


        TextView textView934 = (TextView) findViewById(R.id.textView934);
        textView934.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec2.class));
            }
        });



        TextView textView935 = (TextView) findViewById(R.id.textView935);
        textView935.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec3.class));
            }
        });



        TextView textView936 = (TextView) findViewById(R.id.textView936);
        textView936.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec4.class));
            }
        });



        TextView textView937 = (TextView) findViewById(R.id.textView937);
        textView937.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec5.class));
            }
        });



        TextView textView938 = (TextView) findViewById(R.id.textView938);
        textView938.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec6.class));
            }
        });



        TextView textView939 = (TextView) findViewById(R.id.textView939);
        textView939.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivity8ec.this, FifthActivity8ec7.class));
            }
        });




    }
}
