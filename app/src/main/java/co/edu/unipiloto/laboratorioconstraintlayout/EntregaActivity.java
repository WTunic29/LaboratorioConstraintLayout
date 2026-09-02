package co.edu.unipiloto.laboratorioconstraintlayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EntregaActivity extends AppCompatActivity {
    private EditText studentName;
    private EditText studentCode;
    private EditText activityName;
    private EditText deliveryDate;
    private EditText evidenceUrl;
    private EditText observations;

    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrega);

        studentName = findViewById(R.id.studentName);
        studentCode = findViewById(R.id.studentCode);
        activityName = findViewById(R.id.activityName);
        deliveryDate = findViewById(R.id.deliveryDate);
        evidenceUrl = findViewById(R.id.evidenceUrl);
        observations = findViewById(R.id.observations);
        registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(v -> registrarEntrega());

    }

    private void registrarEntrega() {

        String nombre = studentName.getText().toString().trim();
        String codigo = studentCode.getText().toString().trim();
        String actividad = activityName.getText().toString().trim();
        String fecha = deliveryDate.getText().toString().trim();

        if (nombre.isEmpty()) {

            studentName.setError("Ingrese el nombre");
            studentName.requestFocus();
            return;

        }

        if (codigo.isEmpty()) {

            studentCode.setError("Ingrese el código");
            studentCode.requestFocus();
            return;

        }

        if (actividad.isEmpty()) {

            activityName.setError("Ingrese la actividad");
            activityName.requestFocus();
            return;

        }

        if (fecha.isEmpty()) {

            deliveryDate.setError("Ingrese la fecha");
            deliveryDate.requestFocus();
            return;

        }

        Toast.makeText(

                this,
                "Entrega registrada correctamente",
                Toast.LENGTH_LONG
        ).show();

    }

}