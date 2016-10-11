package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 20/6/16.
 */
public class FourthActivitycivil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activitycivil);



        TextView textView172 = (TextView) findViewById(R.id.textView172);
        textView172.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc1.class));
            }
        });



        TextView textView173 = (TextView) findViewById(R.id.textView173);
        textView173.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc2.class));
            }
        });


        TextView textView174 = (TextView) findViewById(R.id.textView174);
        textView174.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc3.class));
            }
        });


        TextView textView175 = (TextView) findViewById(R.id.textView175);
        textView175.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc4.class));
            }
        });


        TextView textView176 = (TextView) findViewById(R.id.textView176);
        textView176.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc5.class));
            }
        });


        TextView textView177 = (TextView) findViewById(R.id.textView177);
        textView177.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc6.class));
            }
        });


        TextView textView178 = (TextView) findViewById(R.id.textView178);
        textView178.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc7.class));
            }
        });


        TextView textView179 = (TextView) findViewById(R.id.textView179);
        textView179.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivitycivil.this, FifthActivityc8.class));
            }
        });



    }
}