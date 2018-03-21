package roomdatabase.myapp.com.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUserInfoActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edt_userid,edt_username,edt_useremailid;
    Button btnsave;
    int userid;
    String name,emailid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user_info);
        edt_userid =findViewById(R.id.edt_userid);
        edt_username=findViewById(R.id.edt_username);
        edt_useremailid =findViewById(R.id.edt_useremailid);
        btnsave =(Button)findViewById(R.id.btnsave);
        btnsave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnsave:
                userid =Integer.parseInt(edt_userid.getText().toString());
                name= edt_username.getText().toString();
                emailid = edt_useremailid.getText().toString();
                User user = new User();
                user.setId(userid);
                user.setName(name);
                user.setEmailid(emailid);
                MainActivity.myRoomDatabase.myDao().AddUser(user);
                Toast.makeText(this, "Add user Successfully", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
