package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 15/6/16.
 */
public class ThirdActivityc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.third_activity);


        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivityc.this, FourthActivity6cs.class));
            }
        });



        try {
            TextView textView11 = (TextView) findViewById(R.id.textView11);

            textView11.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    startActivity(new Intent(ThirdActivityc.this, FourthActivity6ci.class));
                }
            });

        } catch (Exception e)
        {
            e.printStackTrace();
        }



        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityc.this, FourthActivity6ee.class));
            }
        });


        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityc.this, FourthActivity6ec.class));
            }
        });


        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityc.this, FourthActivity6m.class));
            }
        });


    }
}
