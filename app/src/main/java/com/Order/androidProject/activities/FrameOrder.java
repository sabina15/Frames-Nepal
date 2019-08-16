package com.Order.androidProject.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.Order.androidProject.R;

public class FrameOrder extends AppCompatActivity {

    String name = "Frame";
    String message = "Order blue sun glass ?\n" + " Rs 800\n\n\n\n\n\n" + "Regards\n";

    String messages = "Order blue sun glass\n?" + " Rs 800\n\n\n\n\n\n" + "Regards\n";

    String messagess = "Order blue sun glass\n?" + " Rs 800\n\n\n\n\n\n" + "Regards\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
    }

    public void button(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:framesnepal@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject, name));
        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(intent);
    }

    public void buttons(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:framesnepal@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject, name));
        intent.putExtra(Intent.EXTRA_TEXT, messages);
        startActivity(intent);
    }


    public void buttonss(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:framesnepal@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject, name));
        intent.putExtra(Intent.EXTRA_TEXT, messagess);
        startActivity(intent);
    }


}

