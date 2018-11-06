package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Box3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box3);
        TextView box3 = findViewById(R.id.box3);
        TextView dim3 = findViewById(R.id.dim3);
        TextView pri3 = findViewById(R.id.pri3);
        box3.setText("Box3");
        dim3.setText("Dimension: 23 / 14 / 13 cm");
        pri3.setText("Price: 65");
    }
}
