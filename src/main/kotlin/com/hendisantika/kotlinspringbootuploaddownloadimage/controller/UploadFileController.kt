package com.hendisantika.kotlinspringbootuploaddownloadimage.controller

import com.hendisantika.kotlinspringbootuploaddownloadimage.service.FileStorage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-upload-download-image
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-11-26
 * Time: 03:59
 * To change this template use File | Settings | File Templates.
 */
@Controller
class UploadFileController {

    @Autowired
    lateinit var fileStorage: FileStorage

    @GetMapping("/")
    fun index(): String {
        return "multipartfile/uploadform.html"
    }

    @PostMapping("/")
    fun uploadMultipartFile(@RequestParam("uploadfile") file: MultipartFile, model: Model): String {
        fileStorage.store(file)
        model.addAttribute("message", "File uploaded successfully! -> filename = " + file.originalFilename)
        return "multipartfile/uploadform.html"
    }
}