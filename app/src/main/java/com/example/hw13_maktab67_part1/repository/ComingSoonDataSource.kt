package com.example.hw13_maktab67_part1.repository

object ComingSoonDataSource {

    private val comingSoonOne = ComingSoonMovie(
        "Up",
        "https://static.namava.ir/Content/Upload/Images/db3ca0ae-69c8-4dbf-8717-08a5a79bf3d8.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    private val comingSoonTwo = ComingSoonMovie(
        "The Wolf of Wall Street",
        "https://static.namava.ir/Content/Upload/Images/3087048f-d013-4d13-aeff-87ff5180c893.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    private val comingSoonThree = ComingSoonMovie(
        "The Last of Us",
        "https://static.namava.ir/Content/Upload/Images/db9ea1c8-ab6f-4d24-a943-a0d7050a6769.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )

    val comingSoonMovie = listOf(
        comingSoonOne,
        comingSoonTwo,
        comingSoonThree
    )

}