package com.semin.androidarchitectureexample.data.reward.model

/**
 * Naming Rules
 * - ${Http_method}${api_path}Dto : Network 응답 객체
 * - 하위 항목이 객체일 경우 "Dto" 접미사를 붙힘
 *
 * Mapper
 * - Entity, Dto의 Mapper는 각각의 하위에 포함
 */
data class GetRewardsDto(
    val list: List<RewardDto>?,
)

data class RewardDto(
    val name: String?,
    val price: Int?,
    val expiredDate: Long?,
) {
    fun toEntity(): RewardEntity = RewardEntity(
        name = name ?: "",
        price = price ?: 0,
        expiredDate = expiredDate ?: 0L
    )
}