package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 28/9/16.
 */
public class FifthActivity7ec5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fifth_activity7ec5);


        TextView textView1641 = (TextView) findViewById(R.id.textView1641);
        textView1641.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7ec5.this, SixthActivity7ec11.class));
            }
        });



        TextView textView1642 = (TextView) findViewById(R.id.textView1642);
        textView1642.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7ec5.this, SixthActivity7ec12.class));
            }
        });


        TextView textView1643 = (TextView) findViewById(R.id.textView1643);
        textView1643.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7ec5.this, SixthActivity7ec13.class));
            }
        });


        TextView textView1664 = (TextView) findViewById(R.id.textView1664);
        textView1664.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7ec5.this, SixthActivity7ec14.class));
            }
        });


        TextView textView1665 = (TextView) findViewById(R.id.textView1665);
        textView1665.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7ec5.this, SixthActivity7ec15.class));
            }
        });

        TextView textView1722 = (TextView) findViewById(R.id.textView1722);
        textView1722.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FifthActivity7ec5.this, SixthActivity7ec16.class));
            }
        });




    }
}
