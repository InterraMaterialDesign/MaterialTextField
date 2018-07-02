package textfields.materialdesign.interra.com.textfields;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Base extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_type);

        Button button = findViewById(R.id.button);
        final TextInputLayout textInputLayout1 = findViewById(R.id.textInputLayout);
        final TextInputEditText textInput1 = findViewById(R.id.editText1);
        final TextInputLayout textInputLayout2 = findViewById(R.id.textInputLayoutPassword);
        final TextInputEditText textInput2 = findViewById(R.id.editText2);
        TextInputLayout textInputLayout3 = findViewById(R.id.textInputLayout1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(textInput1.getText().length() == 0) {
                    textInputLayout1.setError("Cannot be empty!");
                    textInput1.setError("Cannot be empty!", getDrawable(R.drawable.ic_error_black_24dp));
                }
                else {
                    textInputLayout1.setErrorEnabled(false);
                }
                if(textInput2.getText().length() > 8) {
                    textInputLayout2.setError("Length must be less than 8");
                }
            }
        });


    }
}

