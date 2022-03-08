package com.example.hw13_maktab67_part1.api

data class ApiBody(
    val body: Body,
    val pathParams: PathParams,
    val queryParams: QueryParams
)