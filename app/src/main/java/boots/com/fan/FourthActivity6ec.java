package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity6ec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity6ec);

        TextView textView909 = (TextView) findViewById(R.id.textView909);
        textView909.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec1.class));
            }
        });



        TextView textView910 = (TextView) findViewById(R.id.textView910);
        textView910.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec2.class));
            }
        });



        TextView textView911 = (TextView) findViewById(R.id.textView911);
        textView911.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec3.class));
            }
        });



        TextView textView912 = (TextView) findViewById(R.id.textView912);
        textView912.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec4.class));
            }
        });



        TextView textView913 = (TextView) findViewById(R.id.textView913);
        textView913.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec5.class));
            }
        });



        TextView textView914 = (TextView) findViewById(R.id.textView914);
        textView914.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec6.class));
            }
        });



        TextView textView915 = (TextView) findViewById(R.id.textView915);
        textView915.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec7.class));
            }
        });



        TextView textView916 = (TextView) findViewById(R.id.textView916);
        textView916.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ec.this, FifthActivity6ec8.class));
            }
        });
    }
}
