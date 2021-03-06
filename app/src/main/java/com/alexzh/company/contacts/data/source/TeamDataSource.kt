package com.alexzh.company.contacts.data.source

import com.alexzh.company.contacts.data.Team
import kotlinx.coroutines.flow.Flow

interface TeamDataSource {

    suspend fun fetchTeams(): Flow<List<Team>>

    suspend fun saveTeams(teams: List<Team>)
}