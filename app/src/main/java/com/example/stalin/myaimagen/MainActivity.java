package com.example.stalin.myaimagen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView image2;
    private Button button;
    private Boolean sw;
    private int num ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image2 = (ImageView) findViewById(R.id.imageView);
        image2.setImageResource(R.drawable.talk2);
        sw=false;
        num=1;
        addListenerOnButton();
        addListenerOnImageView();
    }


    public void addListenerOnButton() {

        image2 = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                if (sw) {
                    image2.setImageResource(R.drawable.mat1);
                }else{
                    image2.setImageResource(R.drawable.talk2);
                }
                sw = (!sw);
            }

        });


    }
    public void addListenerOnImageView(){

        image2 = (ImageView) findViewById(R.id.imageView);

        image2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                switch (num){
                    case 1: image2.setImageResource(R.drawable.scz1);
                            break;
                    case 2: image2.setImageResource(R.drawable.scz2);
                            break;
                    case 3: image2.setImageResource(R.drawable.scz3);
                        break;
                    case 4: image2.setImageResource(R.drawable.scz4);
                        break;
                    default:image2.setImageResource(R.drawable.scz1);
                        break;
                }
                num = (num % 4) + 1;
            }
        });

    }
}
