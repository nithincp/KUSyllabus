package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity8m extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity8m);



        TextView textView933 = (TextView) findViewById(R.id.textView933);
        textView933.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m1.class));
            }
        });


        TextView textView934 = (TextView) findViewById(R.id.textView934);
        textView934.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m2.class));
            }
        });



        TextView textView935 = (TextView) findViewById(R.id.textView935);
        textView935.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m3.class));
            }
        });



        TextView textView936 = (TextView) findViewById(R.id.textView936);
        textView936.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m4.class));
            }
        });



        TextView textView937 = (TextView) findViewById(R.id.textView937);
        textView937.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m5.class));
            }
        });



        TextView textView938 = (TextView) findViewById(R.id.textView938);
        textView938.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m6.class));
            }
        });



        TextView textView939 = (TextView) findViewById(R.id.textView939);
        textView939.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m7.class));
            }
        });



        TextView textView940 = (TextView) findViewById(R.id.textView940);
        textView940.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity8m.this, FifthActivity8m8.class));
            }
        });

    }
}
