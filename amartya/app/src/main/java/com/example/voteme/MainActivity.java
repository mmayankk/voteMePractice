package com.example.voteme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView winnerTextView;
    TextView voteA;
    TextView voteB;

    int votesOfA = 0;
    int votesOfB = 0;
    int totalVotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnerTextView = findViewById(R.id.result_text_view);
        voteA = findViewById(R.id.party_a_vote);
        voteB = findViewById(R.id.party_b_vote);
    }

    public void voteForA(View v){

        votesOfA++;
        totalVotes++;
        displayVotes();

        Toast.makeText(this, "You have voted A", Toast.LENGTH_SHORT).show();

    }
    public void voteForB(View v){

        votesOfB++;
        totalVotes++;
        displayVotes();

        Toast.makeText(this, "You have voted B", Toast.LENGTH_SHORT).show();

    }
    public void voteForNone(View v){

        totalVotes++;
        displayVotes();

        Toast.makeText(this, "You have voted None of the Above", Toast.LENGTH_SHORT).show();

    }

    private void displayVotes(){

        voteB.setText(String.valueOf(votesOfB) + "/" + String.valueOf(totalVotes));
        voteA.setText(String.valueOf(votesOfA) + "/" + String.valueOf(totalVotes));

        if (votesOfA > votesOfB){

            winnerTextView.setText("A is Winning");

        } else if (votesOfB > votesOfA){

            winnerTextView.setText("B is Winning");

        } else {

            winnerTextView.setText("Tie");

        }

    }

}
