package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 30/5/17.
 */

public class FifthActivity8c6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity8c6);



        TextView textView933 = (TextView) findViewById(R.id.textView933);
        textView933.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c21.class));
            }
        });


        TextView textView934 = (TextView) findViewById(R.id.textView934);
        textView934.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c22.class));
            }
        });



        TextView textView935 = (TextView) findViewById(R.id.textView935);
        textView935.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c23.class));
            }
        });



        TextView textView936 = (TextView) findViewById(R.id.textView936);
        textView936.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c24.class));
            }
        });



        TextView textView937 = (TextView) findViewById(R.id.textView937);
        textView937.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c25.class));
            }
        });



        TextView textView938 = (TextView) findViewById(R.id.textView938);
        textView938.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c26.class));
            }
        });




        TextView textView939 = (TextView) findViewById(R.id.textView939);
        textView939.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c27.class));
            }
        });


        TextView textView940 = (TextView) findViewById(R.id.textView940);
        textView940.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c28.class));
            }
        });


        TextView textView941 = (TextView) findViewById(R.id.textView941);
        textView941.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity8c6.this, SixthActivity8c29.class));
            }
        });



    }
}
