package com.abrogani.superstream

import android.content.Context
import androidx.compose.runtime.Composable
import com.flixclusive.provider.FlixclusiveProvider
import com.flixclusive.provider.Provider
import com.flixclusive.provider.ProviderApi
import com.abrogani.superstream.api.SuperStreamApi
import com.abrogani.superstream.settings.GetTokenScreen
import okhttp3.OkHttpClient

@FlixclusiveProvider
class SuperStream : Provider() {
    @Composable
    override fun SettingsScreen() {
        GetTokenScreen(settings = settings)
    }

    override fun getApi(
        context: Context,
        client: OkHttpClient
    ): ProviderApi {
        return SuperStreamApi(
            client = client,
            provider = this,
            resources = resources!!,
            settings = settings
        )
    }
}
