package com.ironman.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

/**
 *
 * @author wei-xiang
 * @version 1.0
 * @date 2020/9/25
 */
interface StudentDao:  JpaRepository<Student, Long>, JpaSpecificationExecutor<Student>