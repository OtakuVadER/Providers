import com.flixclusive.model.provider.Language
import com.flixclusive.model.provider.ProviderType
import com.flixclusive.model.provider.Status

dependencies {
    implementation("androidx.core:core:1.15.0")

    // Comment if not implementing own SettingsScreen
    // No need to specify the compose version explicitly
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.runtime:runtime")
    // ================= END: COMPOSE UI =================
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
}

flxProvider {
    description =
        """
        NOTICE: This provider uses WebView to scrape content. This might lag.
        
        Stream seamlessly in adjustable HD resolution (1080p) with blazing-fast loading speeds. Offers HLS media.
        """.trimIndent()

    changelog =
        """
        # v1.0.3 - patch2
        - update compose BOM to 2024.09.02
        """.trimIndent()

    versionMajor = 1
    versionMinor = 0
    versionPatch = 3
    versionBuild = 2

    iconUrl = "https://i.imgur.com/LNtqPTi.png"

    language = Language.Multiple

    providerType = ProviderType.All

    status = Status.Down
}
