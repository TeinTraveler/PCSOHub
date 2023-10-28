package com.android.pcsohub.presentation.lotto_list

import com.android.pcsohub.domain.model.GroupedLotto

data class LottoListState(
    val isLoading: Boolean = false, val categories: List<GroupedLotto> = emptyList()
)