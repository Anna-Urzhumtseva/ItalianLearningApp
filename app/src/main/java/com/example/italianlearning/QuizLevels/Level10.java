package com.example.italianlearning.QuizLevels;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.italianlearning.GameLevels.*;
import com.example.italianlearning.R;

public class Level10 extends AppCompatActivity implements View.OnClickListener {

    TextView question1;
    TextView totalQuestionsTextView;
    Button answer;
    Button ans_a,ans_b,ans_c,ans_d;
    int score = 0;
    int currentQuestionIndex = 0;
    int totalQuestions = QuestionAnswer.question1.length;
    String selectedAnswers = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_question);

        question1 = findViewById(R.id.question1);
        totalQuestionsTextView = findViewById(R.id.total_questions);
        ans_a = findViewById(R.id.ans_a);
        ans_b = findViewById(R.id.ans_b);
        ans_c = findViewById(R.id.ans_c);
        ans_d = findViewById(R.id.ans_d);
        answer = findViewById(R.id.answer);

        ans_a.setOnClickListener(this);
        ans_b.setOnClickListener(this);
        ans_c.setOnClickListener(this);
        ans_d.setOnClickListener(this);
        answer.setOnClickListener(this);

        loadNewQuestion();




        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //создаем переменную text_levels
        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level10); //установили текст "Уровень X"



        //кнопка меню
        TextView button_back1 = (TextView)findViewById(R.id.button_back1);
        button_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Intent intent = new Intent(Level10.this, GameLevels.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });




    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {

        ans_a.setBackgroundColor(Color.WHITE);
        ans_b.setBackgroundColor(Color.WHITE);
        ans_c.setBackgroundColor(Color.WHITE);
        ans_d.setBackgroundColor(Color.WHITE);

        Button clicledButton = (Button) view;
        if(clicledButton.getId()==R.id.answer){
            if(selectedAnswers.equals(QuestionAnswer.correctAnswers1[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choised btn click
            selectedAnswers = clicledButton.getText().toString();
            clicledButton.setBackgroundColor(Color.LTGRAY);

        }
    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestions){
            finishQuis();
            return;
        }



        question1.setText(QuestionAnswer.question1[currentQuestionIndex]);
        ans_a.setText(QuestionAnswer.choises1[currentQuestionIndex][0]);
        ans_b.setText(QuestionAnswer.choises1[currentQuestionIndex][1]);
        ans_c.setText(QuestionAnswer.choises1[currentQuestionIndex][2]);
        ans_d.setText(QuestionAnswer.choises1[currentQuestionIndex][3]);
    }
    void backGameLevels(){
        if(currentQuestionIndex == totalQuestions){
            try{
                Intent intent = new Intent(Level10.this, GameLevels.class);
                startActivity(intent); finish();
            }catch (Exception e){

            }
        }
    }

    void finishQuis(){

        String pussStatus = "";
        if (score>totalQuestions*0.8){
            pussStatus = "Пройдено";
            new AlertDialog.Builder(this)
                    .setTitle(pussStatus)
                    .setMessage("Счёт " + score + " из " +totalQuestions)
                    .setPositiveButton("В меню",(dialogInterface, i) -> backGameLevels())
                    .setCancelable(false)
                    .show();
        }else {
            pussStatus = "Провалено";
            new AlertDialog.Builder(this)
                    .setTitle(pussStatus)
                    .setMessage("Счёт " + score + " из " +totalQuestions)
                    .setPositiveButton("Пройти заново",(dialogInterface, i) -> restartQuis())
                    .setCancelable(false)
                    .show();
        }



    }

    void restartQuis(){
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }


}



















