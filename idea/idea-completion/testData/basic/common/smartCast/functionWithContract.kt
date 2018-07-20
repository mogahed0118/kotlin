// LANGUAGE_VERSION: 1.3

interface Foo {
    val x: Int

    fun f()
}

fun test(x: Any?) {
    require(x is Foo)
    x.<caret>
}

// EXIST: x
// EXIST: f
