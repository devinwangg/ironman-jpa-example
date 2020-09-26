package com.ironman.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import java.util.*

/**
 *
 * @author wei-xiang
 * @version 1.0
 * @date 2020/9/26
 */
interface StudentDao:  JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

    fun findByName(name: String): Student?
}