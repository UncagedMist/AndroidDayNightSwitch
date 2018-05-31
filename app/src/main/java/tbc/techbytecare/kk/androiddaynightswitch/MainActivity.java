package tbc.techbytecare.kk.androiddaynightswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    DayNightSwitch dayNightSwitch;
    View backGroundView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayNightSwitch = findViewById(R.id.dayNightSwitch);
        backGroundView = findViewById(R.id.backGroundView);

        dayNightSwitch.setDuration(450);

        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean isNight) {
                if (isNight)    {
                    Toast.makeText(MainActivity.this, "Night Mode...", Toast.LENGTH_SHORT).show();
                    backGroundView.setAlpha(1f);
                }
                else    {
                    Toast.makeText(MainActivity.this, "Day Mode...", Toast.LENGTH_SHORT).show();
                    backGroundView.setAlpha(0f);
                }
            }
        });
    }
}
