java_library(
    name = "A",
    srcs = ["A.java"],
    deps = ["@maven//:com_google_guava_guava"],
)

java_library(
    name = "B",
    srcs = ["B.java"],
    deps = [
        ":A",
        "@maven//:com_google_guava_guava",
    ],
)

java_library(
    name = "B_no_dep",
    srcs = ["B.java"],
    deps = [
        ":A",
    ],
)
