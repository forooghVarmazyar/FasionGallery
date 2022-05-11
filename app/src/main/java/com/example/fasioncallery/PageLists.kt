package com.example.fasioncallery

object PageLists {
    //Todo create a list with 3 intro items containig an image, a title and a description
    val introSlides = listOf(
        Intro(R.drawable.tshirt2, "tee_Shirt", "Nicely design T-Shirt tailored to your test"),
        Intro(
            R.drawable.sneaker1,
            "sneakers",
            "Comfortable and affordable shoe wear to keep you \n balanced while taking a walk "
        ),
        Intro(
            R.drawable.hoodi1,
            "Hoody",
            "Identify with Styles by getting one of the customized \n hoodis in store "
        )
    )

    val tShirts = listOf(
        Intro(R.drawable.tshirt1, "Bicolor T-shirt", null),
        Intro(R.drawable.tshirt2, "White T-shirt", null),
        Intro(R.drawable.tshirt3, "Black T-shirt", null),
        Intro(R.drawable.tshirt4, "Simple T-shirt", null),
        Intro(R.drawable.tshirt5, "Green T-shirt", null)
    )

    val hoodies = listOf(
        Intro(R.drawable.hoodi1, "Grey Hoodie", null),
        Intro(R.drawable.hoodi2, "Black Hoodie", null),
        Intro(R.drawable.hoodi3, "Green Hoodie", null),
        Intro(R.drawable.hoodi4, "White Hoodie", null)
    )

    val sneakers = listOf(
        Intro(R.drawable.sneaker1, "Grey Sneaker", null),
        Intro(R.drawable.sneaker2, "Bicolor Sneaker", null),
        Intro(R.drawable.sneaker3, "Red Sneaker", null),
        Intro(R.drawable.sneaker4, "Black Sneaker", null),
        Intro(R.drawable.sneaker5, "Blue Sneaker", null)
    )
}