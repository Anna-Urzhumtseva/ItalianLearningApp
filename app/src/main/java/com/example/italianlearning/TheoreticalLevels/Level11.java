package com.example.italianlearning.TheoreticalLevels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.italianlearning.GameLevels.GameLevels;
import com.example.italianlearning.QuizLevels.Level10;
import com.example.italianlearning.R;

public class Level11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //создаем переменную text_levels
        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level11); //установили текст "Уровень X"

        //начало наполнение уровня

        TextView text = findViewById(R.id.text);
        text.setText(R.string.lvl11_center);
        TextView text_right1 = findViewById(R.id.text_right1);
        text_right1.setText(R.string.lvl11_text_right1);
        TextView text_left1 = findViewById(R.id.text_left1);
        text_left1.setText(R.string.lvl11_text_left1);
        TextView text_center2 = findViewById(R.id.text_center2);
        text_center2.setText(R.string.lvl11_center2);

        //конецнаполнение уровня



        //кнопка меню
        TextView button_back1 = (TextView)findViewById(R.id.button_back1);
        button_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Intent intent = new Intent(Level11.this, GameLevels.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка назад
        TextView button_back2 = (TextView)findViewById(R.id.button_back2);
        button_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Intent intent = new Intent(Level11.this, Level10.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });
        // кнопка для перехода дальше
        TextView text_next  = (TextView)findViewById(R.id.text_next);
        text_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(Level11.this, Level12.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });
    }
    //системная кнопка назад
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(Level11.this, Level10.class);
            startActivity(intent); finish();
        }catch (Exception e){

        }
    }
}