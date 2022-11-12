rootProject.name = "NottApp"

plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

include(":app")
include(":common")
include(":domain")
include(":presentation")
include(":data-mock")
include(":data")
