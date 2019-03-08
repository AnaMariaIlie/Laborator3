package lab03.eim.system.cs.pub.ro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Button> list = new ArrayList<Button>();
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add((Button)findViewById(R.id.button0));
        list.add((Button)findViewById(R.id.button1));
        list.add((Button)findViewById(R.id.button2));
        list.add((Button)findViewById(R.id.button3));
        list.add((Button)findViewById(R.id.button4));
        list.add((Button)findViewById(R.id.button5));
        list.add((Button)findViewById(R.id.button6));
        list.add((Button)findViewById(R.id.button7));
        list.add((Button)findViewById(R.id.button8));
        list.add((Button)findViewById(R.id.button9));
        list.add((Button)findViewById(R.id.button_star));
        list.add((Button)findViewById(R.id.button_diez));

        text = (EditText)findViewById(R.id.text_box);


        for (Button b :list) {
            b.setOnClickListener(getOnClickListener());
        }
    }

    private View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString() + ((Button)view).getText().toString());
            }

        };
    }


}
