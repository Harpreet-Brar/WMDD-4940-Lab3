package com.example.lab3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer arr[] = {R.drawable.ace_of_clubs,R.drawable.two_of_clubs,R.drawable.three_of_clubs,R.drawable.four_of_clubs,R.drawable.five_of_clubs,R.drawable.six_of_clubs,R.drawable.seven_of_clubs,R.drawable.eight_of_clubs,R.drawable.nine_of_clubs,R.drawable.ten_of_clubs,R.drawable.jack_of_clubs,R.drawable.queen_of_clubs,R.drawable.king_of_clubs,R.drawable.ace_of_diamonds,R.drawable.two_of_diamonds,R.drawable.three_of_diamonds,R.drawable.four_of_diamonds,R.drawable.five_of_diamonds,R.drawable.six_of_diamonds,R.drawable.seven_of_diamonds,R.drawable.eight_of_diamonds,R.drawable.nine_of_diamonds,R.drawable.ten_of_diamonds,R.drawable.jack_of_diamonds,R.drawable.queen_of_diamonds,R.drawable.king_of_diamonds,R.drawable.ace_of_spades,R.drawable.two_of_spades,R.drawable.three_of_spades,R.drawable.four_of_spades,R.drawable.five_of_spades,R.drawable.six_of_spades,R.drawable.seven_of_spades,R.drawable.eight_of_spades,R.drawable.nine_of_spades,R.drawable.ten_of_spades,R.drawable.jack_of_spades,R.drawable.queen_of_spades,R.drawable.king_of_spades,R.drawable.ace_of_hearts,R.drawable.two_of_hearts,R.drawable.three_of_hearts,R.drawable.four_of_hearts,R.drawable.five_of_hearts,R.drawable.six_of_hearts,R.drawable.seven_of_hearts,R.drawable.eight_of_hearts,R.drawable.nine_of_hearts,R.drawable.ten_of_hearts,R.drawable.jack_of_hearts,R.drawable.queen_of_hearts,R.drawable.king_of_hearts};
    int count = 52;
    private Integer temp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>0) {



                    Double rand = (Math.random() * (count));
                    int card = rand.intValue();
                    TextView text = findViewById(R.id.textView);
                    ImageView image = findViewById(R.id.imageView2);

                    String img = "R.drawable." + arr[card];
                    count--;
                    image.setImageResource(arr[card]);
                    text.setText(String.valueOf("Remaining cards : " + count));

                    temp = arr[count];
                    arr[count] = arr[card];
                    arr[card] = temp;


                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        count = 52;
        ImageView image = findViewById(R.id.imageView2);
        TextView text = findViewById(R.id.textView);

        image.setImageResource(R.drawable.black_joker);
        text.setText(String.valueOf("Remaining cards : " + count));


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
