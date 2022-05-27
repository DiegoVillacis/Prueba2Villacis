package fisei.uta.ec.prueba2villacis;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import fisei.uta.ec.prueba2villacis.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.textbox_usuario);
        pass = findViewById(R.id.textbox_clave);


    }

    public void onClickIngresar(View view) {

        String usr = user.getText().toString();
        String pas = pass.getText().toString();

        if ((usr == "usr1" && pas == "usr1") || (usr == "usr2" && pas == "usr2") || (!usr.isEmpty() && !pas.isEmpty())) {

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("key_user", usr);
            startActivity(intent);
        }

    }

}
