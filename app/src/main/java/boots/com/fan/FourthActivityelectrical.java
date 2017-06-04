package boots.com.fan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 20/6/16.
 */
public class FourthActivityelectrical extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activityelectr);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView183 = (TextView) findViewById(R.id.textView183);
        textView183.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee1.class));
            }
        });


        TextView textView184 = (TextView) findViewById(R.id.textView184);
        textView184.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee2.class));
            }
        });


        TextView textView185 = (TextView) findViewById(R.id.textView185);
        textView185.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee3.class));
            }
        });

        TextView textView186 = (TextView) findViewById(R.id.textView186);
        textView186.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee4.class));
            }
        });


        TextView textView187 = (TextView) findViewById(R.id.textView187);
        textView187.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee5.class));
            }
        });


        TextView textView188 = (TextView) findViewById(R.id.textView188);
        textView188.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee6.class));
            }
        });


        TextView textView189 = (TextView) findViewById(R.id.textView189);
        textView189.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee7.class));
            }
        });


        TextView textView190 = (TextView) findViewById(R.id.textView190);
        textView190.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FourthActivityelectrical.this, FifthActivityee8.class));
            }
        });





    }
}
