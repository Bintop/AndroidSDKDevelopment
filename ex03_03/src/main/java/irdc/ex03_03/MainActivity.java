package irdc.ex03_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.v("wwb","哈哈哈哈哈哈哈哈");

        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                Date date = new Date(System.currentTimeMillis());
                mTextView.setText("北京时间：" + simpleDateFormat.format(date));
            }
        });

        // mTextView.setText("你好，世界，这是一个测试用例");
    }
}
