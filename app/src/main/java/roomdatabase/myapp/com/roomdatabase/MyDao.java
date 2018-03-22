package roomdatabase.myapp.com.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Sachin.Choudhary on 3/15/2018.
 */
@Dao
public interface MyDao {  //data access object
    @Insert
    public void AddUser(User user);

    @Query("select * from users")
    public List<User> viewUsers();

    @Update
    public void UpdateUser(User user);

    @Query("delete from users where username = :username")
    public void deleteUsers(String username);
}
