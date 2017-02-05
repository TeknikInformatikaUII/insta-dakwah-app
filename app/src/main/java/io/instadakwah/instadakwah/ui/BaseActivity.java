package io.instadakwah.instadakwah.ui;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.instadakwah.instadakwah.R;

/**
 * Created by wisnu on 12/01/2017.
 */

public class BaseActivity extends AppCompatActivity {
    @Nullable
    @BindView(R.id.toolbar_main) Toolbar toolbar;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        bindViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    protected void bindViews() {
        ButterKnife.bind(this);
        setupToolbar();
    }

    protected void setupToolbar() {
        if (toolbar != null) {
            toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_upload_image:
                Toast.makeText(this, "Upload", Toast.LENGTH_SHORT).show();
                // TODO: 15/01/2017 Upload image here...
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    protected int getStatusBarHeight() {
        final int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        return resourceId > 0 ? getResources().getDimensionPixelSize(resourceId) : 0;
    }

}
