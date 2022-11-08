include(":app")

rootProject.name = "NottApp"

plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}
include(":common")
include(":domain")
include(":presentation")
