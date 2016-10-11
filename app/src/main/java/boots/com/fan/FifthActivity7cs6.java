package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 28/9/16.
 */
public class FifthActivity7cs6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity7cs6);


        TextView textView1641 = (TextView) findViewById(R.id.textView1641);
        textView1641.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7cs6.this, SixthActivity7cs21.class));
            }
        });



        TextView textView1642 = (TextView) findViewById(R.id.textView1642);
        textView1642.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7cs6.this, SixthActivity7cs22.class));
            }
        });


        TextView textView1643 = (TextView) findViewById(R.id.textView1643);
        textView1643.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7cs6.this, SixthActivity7cs23.class));
            }
        });


        TextView textView1664 = (TextView) findViewById(R.id.textView1664);
        textView1664.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7cs6.this, SixthActivity7cs24.class));
            }
        });


        TextView textView1665 = (TextView) findViewById(R.id.textView1665);
        textView1665.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7cs6.this, SixthActivity7cs25.class));
            }
        });



    }
}
