package com.example.honpoll_tst.ui.voting;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.honpoll_tst.MainActivity;
import com.example.honpoll_tst.R;
import com.example.honpoll_tst.ui.dashboard.DashboardFragment;
import com.example.honpoll_tst.ui.dashboard.DashboardViewModel;

public class PresidentVoting extends Activity {
    private Button saveandcontinue, voteabayi;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presidentvoting);

        initUI();

        saveandcontinue.setOnClickListener(view -> startActivity(new Intent(PresidentVoting.this, ViceVoting.class)));

        voteabayi.setOnClickListener(view -> {
            CardView cardView = new CardView(PresidentVoting.this);
            cardView.setCardBackgroundColor(Color.WHITE);
            cardView.setRadius(10.0f);
            // Add some text to the card
            TextView textView = new TextView(PresidentVoting.this);
            textView.setText("This is a card!");
            textView.setTextColor(Color.BLACK);
            // Add the text view to the card
            cardView.addView(textView);
            // Add the card to the layout
            layout.addView(cardView);
        });

    }

    public void initUI(){
        layout = findViewById(R.id.navigation_dashboard);
        saveandcontinue = findViewById(R.id.savecon);
        voteabayi = findViewById(R.id.abayibutton);

    }
}
