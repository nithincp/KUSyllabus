package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity5ee extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity5ee);

        TextView textView837 = (TextView) findViewById(R.id.textView837);
        textView837.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee1.class));
            }
        });



        TextView textView838 = (TextView) findViewById(R.id.textView838);
        textView838.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee2.class));
            }
        });



        TextView textView839 = (TextView) findViewById(R.id.textView839);
        textView839.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee3.class));
            }
        });



        TextView textView840 = (TextView) findViewById(R.id.textView840);
        textView840.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee4.class));
            }
        });



        TextView textView841 = (TextView) findViewById(R.id.textView841);
        textView841.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee5.class));
            }
        });



        TextView textView842 = (TextView) findViewById(R.id.textView842);
        textView842.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee6.class));
            }
        });



        TextView textView843 = (TextView) findViewById(R.id.textView843);
        textView843.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee7.class));
            }
        });



        TextView textView844 = (TextView) findViewById(R.id.textView844);
        textView844.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ee.this, FifthActivity5ee8.class));
            }
        });
    }
}