package localhost.test.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Toast.makeText(this,getIntent().getStringExtra("UserCategory"),Toast.LENGTH_LONG).show();
    }
}
