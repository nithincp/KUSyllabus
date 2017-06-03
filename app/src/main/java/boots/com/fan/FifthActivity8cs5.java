package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 30/5/17.
 */

public class FifthActivity8cs5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity8cs5);




        TextView textView933 = (TextView) findViewById(R.id.textView933);
        textView933.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8cs5.this, SixthActivity8cs21.class));
            }
        });


        TextView textView934 = (TextView) findViewById(R.id.textView934);
        textView934.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8cs5.this, SixthActivity8cs22.class));
            }
        });



        TextView textView935 = (TextView) findViewById(R.id.textView935);
        textView935.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8cs5.this, SixthActivity8cs23.class));
            }
        });



        TextView textView936 = (TextView) findViewById(R.id.textView936);
        textView936.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8cs5.this, SixthActivity8cs24.class));
            }
        });



        TextView textView937 = (TextView) findViewById(R.id.textView937);
        textView937.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8cs5.this, SixthActivity8cs25.class));
            }
        });

    }
}
