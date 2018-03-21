package roomdatabase.myapp.com.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Sachin.Choudhary on 3/15/2018.
 */

@Database(entities = {User.class},version = 1)
public abstract class MyRoomDatabase  extends RoomDatabase{

    public abstract MyDao myDao();

}
