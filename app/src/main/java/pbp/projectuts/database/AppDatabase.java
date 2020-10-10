package pbp.projectuts.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import pbp.projectuts.User;

@Database(entities = {User.class}, version= 1 )
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}