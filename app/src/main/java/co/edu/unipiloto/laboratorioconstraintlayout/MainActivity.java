package co.edu.unipiloto.laboratorioconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button exercise1Button = findViewById(R.id.exercise1Button);
        Button exercise2Button = findViewById(R.id.exercise2Button);
        Button exercise3Button = findViewById(R.id.exercise3Button);
        Button exercise4Button = findViewById(R.id.exercise4Button);
        Button emailButton = findViewById(R.id.emailButton);
        Button deliveryButton = findViewById(R.id.deliveryButton);

        exercise1Button.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise1Activity.class)));
        exercise2Button.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise2Activity.class)));
        exercise3Button.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise3Activity.class)));
        exercise4Button.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise4Activity.class)));
        emailButton.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, EmailActivity.class)));
        deliveryButton.setOnClickListener(v ->
                startActivity(new Intent(this, EntregaActivity.class)));

    }
}