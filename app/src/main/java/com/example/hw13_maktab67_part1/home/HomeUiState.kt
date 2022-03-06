package com.example.hw13_maktab67_part1.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part1.delet.Movie

class HomeUiState : ViewModel() {

    var movieA = Movie(
        "The Pianist",
        false,
        "https://static.namava.ir/Content/Upload/Images/5fe6215e-3fe1-442d-a311-8c5f7b1c261f.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/5fe6215e-3fe1-442d-a311-8c5f7b1c261f.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieB = Movie(
        "The Godfather",
        false,
        "https://static.namava.ir/Content/Upload/Images/97f64b62-2006-4c43-85b8-37e969b0ad24.JPG?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/97f64b62-2006-4c43-85b8-37e969b0ad24.JPG?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieC = Movie(
        "Whiplash",
        false,
        "https://static.namava.ir/Content/Upload/Images/610d1927-d141-4056-9738-4f769788331b.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/610d1927-d141-4056-9738-4f769788331b.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieD = Movie(
        "The Dark Knight",
        false,
        "https://static.namava.ir/Content/Upload/Images/9202a96a-4274-4300-ba0a-a0b9f956846e.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/9202a96a-4274-4300-ba0a-a0b9f956846e.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieE = Movie(
        "12 Angry Men",
        false,
        "https://static.namava.ir/Content/Upload/Images/d6f888ab-22a0-493e-b858-58fe1efd4b74.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/d6f888ab-22a0-493e-b858-58fe1efd4b74.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieF = Movie(
        "Schindler's List",
        false,
        "https://static.namava.ir/Content/Upload/Images/2927a397-6fe6-45cf-9c2d-66296fa2037b.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/2927a397-6fe6-45cf-9c2d-66296fa2037b.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieG = Movie(
        "Pulp Fiction",
        false,
        "https://static.namava.ir/Content/Upload/Images/08b879a6-5601-42cd-b267-651b0494dbbf.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/08b879a6-5601-42cd-b267-651b0494dbbf.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieH = Movie(
        "Gladiator",
        false,
        "https://static.namava.ir/Content/Upload/Images/d31f71a9-6d6a-45b9-b8db-8c2a26d4933a.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieI = Movie(
        "Fight Club",
        false,
        "https://static.namava.ir/Content/Upload/Images/139d1779-adc3-43c6-9ac7-822673fd3e2a.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieJ = Movie(
        "Forrest Gump",
        false,
        "https://static.namava.ir/Content/Upload/Images/8ed1cbe9-aee5-435b-ad3a-4f0aaa495dc8.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieK = Movie(
        "Inception",
        false,
        "https://static.namava.ir/Content/Upload/Images/3a5f7bd5-10d4-4edf-a849-d987d7562a2b.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/3a5f7bd5-10d4-4edf-a849-d987d7562a2b.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieL = Movie(
        "The Matrix",
        false,
        "https://static.namava.ir/Content/Upload/Images/301d44a5-b46e-410e-ba32-104624bb2923.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/301d44a5-b46e-410e-ba32-104624bb2923.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x"
    )
    val movieM = Movie(
        "Goodfellas",
        false,
        "https://static.namava.ir/Content/Upload/Images/0f014102-5363-488a-8308-23cf0223f066.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieN = Movie(
        "WALL·E",
        false,
        "https://static.namava.ir/Content/Upload/Images/40bf4d6b-b6f3-49f7-a361-8ea5dffb7e91.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieO = Movie(
        "The Prestige",
        false,
        "https://static.namava.ir/Content/Upload/Images/e267309f-c5b8-470e-8f30-18e7f6152711.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieP = Movie(
        "Joker",
        false,
        "https://static.namava.ir/Content/Upload/Images/348e0038-d0d6-4466-a775-b6383fd0294a.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieQ = Movie(
        "Memento",
        false,
        "https://static.namava.ir/Content/Upload/Images/7ba67313-5577-4b2f-9be1-51159f03a816.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieR = Movie(
        "Interstellar",
        false,
        "https://static.namava.ir/Content/Upload/Images/ef3e0221-c0e1-4581-ac48-d033c1182086.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieS = Movie(
        "Spirited Away",
        false,
        "https://static.namava.ir/Content/Upload/Images/d3afad0e-66a6-4f6a-a515-683246ff30b5.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieT = Movie(
        "Braveheart",
        false,
        "https://static.namava.ir/Content/Upload/Images/ea7c8294-2a34-4a67-bbc8-db2f74287f98.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )
    val movieU = Movie(
        "Parasite",
        false,
        "https://static.namava.ir/Content/Upload/Images/40100765-12d4-4f85-ad59-d0819c6b172f.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294"
    )

    val movieList = mutableListOf(
        movieA,
        movieB,
        movieC,
        movieD,
        movieE,
        movieF,
        movieG,
        movieH,
        movieI,
        movieJ,
        movieK,
        movieL,
        movieM,
        movieN,
        movieO,
        movieP,
        movieQ,
        movieR,
        movieS,
        movieT,
        movieU
    )

}