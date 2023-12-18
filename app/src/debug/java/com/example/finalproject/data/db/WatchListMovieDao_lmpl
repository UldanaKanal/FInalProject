package com.example.finalproject.data.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WatchListMovieDao_Impl implements WatchListMovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WatchListMovieEntity> __insertionAdapterOfWatchListMovieEntity;

  private final SharedSQLiteStatement __preparedStmtOfRemove;

  public WatchListMovieDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWatchListMovieEntity = new EntityInsertionAdapter<WatchListMovieEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `watch_list` (`movie_id`,`is_favorite`,`poster_path`,`title`,`genre`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WatchListMovieEntity entity) {
        statement.bindLong(1, entity.getMovie_id());
        final int _tmp = entity.is_favorite() ? 1 : 0;
        statement.bindLong(2, _tmp);
        if (entity.getPosterPath() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPosterPath());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTitle());
        }
        if (entity.getGenre() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getGenre());
        }
      }
    };
    this.__preparedStmtOfRemove = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM watch_list WHERE movie_id=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final WatchListMovieEntity movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWatchListMovieEntity.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void remove(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemove.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfRemove.release(_stmt);
    }
  }

  @Override
  public Flow<List<WatchListMovieEntity>> getMoviesFlow() {
    final String _sql = "SELECT * FROM watch_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"watch_list"}, new Callable<List<WatchListMovieEntity>>() {
      @Override
      @NonNull
      public List<WatchListMovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final List<WatchListMovieEntity> _result = new ArrayList<WatchListMovieEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final WatchListMovieEntity _item;
            final int _tmpMovie_id;
            _tmpMovie_id = _cursor.getInt(_cursorIndexOfMovieId);
            final boolean _tmpIs_favorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIs_favorite = _tmp != 0;
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            _item = new WatchListMovieEntity(_tmpMovie_id,_tmpIs_favorite,_tmpPosterPath,_tmpTitle,_tmpGenre);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public WatchListMovieEntity getMovie(final int id) {
    final String _sql = "SELECT * FROM watch_list WHERE movie_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
      final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
      final WatchListMovieEntity _result;
      if (_cursor.moveToFirst()) {
        final int _tmpMovie_id;
        _tmpMovie_id = _cursor.getInt(_cursorIndexOfMovieId);
        final boolean _tmpIs_favorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIs_favorite = _tmp != 0;
        final String _tmpPosterPath;
        if (_cursor.isNull(_cursorIndexOfPosterPath)) {
          _tmpPosterPath = null;
        } else {
          _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpGenre;
        if (_cursor.isNull(_cursorIndexOfGenre)) {
          _tmpGenre = null;
        } else {
          _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
        }
        _result = new WatchListMovieEntity(_tmpMovie_id,_tmpIs_favorite,_tmpPosterPath,_tmpTitle,_tmpGenre);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
