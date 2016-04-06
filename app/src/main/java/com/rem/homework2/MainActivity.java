package com.rem.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.rightContainer);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout linearLayout2 = new LinearLayout(this);
        LinearLayout linearLayout3 = new LinearLayout(this);
        ImageView imageView1 = new ImageView(this);
        ImageView imageView2 = new ImageView(this);
        ImageView imageView3 = new ImageView(this);

        imageView1.setImageResource(R.mipmap.ic_launcher);
        imageView2.setImageResource(R.mipmap.ic_launcher);
        imageView3.setImageResource(R.mipmap.ic_launcher);

        textView1.setText("Some text");
        textView1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView2.setText("Some text");
        textView2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView3.setText("Some text");
        textView3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        linearLayout.setId(R.id.right_first);
        linearLayout.addView(imageView1);
        linearLayout.addView(textView1);
        linearLayout.setBackgroundColor(Color.rgb(251, 250, 250));

        linearLayout2.setId(R.id.right_second);
        linearLayout2.addView(imageView2);
        linearLayout2.addView(textView2);
        linearLayout2.setBackgroundColor(Color.rgb(251, 250, 250));

        linearLayout3.addView(imageView3);
        linearLayout3.addView(textView3);
        linearLayout3.setBackgroundColor(Color.rgb(251, 250, 250));

        viewGroup.addView(linearLayout);
        viewGroup.addView(linearLayout2);
        viewGroup.addView(linearLayout3);

        RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams1.setMargins(20, 20, 20, 20);
        layoutParams1.width = LinearLayout.LayoutParams.MATCH_PARENT;
        layoutParams1.height = LinearLayout.LayoutParams.WRAP_CONTENT;

        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout2.getLayoutParams();
        layoutParams2.setMargins(20, 20, 20, 20);
        layoutParams2.width = LinearLayout.LayoutParams.MATCH_PARENT;
        layoutParams2.height = LinearLayout.LayoutParams.WRAP_CONTENT;
        layoutParams2.addRule(RelativeLayout.BELOW, R.id.right_first);

        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout3.getLayoutParams();
        layoutParams3.setMargins(20, 20, 20, 20);
        layoutParams3.width = LinearLayout.LayoutParams.MATCH_PARENT;
        layoutParams3.height = LinearLayout.LayoutParams.WRAP_CONTENT;
        layoutParams3.addRule(RelativeLayout.BELOW, R.id.right_second);
    }

}
