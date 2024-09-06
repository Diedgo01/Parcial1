package com.example.parcial1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText usuario, contrasena;
     Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = usuario.getText().toString();

                String contra = contrasena.getText().toString();

                if (user.isEmpty() || contra.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Los campos estan vacios, por favor rellanarlos", Toast.LENGTH_SHORT).show();
                } else if (user.equals("uac123") && contra.equals("12345678")) {
                    Intent intent = new Intent(MainActivity.this, pantalla2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "El usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
