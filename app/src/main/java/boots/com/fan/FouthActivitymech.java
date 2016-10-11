package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 20/6/16.
 */
public class FouthActivitymech extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activitymech);


        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym1.class));
            }
        });


        TextView textView199 = (TextView) findViewById(R.id.textView199);
        textView199.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym2.class));
            }
        });


        TextView textView200 = (TextView) findViewById(R.id.textView200);
        textView200.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym3.class));
            }
        });


        TextView textView201 = (TextView) findViewById(R.id.textView201);
        textView201.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym4.class));
            }
        });


        TextView textView202 = (TextView) findViewById(R.id.textView202);
        textView202.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym5.class));
            }
        });


        TextView textView203 = (TextView) findViewById(R.id.textView203);
        textView203.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym6.class));
            }
        });


        TextView textView204 = (TextView) findViewById(R.id.textView204);
        textView204.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym7.class));
            }
        });


        TextView textView205 = (TextView) findViewById(R.id.textView205);
        textView205.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FouthActivitymech.this, FifthActivitym8.class));
            }
        });

    }
}
