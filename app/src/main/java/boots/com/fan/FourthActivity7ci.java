package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity7ci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activit7ci);


        TextView textView853 = (TextView) findViewById(R.id.textView853);
        textView853.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c1.class));
            }
        });



        TextView textView854 = (TextView) findViewById(R.id.textView854);
        textView854.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c2.class));
            }
        });



        TextView textView855 = (TextView) findViewById(R.id.textView855);
        textView855.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c3.class));
            }
        });



        TextView textView856 = (TextView) findViewById(R.id.textView856);
        textView856.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c4.class));
            }
        });



        TextView textView857 = (TextView) findViewById(R.id.textView857);
        textView857.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c5.class));
            }
        });



        TextView textView858 = (TextView) findViewById(R.id.textView858);
        textView858.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c6.class));
            }
        });



        TextView textView859 = (TextView) findViewById(R.id.textView859);
        textView859.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c7.class));
            }
        });



        TextView textView860 = (TextView) findViewById(R.id.textView860);
        textView860.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ci.this, FifthActivity7c8.class));
            }
        });
    }
}
