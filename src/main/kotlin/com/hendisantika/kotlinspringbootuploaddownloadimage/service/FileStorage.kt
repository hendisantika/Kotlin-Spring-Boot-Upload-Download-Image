package com.hendisantika.kotlinspringbootuploaddownloadimage.service

import org.springframework.core.io.Resource
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Path
import java.util.stream.Stream

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-upload-download-image
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-11-26
 * Time: 03:57
 * To change this template use File | Settings | File Templates.
 */
interface FileStorage {
    fun store(file: MultipartFile)
    fun loadFile(filename: String): Resource
    fun deleteAll()
    fun init()
    fun loadFiles(): Stream<Path>
}