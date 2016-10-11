package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity5ec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity5ec);


        TextView textView829 = (TextView) findViewById(R.id.textView829);
        textView829.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec1.class));
            }
        });



        TextView textView830 = (TextView) findViewById(R.id.textView830);
        textView830.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec2.class));
            }
        });



        TextView textView831 = (TextView) findViewById(R.id.textView831);
        textView831.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec3.class));
            }
        });



        TextView textView832 = (TextView) findViewById(R.id.textView832);
        textView832.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec4.class));
            }
        });



        TextView textView833 = (TextView) findViewById(R.id.textView833);
        textView833.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec5.class));
            }
        });



        TextView textView834 = (TextView) findViewById(R.id.textView834);
        textView834.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec6.class));
            }
        });



        TextView textView835 = (TextView) findViewById(R.id.textView835);
        textView835.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec7.class));
            }
        });



        TextView textView836 = (TextView) findViewById(R.id.textView836);
        textView836.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ec.this, FifthActivity5ec8.class));
            }
        });

    }
}