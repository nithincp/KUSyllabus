package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 20/6/16.
 */
public class FourthActivityelectron extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activityelectroni);


        TextView textView191 = (TextView) findViewById(R.id.textView191);
        textView191.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec1.class));
            }
        });


        TextView textView192 = (TextView) findViewById(R.id.textView192);
        textView192.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec2.class));
            }
        });


        TextView textView193 = (TextView) findViewById(R.id.textView193);
        textView193.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec3.class));
            }
        });


        TextView textView194 = (TextView) findViewById(R.id.textView194);
        textView194.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec4.class));
            }
        });


        TextView textView195 = (TextView) findViewById(R.id.textView195);
        textView195.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec5.class));
            }
        });


        TextView textView196 = (TextView) findViewById(R.id.textView196);
        textView196.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec6.class));
            }
        });


        TextView textView197 = (TextView) findViewById(R.id.textView197);
        textView197.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec7.class));
            }
        });


        TextView textView198 = (TextView) findViewById(R.id.textView198);
        textView198.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivityelectron.this, FifthActivityec8.class));
            }
        });

    }
}
