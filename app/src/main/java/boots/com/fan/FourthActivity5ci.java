package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity5ci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity5ci);


        TextView textView813 = (TextView) findViewById(R.id.textView813);
        textView813.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c1.class));
            }
        });


        TextView textView814 = (TextView) findViewById(R.id.textView814);
        textView814.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c2.class));
            }
        });


        TextView textView815 = (TextView) findViewById(R.id.textView815);
        textView815.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c3.class));
            }
        });


        TextView textView816 = (TextView) findViewById(R.id.textView816);
        textView816.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c4.class));
            }
        });


        TextView textView817 = (TextView) findViewById(R.id.textView817);
        textView817.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c5.class));
            }
        });


        TextView textView818 = (TextView) findViewById(R.id.textView818);
        textView818.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c6.class));
            }
        });


        TextView textView819 = (TextView) findViewById(R.id.textView819);
        textView819.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c7.class));
            }
        });


        TextView textView820 = (TextView) findViewById(R.id.textView820);
        textView820.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity5ci.this, FifthActivity5c8.class));
            }
        });




    }
}