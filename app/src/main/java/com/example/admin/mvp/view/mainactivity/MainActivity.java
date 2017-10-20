package com.example.admin.mvp.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.mvp.R;
import com.example.admin.mvp.di.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    private EditText etFullName;
    private TextView tvFullName;

    @Inject
    public MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFullName = (EditText) findViewById(R.id.etFullName);
        tvFullName = (TextView) findViewById(R.id.tvFullName);

        //presenter = new MainActivityPresenter();

        //Dagger[ComponentName] DaggerMain

        DaggerMainActivityComponent.create().inject(this);

        presenter.addView(this);

    }

    public void getFullName(View view) {

        String firstName = etFullName.getText().toString();
        presenter.getFullName(firstName);

    }

    @Override
    public void showError(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFullName(String fullName) {
        tvFullName.setText(fullName);
    }
}
