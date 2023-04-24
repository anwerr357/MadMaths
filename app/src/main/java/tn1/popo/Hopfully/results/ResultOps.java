package tn1.popo.Hopfully.results;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import ru.noties.jlatexmath.JLatexMathDrawable;
import ru.noties.jlatexmath.JLatexMathView;
import tn1.popo.Hopfully.R;
import tn1.popo.Hopfully.interfaces.MainActivity;
import tn1.popo.Hopfully.interfaces.MatrixOps;
import tn1.popo.Hopfully.interfaces.integral;

public class ResultOps extends AppCompatActivity {
    JLatexMathView mathViewint ;
    MaterialButton homeintres,backintres;
    TextView titleintres ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_ops);
        homeintres = findViewById(R.id.hhh);
        backintres = findViewById(R.id.bbb);
        mathViewint = findViewById(R.id.math);
        titleintres = findViewById(R.id.tit);
        String result = (String) getIntent().getStringExtra("resultops");
        System.out.println(result);
        final JLatexMathDrawable drawable = JLatexMathDrawable.builder(result)
                .textSize(70)
                .build();
        System.out.println("1");
        mathViewint.setLatexDrawable(drawable);
        System.out.println("2");

        homeintres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        backintres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatrixOps.class);
                startActivity(intent);
                finish();
            }
        });

    }
}