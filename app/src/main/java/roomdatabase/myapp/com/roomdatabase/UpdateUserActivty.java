package roomdatabase.myapp.com.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateUserActivty extends AppCompatActivity implements View.OnClickListener {
    EditText edt_userid,edt_username,edt_useremailid;
    Button btnupdate;
    String as;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user_activty);
        edt_userid =findViewById(R.id.edt_userid);
        edt_username=findViewById(R.id.edt_username);
        edt_useremailid =findViewById(R.id.edt_useremailid);

        btnupdate =(Button)findViewById(R.id.btnupdate);
        btnupdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = Integer.parseInt(edt_userid.getText().toString());
        String name1 = edt_username.getText().toString();
        String email1 =edt_useremailid.getText().toString();
        User user = new User();
        user.setId(Integer.parseInt(edt_userid.getText().toString()));
        user.setName(edt_username.getText().toString());
        user.setEmailid(edt_useremailid.getText().toString());

        MainActivity.myRoomDatabase.myDao().UpdateUser(user);
        Toast.makeText(this, "Update Record Successfully", Toast.LENGTH_SHORT).show();

    }
}
