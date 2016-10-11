package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 14/6/16.
 */
public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.third_activity);

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivity.this, FourthActivity.class));
            }
        });


        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivity.this, FourthActivitycivil.class));
            }
        });


        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivity.this, FourthActivityelectrical.class));
            }
        });


        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivity.this, FourthActivityelectron.class));
            }
        });


        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivity.this, FouthActivitymech.class));
            }
        });


    }
}
