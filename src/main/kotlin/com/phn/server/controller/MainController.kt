package com.phn.server.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * packageName : com.phn.server.controller
 * fileName    : MainController
 * author      : ckr
 * date        : 2023/03/12
 * description :
 */
@RestController
class MainController {

    @GetMapping("/")
    fun index(): ResponseEntity<String> {
        val returnMsg = "Hello World!"
        return ResponseEntity.ok(returnMsg)
    }
}