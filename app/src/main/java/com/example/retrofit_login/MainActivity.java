package com.example.retrofit_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit_login.Api_Call.RetrofitApi;
import com.example.retrofit_login.Model.LoginRequest;
import com.example.retrofit_login.Model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    TextView email;
    TextView password;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailname);
        password = findViewById(R.id.password);
        button=(Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("sametag", "button " );

                if(validation()){
                    retrofit_log_in_operation();


                }
                else {
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                    Log.e("sametag", "Validation error: " );

                }

            }});
        }
        //end on create








    //validation
    private boolean validation() {
        boolean flag = true;
        if (email.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "You must enter email  to login", Toast.LENGTH_SHORT).show();
            flag = false;
        } else if (email.getText().toString().length() < 2) {
            Toast.makeText(MainActivity.this, "user name must be more then 4 char", Toast.LENGTH_SHORT).show();
            flag = false;
        } else if (password.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "You must enter password  to login!", Toast.LENGTH_SHORT).show();
            flag = false;
        }

        return flag;
    }

    public void retrofit_log_in_operation() {
     String user= email.getText().toString();
     String pass= password.getText().toString();


        LoginRequest request= new LoginRequest("963a5ef80129a9d5",pass,user);
        Call<LoginResponse> call = RetrofitApi.getInstance().getService().login(request);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                LoginResponse loginResponse = response.body();

                if(response.isSuccessful()) {

                    Log.e("sametag", "LoginResponse Success: " + loginResponse.toString());
                }
                else {

                }


                }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("sametag", "LoginResponse Error: ");


            }
        });



    }



    }

