load("@rules_android//android:rules.bzl", "android_library")
load("@rules_java//java:defs.bzl", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "my-feature",
    srcs = ["src/io/morfly/bfa/MyFeature.java"],
)

android_library(
    name = "my-feature-with-res",
    srcs = ["src/io/morfly/bfa/MyFeatureWithRes.java"],
    resource_files = ["res/values/strings.xml"],
    manifest = "AndroidManifest.xml",
    custom_package = "io.morfly.bfa",
)