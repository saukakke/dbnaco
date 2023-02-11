package com.saukakke.dbnaco;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;

public class MainActivity extends Activity 
{
	EditText username, password;
	String u, p;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
	}
	
	public void login(View v){
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
		u = username.getText().toString().trim();
		p = password.getText().toString().trim();
		
		if(u.isEmpty()){
			username.setError("Username is required");
			username.requestFocus();
			Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show();
		}
		
		else if(p.isEmpty()){
			password.setError("Password is required");
			password.requestFocus();
			Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
		}
		
		else if(u.equals("admin") && p.equals("admin")){
			startActivity(new Intent(MainActivity.this, Dashboard.class));
			finish();
		}
		else{
			Toast.makeText(this, "Invalid credentials.", Toast.LENGTH_SHORT).show();
		}
	}
	
}
