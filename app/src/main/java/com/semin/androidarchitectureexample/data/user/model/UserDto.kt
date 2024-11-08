package com.semin.androidarchitectureexample.data.user.model

/**
 * Naming Rules
 * - ${Http_method}${api_path}Dto : Network 응답 객체
 * - 하위 항목이 객체일 경우 "Dto" 접미사를 붙힘
 *
 * Mapper
 * - Entity, Dto의 Mapper는 각각의 하위에 포함
 */
data class GetUserDto(
    val name: String?,
    val age: Int?,
    val gender: Int?,
) {
    fun toEntity() = UserEntity(
        name = name ?: "",
        age = age ?: 0,
        gender = gender ?: 0
    )
}

data class UpdateUserDto(
    val name: String?,
    val age: Int?,
    val gender: Int?,
) {
    fun toEntity() = UserEntity(
        name = name ?: "",
        age = age ?: 0,
        gender = gender ?: 0
    )
}