package undecided.earbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButtonOnClick(View v) {
        Intent login = new Intent(getBaseContext(), FeedActivity.class);
        EditText email = (EditText)findViewById(R.id.emailLoginText);
        EditText password = (EditText)findViewById(R.id.passwordLoginText);

        TextView error = (TextView)findViewById(R.id.errorLoginLabel);

        // Transition to Feed page
        if(!(email.getText().length()==0) && !(password.getText().length()==0)) {
            error.setVisibility(View.INVISIBLE);

            // This is where the login credentials will be checked ----
            if(true) {
                //Successfully logged in, go to home screen
                email.setText("");
                password.setText("");
                startActivity(login);
            }
            else { // If the login is unsuccessful then show an error message
                error.setText("Problem logging in with these credentials");
                error.setVisibility(View.VISIBLE);
            }
        }
        else {
            error.setText("Please fill out available fields");
            error.setVisibility(View.VISIBLE);
        }
    }

    public void registerButtonOnClick(View v) {
        Intent register = new Intent(getBaseContext(), RegisterActivity.class);

        // Transition to Registration page
        startActivity(register);
    }

}
