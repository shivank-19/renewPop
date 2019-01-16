package shivank.e_mail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etmail,etpassword;
    Button btnlogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etmail = findViewById(R.id.et_email);
        etpassword = findViewById(R.id.et_pass);
        btnlogin = findViewById(R.id.btn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etmail.getText().toString();
                String password= etpassword.getText().toString();
                Toast.makeText(MainActivity.this,email +","+ password , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
