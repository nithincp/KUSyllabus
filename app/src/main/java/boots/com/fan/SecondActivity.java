package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 14/6/16.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.second_activity);




        TextView s1 = (TextView) findViewById(R.id.textView951);
        s1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivityz.class));
            }
        });


        TextView s3 = (TextView) findViewById(R.id.textView1806);
        s3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivitya.class));
            }
        });


        TextView s4 = (TextView) findViewById(R.id.textView4);
        s4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });


        TextView s5 = (TextView) findViewById(R.id.textView5);
        s5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivityb.class));
            }
        });

        TextView s6 = (TextView) findViewById(R.id.textView6);
        s6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivityc.class));
            }
        });


        TextView s7 = (TextView) findViewById(R.id.textView7);
        s7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivityd.class));
            }
        });


        TextView s8 = (TextView) findViewById(R.id.textView8);
        s8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SecondActivity.this, ThirdActivitye.class));
            }
        });



    }

}
