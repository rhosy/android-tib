package ac.id.uim.ti_b.ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.btn_pindah_activity);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO SOMETHING HERE
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);

            }
        });
    }
}
