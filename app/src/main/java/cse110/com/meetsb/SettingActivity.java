package cse110.com.meetsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SettingActivity extends AppCompatActivity {
    Button submit;
    ImageView profilePictureImageView;
    EditText userNameEditText;
    EditText gpaEditText;
    EditText descriptionEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        submit = findViewById(R.id.setting_button_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingActivity.this, SwipeActivity.class));
            }
        });
    }
}
