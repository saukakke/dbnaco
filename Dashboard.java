package com.saukakke.dbnaco;
import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.preference.*;

public class Dashboard extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		MenuInflater m = getMenuInflater();
		m.inflate(R.layout.menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch(item.getItemId()){
			case R.id.logout:
				finish();
				return true;
			case R.id.update:
				update();
				return true;
			case R.id.search:
				search();
				return true;
			case R.id.delete:
				delete();
				return true;
			case R.id.view:
				view();
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void add(){
		startActivity(new Intent(this, Add.class));
	}
	
	public void search(){
		startActivity(new Intent(this, Search.class));
	}
	
	public void update(){
		startActivity(new Intent(this, Update.class));
	}
	
	public void view(){
		startActivity(new Intent(this, ViewRecords.class));
	}
	
	public void delete(){
		startActivity(new Intent(this, Delete.class));
	}
	
}
