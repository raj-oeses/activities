package activity.activity.activitiesnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button camera,auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera=findViewById(R.id.camera);
        auth=findViewById(R.id.auth);


        camera.setOnClickListener(this);
        auth.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.camera:
                Intent camera=new Intent(this,Camera.class);
                startActivity(camera);
                break;
            case R.id.auth:
                Intent auth=new Intent(this,Authentication.class);
                startActivity(auth);
                break;
        }
    }
}