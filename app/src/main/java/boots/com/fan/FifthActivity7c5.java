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
public class FifthActivity7c5 extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity7c5);
        mp = MediaPlayer.create(this, R.raw.click2);

        TextView textView1676 = (TextView) findViewById(R.id.textView1676);
        textView1676.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c21.class));
            }
        });



        TextView textView1677 = (TextView) findViewById(R.id.textView1677);
        textView1677.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c22.class));
            }
        });


        TextView textView1678 = (TextView) findViewById(R.id.textView1678);
        textView1678.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c23.class));
            }
        });


        TextView textView1679 = (TextView) findViewById(R.id.textView1679);
        textView1679.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c24.class));
            }
        });


        TextView textView1680 = (TextView) findViewById(R.id.textView1680);
        textView1680.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c25.class));
            }
        });


        TextView textView1681 = (TextView) findViewById(R.id.textView1681);
        textView1681.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c26.class));
            }
        });


        TextView textView1682 = (TextView) findViewById(R.id.textView1682);
        textView1682.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c27.class));
            }
        });


        TextView textView1683 = (TextView) findViewById(R.id.textView1683);
        textView1683.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c28.class));
            }
        });



        TextView textView1684 = (TextView) findViewById(R.id.textView1684);
        textView1684.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c29.class));
            }
        });


        TextView textView1673 = (TextView) findViewById(R.id.textView1673);
        textView1673.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c210.class));
            }
        });


        TextView textView1685 = (TextView) findViewById(R.id.textView1685);
        textView1685.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){mp.start();
                startActivity(new Intent(FifthActivity7c5.this, SixthActivity7c211.class));
            }
        });



    }
}
