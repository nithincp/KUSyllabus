package boots.com.fan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.click);

        Button buttonnext = (Button) findViewById(R.id.button);

        buttonnext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp.start();
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });



    }






}
