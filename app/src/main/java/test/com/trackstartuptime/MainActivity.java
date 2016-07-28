package test.com.trackstartuptime;

import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testCount();
        Debug.stopMethodTracing();
    }

    public void testCount() {
        for (int i = 0; i < 1000; i++) {
            Log.e("testcount", "counting");
        }
    }
}
