load("@rules_android//android:rules.bzl", "android_binary")

android_binary(
    name = "bin",
    custom_package = "io.morfly.bfa",
    manifest = "AndroidManifest.xml",
    manifest_values = {
        "minSdkVersion": "21",
        "targetSdkVersion": "30",
    },
    srcs = ["src/io/morfly/bfa/MainActivity.java"],
    resource_files = glob(["res/**"]),
)

