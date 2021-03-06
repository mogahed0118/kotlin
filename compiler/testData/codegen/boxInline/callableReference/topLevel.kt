// IGNORE_BACKEND: JVM_IR
// FILE: 1.kt

package test

inline fun call(p: Int, s: (Int) -> Int): Int {
    return s(p)
}

// FILE: 2.kt

import test.*

fun box() : String {
    return if (call(10, ::calc) == 5) "OK" else "fail"
}

fun calc(p: Int) : Int {
    return p / 2
}
