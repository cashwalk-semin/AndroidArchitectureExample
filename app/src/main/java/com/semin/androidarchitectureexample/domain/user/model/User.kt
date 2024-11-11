package com.semin.androidarchitectureexample.domain.user.model

/**
 * Naming Rules
 * - 일반적으로 ${domain}의 네이밍을 갖는다.
 */
data class User(
    val name: String,
    val age: Int,
    val gender: Int,
) {
    companion object {
        val default = User(
            name = "",
            age = 0,
            gender = 0
        )
    }
}
