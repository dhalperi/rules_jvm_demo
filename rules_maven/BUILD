java_library(
    name = "A",
    srcs = ["A.java"],
    deps = ["@guava//:compile"],
)

java_library(
    name = "B",
    srcs = ["B.java"],
    deps = [
        ":A",
        "@guava//:compile",
    ],
)

java_library(
    name = "B_no_dep",
    srcs = ["B.java"],
    deps = [
        ":A",
    ],
)
