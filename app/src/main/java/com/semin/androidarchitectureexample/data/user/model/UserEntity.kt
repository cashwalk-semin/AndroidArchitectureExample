package com.semin.androidarchitectureexample.data.user.model

/**
 * Naming Rules
 * - ${domain}Entity : Database 매핑 객체
 *
 * Mapper
 * - Entity, Dto의 Mapper는 각각의 하위에 포함
 * - Entity - Dto가 1:1 대응일 경우 toDto의 네이밍을 사용
 * - Entity - Dto가 1:N 대응일 경우 to${dtoName}의 네이밍을 사용
 */
data class UserEntity(
    val name: String,
    val age: Int,
    val gender: Int,
) {
    fun toGetUserDto() = GetUserDto(
        name = name,
        age = age,
        gender = gender
    )

    fun toUpdateUserDto() = UpdateUserDto(
        name = name,
        age = age,
        gender = gender
    )
}