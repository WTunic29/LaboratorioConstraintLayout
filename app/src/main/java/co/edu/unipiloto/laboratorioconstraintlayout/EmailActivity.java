package co.edu.unipiloto.laboratorioconstraintlayout;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {
    private EditText emailAddress;
    private EditText subject;
    private EditText message;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        emailAddress = findViewById(R.id.emailAddress);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(v -> enviarCorreo());

    }

    private void enviarCorreo() {

        String destinatario = emailAddress.getText().toString().trim();
        String asunto = subject.getText().toString().trim();
        String mensaje = message.getText().toString().trim();

        if (destinatario.isEmpty()) {

            emailAddress.setError("Ingrese un correo electrónico");
            emailAddress.requestFocus();
            return;

        }

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + Uri.encode(destinatario)));
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        intent.putExtra(Intent.EXTRA_TEXT, mensaje);

        try {

            startActivity(intent);

        } catch (Exception e) {

            Toast.makeText(
                    this,
                    "No hay una aplicación de correo disponible",
                    Toast.LENGTH_LONG
            ).show();

        }

    }

}