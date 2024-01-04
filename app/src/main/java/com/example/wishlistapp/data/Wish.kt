package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title="Google Watch", description = "Android watch"),
        Wish(title="Apartment", description = "Apartment in Brooklyn, NY"),
        Wish(title="Software Engineer Job", description="Tech job in NY or remote")
    )
}
