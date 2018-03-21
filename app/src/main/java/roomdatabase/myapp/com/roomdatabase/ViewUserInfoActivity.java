package roomdatabase.myapp.com.roomdatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class ViewUserInfoActivity extends AppCompatActivity {
TextView txtInfo;
String Info ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user_info);
        txtInfo =findViewById(R.id.txtInfo);
       List<User> users = MainActivity.myRoomDatabase.myDao().viewUsers();
      /*  for(int i=0;i<users.size();i++){
            int id =users.get(i).getId();
            String name = users.get(i).getName();
            String emailid = users.get(i).getEmailid();
            Info  =Info + "\n\nID :"+id+"\n"+"Name : "+name+"\n"+"Emailid : "+emailid+"\n";
        }*/
       for(User use : users){
           int id =use.getId();
           String name = use.getName();
           String emailid = use.getEmailid();
           Info  =Info + "\n\nID :"+id+"\n"+"Name : "+name+"\n"+"Emailid : "+emailid+"\n";
       }
        txtInfo.setText(Info);
    }
}
