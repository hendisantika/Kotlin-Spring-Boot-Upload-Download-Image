package com.hendisantika.kotlinspringbootuploaddownloadimage

import com.hendisantika.kotlinspringbootuploaddownloadimage.service.FileStorage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSpringBootUploadDownloadImageApplication {
    @Autowired
    lateinit var fileStorage: FileStorage

    @Bean
    fun run() = CommandLineRunner {
        fileStorage.deleteAll()
        fileStorage.init()
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootUploadDownloadImageApplication>(*args)
}
