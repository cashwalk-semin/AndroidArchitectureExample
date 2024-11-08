package com.semin.androidarchitectureexample.domain.reward.model

data class Reward(
    val name: String,
    val price: Int,
    val expiredDate: Long,
) {
    companion object {
        val default = Reward(
            name = "",
            price = 0,
            expiredDate = 0L
        )
    }
}
