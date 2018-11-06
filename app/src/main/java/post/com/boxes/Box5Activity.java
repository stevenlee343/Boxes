package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Box5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box5);
        TextView box5 = findViewById(R.id.box5);
        TextView dim5 = findViewById(R.id.dim5);
        TextView pri5 = findViewById(R.id.pri5);
        box5.setText("Box5");
        dim5.setText("Dimension: 39.5 / 27.5 / 23cm");
        pri5.setText("Price: 90");
    }
}
