plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // 修改 Compose 插件声明
    kotlin("jvm") version "1.5.10"
    id("org.jetbrains.compose") version "1.5.10" apply false

}

// 移除 buildscript 和 allprojects 中的重复仓库配置
// 这些配置已被 settings.gradle.kts 中的 dependencyResolutionManagement 覆盖