// tag::build-scan-plugin-plugins-apply[]
plugins {
    id("com.gradle.enterprise") version "3.1.1" // <1>
}
// end::build-scan-plugin-plugins-apply[]

// tag::build-scan-dsl[]
gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
// end::build-scan-dsl[]