package com.example.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title="Google Watch", description = "Android watch"),
        Wish(title="Apartment", description = "Apartment in Brooklyn, NY"),
        Wish(title="Software Engineer Job", description="Tech job in NY or remote")
    )
}
