load("@rules_android//android:rules.bzl", "android_library")

package(default_visibility = ["//visibility:public"])

android_library(
    name = "my-feature",
    srcs = ["src/io/morfly/bfa/MyAndroidFeature.java"],
)

android_library(
    name = "my-feature-with-res",
    srcs = ["src/io/morfly/bfa/MyAndroidFeatureWithRes.java"],
    resource_files = ["res/values/strings.xml"],
    manifest = "AndroidManifest.xml",
    custom_package = "io.morfly.bfa",
)