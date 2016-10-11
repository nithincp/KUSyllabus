package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity7m extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activit7m);


        TextView textView885 = (TextView) findViewById(R.id.textView885);
        textView885.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m1.class));
            }
        });



        TextView textView886 = (TextView) findViewById(R.id.textView886);
        textView886.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m2.class));
            }
        });



        TextView textView887 = (TextView) findViewById(R.id.textView887);
        textView887.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m3.class));
            }
        });



        TextView textView888 = (TextView) findViewById(R.id.textView888);
        textView888.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m4.class));
            }
        });



        TextView textView889 = (TextView) findViewById(R.id.textView889);
        textView889.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m5.class));
            }
        });



        TextView textView890 = (TextView) findViewById(R.id.textView890);
        textView890.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m6.class));
            }
        });



        TextView textView891 = (TextView) findViewById(R.id.textView891);
        textView891.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m7.class));
            }
        });



        TextView textView892 = (TextView) findViewById(R.id.textView892);
        textView892.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m8.class));
            }
        });

        TextView textView1631 = (TextView) findViewById(R.id.textView1631);
        textView1631.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7m.this, FifthActivity7m9    .class));
            }
        });


    }
}
