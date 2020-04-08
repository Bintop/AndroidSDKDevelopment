package irdc.ex03_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView2;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.v("wwb","哈哈哈哈哈哈哈哈");

        Resources resources = getBaseContext().getResources();
        Drawable hippoDrawable = resources.getDrawable(R.drawable.mycolor);


        mTextView1 = findViewById(R.id.textView1);
        mTextView2 = findViewById(R.id.textView2);
        mButton = findViewById(R.id.button);

        mTextView1.setBackground(hippoDrawable);
        mTextView1.setText("我是应用Drawable背景色的戴维文本");
        // 紫红色
        mTextView2.setTextColor(Color.MAGENTA);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                Date date = new Date(System.currentTimeMillis());
                mTextView1.setText("北京时间：" + simpleDateFormat.format(date));
            }
        });

        // mTextView.setText("你好，世界，这是一个测试用例");
    }
}
