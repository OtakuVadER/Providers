package com.abrogani.sudoflix.api.vidsrcto.dto

internal data class SourcesListResponse(
    val status: Int,
    val result: List<Map<String, String>>
)