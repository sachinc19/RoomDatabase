package roomdatabase.myapp.com.roomdatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Sachin.Choudhary on 3/15/2018.
 */
@Entity(tableName = "users")
public class User {
//yuy
    @PrimaryKey
    private int id;

    @ColumnInfo (name = "username")
    private String name;

    @ColumnInfo(name = "userEmailid")
    private String emailid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
