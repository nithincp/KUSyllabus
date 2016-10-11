package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity6ee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity6ee);

        TextView textView917 = (TextView) findViewById(R.id.textView917);
        textView917.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee1.class));
            }
        });



        TextView textView918 = (TextView) findViewById(R.id.textView918);
        textView918.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee2.class));
            }
        });



        TextView textView919 = (TextView) findViewById(R.id.textView919);
        textView919.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee3.class));
            }
        });



        TextView textView920 = (TextView) findViewById(R.id.textView920);
        textView920.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee4.class));
            }
        });



        TextView textView921 = (TextView) findViewById(R.id.textView921);
        textView921.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee5.class));
            }
        });



        TextView textView922 = (TextView) findViewById(R.id.textView922);
        textView922.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee6.class));
            }
        });



        TextView textView923 = (TextView) findViewById(R.id.textView923);
        textView923.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee7.class));
            }
        });



        TextView textView924 = (TextView) findViewById(R.id.textView924);
        textView924.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee8.class));
            }
        });



        TextView textView1556 = (TextView) findViewById(R.id.textView1556);
        textView1556.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ee.this, FifthActivity6ee9.class));
            }
        });
    }
}
