package com.example.testserver.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/api/test")
    fun test() = "test3"

    @GetMapping("/api/test2")
    fun test2() = "test3"

    @GetMapping("/api/test3")
    fun test3() = "test3"

    @GetMapping("/api/test4")
    fun test4() = "test3"

    @GetMapping("/api/test5")
    fun test5() = "test3"

    @GetMapping("/api/test6")
    fun test6() = "test3"

    @GetMapping("/api/test7")
    fun test7() = "test3"

    @GetMapping("/api/test8")
    fun test8() = "test3"

    @GetMapping("/api/test9")
    fun test9() = "test3"

    @GetMapping("/api/test10")
    fun test10() = "test3"

    @GetMapping("/api/test11")
    fun test11() = "test3"

    @GetMapping("/api/test12")
    fun test12() = "test3"

    @GetMapping("/api/test13")
    fun test13() = "test3"

    @GetMapping("/api/test14")
    fun test14() = "test3"

}