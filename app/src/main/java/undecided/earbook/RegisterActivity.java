package undecided.earbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void registerButtonOnClick(View v) {
        Intent login = new Intent(getBaseContext(), MainActivity.class);
        EditText name = (EditText)findViewById(R.id.nameRegistrationText);
        EditText email = (EditText)findViewById(R.id.emailRegistrationText);
        EditText password = (EditText)findViewById(R.id.passwordRegistrationText);

        TextView error = (TextView)findViewById(R.id.errorRegistrationLabel);

        // Check that the registration info is not blank
        if(!(name.getText().length()==0) && !(email.getText().length()==0) && !(password.getText().length()==0)) {
            // Check if email does not already exist on server
            if(true) {
                // Add these credentials to server and redirect to login page
                // Maybe take these login credentials and transfer to login page
                error.setVisibility(View.INVISIBLE);
                name.setText("");
                email.setText("");
                password.setText("");

                //Set error text on login page to say "successful registration"
                startActivity(login);
            }
            else {
                error.setText("Email already exists in database");
                error.setVisibility(View.VISIBLE);
            }

        }
        else {
            error.setText("Please fill in all available fields");
            error.setVisibility(View.VISIBLE);
        }
    }

    public void cancelButtonOnClick(View v) {
        Intent login = new Intent(getBaseContext(), MainActivity.class);

        //Just backs out to the main login page
        startActivity(login);
    }


}
