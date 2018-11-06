package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edLength;
    private EditText edWidth;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
         edLength = findViewById(R.id.ed_length);
         edWidth = findViewById(R.id.ed_width);
         edHeight = findViewById(R.id.ed_height);


    }

    public void boxes(View view){

        EditText edLength = findViewById(R.id.ed_length);
        EditText edWidth = findViewById(R.id.ed_width);
        EditText edHeight = findViewById(R.id.ed_height);
        float length = Float.parseFloat(edLength.getText().toString());
        float width = Float.parseFloat(edWidth.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());


        if(length < 39.5 && width < 27.5 && height < 23) {
            Intent intent = new Intent(this, Box3Activity.class);
            intent.putExtra("Box3", height);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, Box5Activity.class);
            intent.putExtra("Box5", height);
            startActivity(intent);

        }



    }
}
