package ua.nure.liubchenko.pr0;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Fragment fragment = getFragment(getResources().getConfiguration().orientation);

        getSupportFragmentManager().beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Fragment fragment = getFragment(newConfig.orientation);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commitNow();
    }

    private Fragment getFragment(int orientation) {
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            return LandscapeFragment.newInstance();
        }
        return PortraitFragment.newInstance();
    }
}
