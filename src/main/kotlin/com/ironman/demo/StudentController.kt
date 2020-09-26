package com.ironman.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.*
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.util.ArrayList

/**
 *
 * @author wei-xiang
 * @version 1.0
 * @date 2020/9/25
 */
@RestController
@RequestMapping("/api")
class StudentController(@Autowired val studentDao: StudentDao) {
    /**
     * 取得 Student 所有資料
     */
    @GetMapping("/students")
    fun getStudentData(): MutableList<Student> {
        return studentDao.findAll()
    }

    /**
     * 新增 Student 資料
     */
    @PostMapping("/students")
    fun addStudentData(@RequestBody student: Student): Student {
        return studentDao.save(student)
    }

    /**
     * 利用姓名查詢學生資料
     */
    @PostMapping("/students/search")
    fun getStudentByName(@RequestParam name: String): Student? {
        return studentDao.findByName(name)
    }
}