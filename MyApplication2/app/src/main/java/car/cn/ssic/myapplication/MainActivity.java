package car.cn.ssic.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import car.cn.ssic.testlib.LUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LUtils.fky();
    }
}
