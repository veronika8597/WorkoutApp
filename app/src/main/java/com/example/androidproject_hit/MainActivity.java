package com.example.androidproject_hit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();


        /// First clickable span
        SpannableString ss1 = new SpannableString("Don't have an account? Register");

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View textView1) {
                Intent intent1 = new Intent(MainActivity.this, Registration.class);
                startActivity(intent1);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };

        ss1.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView = (TextView) findViewById(R.id.Register_ClickableTextView);
        textView.setText(ss1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView.setHighlightColor(Color.TRANSPARENT);


        /// Second clickable span
        SpannableString ss2 = new SpannableString("Admin? Click here");

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View textView2) {
/*                Intent intent2 = new Intent(MainActivity.this, Registration.class);
                startActivity(intent2);*/
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };

        ss2.setSpan(clickableSpan2, 8, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView2 = (TextView) findViewById(R.id.Admin_ClickableTextView);
        textView2.setText(ss2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        textView2.setHighlightColor(Color.TRANSPARENT);
    }
}
