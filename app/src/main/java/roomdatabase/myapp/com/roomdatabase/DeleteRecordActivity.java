package roomdatabase.myapp.com.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DeleteRecordActivity extends AppCompatActivity {
Button btndelete;
EditText edtusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_record);
        edtusername=findViewById(R.id.edtusername);
        btndelete=findViewById(R.id.btndelete);
        edtusername=findViewById(R.id.edtusername);
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=edtusername.getText().toString();
                MainActivity.myRoomDatabase.myDao().deleteUsers(username);
                Toast.makeText(DeleteRecordActivity.this, "Delete Record Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
