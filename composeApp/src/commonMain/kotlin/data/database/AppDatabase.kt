package data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import features.expenses.models.ExpensesDataModel
import features.expenses.models.IncomesDataModel

@Database(entities = [ExpensesDataModel::class, IncomesDataModel::class], version = 1)
abstract class AppDatabase: RoomDatabase(), DB {
    abstract fun getExpensesDao(): ExpensesDao

    abstract fun getIncomesDao(): IncomesDao

    override fun clearAllTables() {
        super.clearAllTables()
    }
}

// FIXME: Added a hack to resolve below issue:
// Class 'AppDatabase_Impl' is not abstract and does not implement abstract base class member 'clearAllTables'.
interface DB {
    fun clearAllTables() {}
}

internal const val dbFileName = "app.db"