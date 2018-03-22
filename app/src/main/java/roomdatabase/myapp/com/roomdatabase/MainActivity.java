package roomdatabase.myapp.com.roomdatabase;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

   public static MyRoomDatabase myRoomDatabase;
   Button button,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addd s = new Addd();
        int aa = s.a1;
        button =(Button)findViewById(R.id.button);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        myRoomDatabase = Room.databaseBuilder(getApplicationContext(),MyRoomDatabase.class,"UserDB").allowMainThreadQueries().build();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent i = new Intent(MainActivity.this,AddUserInfoActivity.class);
                startActivity(i);
                break;

            case R.id.button2:
                Intent i1 = new Intent(MainActivity.this,ViewUserInfoActivity.class);
                startActivity(i1);
                break;
            case R.id.button3:
                Intent i2 = new Intent(MainActivity.this,DeleteRecordActivity.class);
                startActivity(i2);
                break;

            case R.id.button4:
                Intent i3 = new Intent(MainActivity.this,UpdateUserActivty.class);
                startActivity(i3);
                break;

        }
    }
}
