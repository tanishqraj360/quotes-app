package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button changeQuoteButton;

    private String[] quotes ={
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Innovation distinguishes between a leader and a follower. - Steve Jobs",
            "The future belongs to those who believe in beauty of their ideas. - Eleanor Roosevelt",
            "I am not alone. Do not underestimate humans, Meruen. You are not alone either. - Isaac Netero",
            "The only ones who should kill are those who are prepared to be killed. - Lelouch Lamperouge",
            "A lesson without pain is meaningless. For you cannot gain something without sacrificing something else in return. - Edward Elric"
    };

    private int currentQuoteIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        changeQuoteButton = findViewById(R.id.changeQuoteButton);

        changeQuoteButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                showNextQuote();
            }
        });
    };

    private void showNextQuote() {
    }
};