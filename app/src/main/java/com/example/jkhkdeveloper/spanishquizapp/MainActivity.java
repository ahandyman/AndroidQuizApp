package com.example.jkhkdeveloper.spanishquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String question_one_answer;
    String question_two_answer;
    String question_three_answer;
    String question_four_answer;
    String question_five_answer;
    String question_six_answer;
    String question_seven_answer;
    String question_eight_answer;
    String question_nine_answer;
    String question_ten_answer;
    String question_eleven_answer;
    String question_twelve_answer;

    int totalCorrect = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizResults(View view) {

        CheckBox answerSix = (CheckBox) findViewById(R.id.correct_answer_six);
        /**
         * answerSix1, answerSix2, answerSix3 are created to rule out multiple options selected by user
         * in case more than one option is selected the if-else case will test incorrect
         */
        CheckBox answerSix1 = (CheckBox) findViewById(R.id.incorrect_answer_six_1);
        CheckBox answerSix2 = (CheckBox) findViewById(R.id.incorrect_answer_six_2);
        CheckBox answerSix3 = (CheckBox) findViewById(R.id.incorrect_answer_six_3);

        CheckBox answerSeven = (CheckBox) findViewById(R.id.correct_answer_seven);
        /**
         * answerSeven1, answerSeven2, answerSeven3 are created to rule out multiple options selected by user
         * in case more than one option is selected the if-else case will test incorrect
         */
        CheckBox answerSeven1 = (CheckBox) findViewById(R.id.incorrect_answer_seven_1);
        CheckBox answerSeven2 = (CheckBox) findViewById(R.id.incorrect_answer_seven_2);
        CheckBox answerSeven3 = (CheckBox) findViewById(R.id.incorrect_answer_seven_3);
        RadioButton answerEight = (RadioButton) findViewById(R.id.correct_answer_eight);
        RadioButton answerNine = (RadioButton) findViewById(R.id.correct_answer_nine);
        RadioButton answerTen = (RadioButton) findViewById(R.id.correct_answer_ten);
        RadioButton answerEleven = (RadioButton) findViewById(R.id.correct_answer_eleven);
        RadioButton answerTwelve = (RadioButton) findViewById(R.id.correct_answer_twelve);


/**
 *       ISCHECKED();
 *       RETURNS A BOOLEAN
 */
        boolean correct_six = answerSix.isChecked();
        boolean incorrect_six1 = answerSix1.isChecked();
        boolean incorrect_six2 = answerSix2.isChecked();
        boolean incorrect_six3 = answerSix3.isChecked();
        boolean incorrect_seven1 = answerSeven1.isChecked();
        boolean incorrect_seven2 = answerSeven2.isChecked();
        boolean incorrect_seven3 = answerSeven3.isChecked();
        boolean correct_seven = answerSeven.isChecked();
        boolean correct_eight = answerEight.isChecked();
        boolean correct_nine = answerNine.isChecked();
        boolean correct_ten = answerTen.isChecked();
        boolean correct_eleven = answerEleven.isChecked();
        boolean correct_twelve = answerTwelve.isChecked();

/**
 *       EDITTEXT
 *       RETURNS A STRING
 */
        EditText lessThan = (EditText) findViewById(R.id.answer_one);
        String one_answer = lessThan.getText().toString();
        Log.v("MainActivity", one_answer);

        EditText android = (EditText) findViewById(R.id.answer_two);
        String two_answer = android.getText().toString();
        Log.v("MainActivity", two_answer);

        EditText height = (EditText) findViewById(R.id.answer_three);
        String three_answer = height.getText().toString();
        Log.v("MainActivity", three_answer);

        EditText text = (EditText) findViewById(R.id.answer_four);
        String four_answer = text.getText().toString();
        Log.v("MainActivity", four_answer);

        EditText greaterThan = (EditText) findViewById(R.id.answer_five);
        String five_answer = greaterThan.getText().toString();
        Log.v("MainActivity", five_answer);

        /**
         * QUESTION ONE
         */

        String answer1 = "<";
        if (answer1.equals(one_answer)) {
            question_one_answer = "Correct";
            totalCorrect += 1;

        } else {
            question_one_answer = "Incorrect";
        }


        /**
         * QUESTION TWO
         */

        String answer2 = "android";
        if (answer2.equals(two_answer)) {
            question_two_answer = "Correct";
            totalCorrect += 1;
        } else {
            question_two_answer = "Incorrect";
        }

        /**
         * QUESTION THREE
         */

        String answer3 = "layout_height";
        if (answer3.equals(three_answer)) {
            question_three_answer = "Correct";
            totalCorrect += 1;

        } else {
            question_three_answer = "Incorrect";
        }
        /**
         * QUESTION FOUR
         */

        String answer4 = "text";
        if (answer4.equals(four_answer)) {
            question_four_answer = "Correct";
            totalCorrect += 1;

        } else {
            question_four_answer = "Incorrect";
        }

        /**
         * QUESTION FIVE
         */

        String answer5 = "/>";
        if (answer5.equals(five_answer)) {
            question_five_answer = "Correct";
            totalCorrect += 1;

        } else {
            question_five_answer = "Incorrect";
        }
        /**
         * QUESTION SIX
         * IF statement returns correct if (ONLY) All of the Above option is selected
         * ELSE IF statement returns correct if (ONLY) all three choices are selected
         * ELSE statement returns incorrect if first two statements false (nothing is selected
         */

        if (correct_six && incorrect_six1 && incorrect_six2 && incorrect_six3) {
            question_six_answer = "Incorrect";

        } else if (incorrect_six1 && incorrect_six2 && incorrect_six3) {
            question_six_answer = "Correct";
            totalCorrect += 1;

        } else if (correct_six && !incorrect_six1 && !incorrect_six2 && !incorrect_six3) {
            question_six_answer = "Correct";
            totalCorrect += 1;

        } else {
            question_six_answer = "Incorrect";
        }
        /**
         * QUESTION SEVEN
         * IF statement returns correct if (ONLY) TextView is selected
         * ELSE statement returns incorrect for any other selection
         */
        if (correct_seven && !incorrect_seven1 && !incorrect_seven2 && !incorrect_seven3) {
            question_seven_answer = "Correct";
            totalCorrect += 1;
        } else {
            question_seven_answer = "Incorrect";
        }
        /**
         * QUESTION EIGHT
         */
        if (correct_eight) {
            question_eight_answer = "Correct";
            totalCorrect += 1;
        } else {
            question_eight_answer = "Incorrect";
        }
        /**
         * QUESTION NINE
         */
        if (correct_nine) {
            question_nine_answer = "Correct";
            totalCorrect += 1;

        } else {
            question_nine_answer = "Incorrect";
        }
        /**
         * QUESTION TEN
         */
        if (correct_ten) {
            question_ten_answer = "Correct";
            totalCorrect += 1;
        } else {
            question_ten_answer = "Incorrect";
        }
        /**
         * QUESTION ELEVEN
         */
        if (correct_eleven) {
            question_eleven_answer = "Correct";
            totalCorrect += 1;
        } else {
            question_eleven_answer = "Incorrect";
        }
        /**
         * QUESTION TWELVE
         */
        if (correct_twelve) {
            question_twelve_answer = "Correct";
            totalCorrect += 1;
        } else {
            question_twelve_answer = "Incorrect";
        }

        Toast.makeText(this, "You scored " + totalCorrect + "out of 12", Toast.LENGTH_SHORT).show();
        String grade = quizResultSummary(question_one_answer, question_two_answer, question_three_answer, question_four_answer, question_five_answer, question_six_answer, question_seven_answer, question_eight_answer, question_nine_answer, question_ten_answer, question_eleven_answer, question_twelve_answer);
        displayQuizResults(grade);


    }
  /**
    private int finalTestResults(int testScore) {
        return testScore;
    }

    public void displayScore(int score) {
        TextView numberScore = (TextView) findViewById(R.id.score);
        numberScore.setText(score);
    }
*/
    public void displayQuizResults(String ans) {
        TextView results = (TextView) findViewById(R.id.resultSummary);
        results.setText(ans);
    }

    private String quizResultSummary(String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String ten, String eleven, String twelve) {

        String summary = "1. " + one;
        summary += "\n2. " + two;
        summary += "\n3. " + three;
        summary += "\n4. " + four;
        summary += "\n5. " + five;
        summary += "\n6. " + six;
        summary += "\n7. " + seven;
        summary += "\n8. " + eight;
        summary += "\n9. " + nine;
        summary += "\n10. " + ten;
        summary += "\n11. " + eleven;
        summary += "\n12. " + twelve;
        return summary;
    }
}
