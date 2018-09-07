package org.mk.lanparty.repository

import org.mk.lanparty.domain.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface TagRepository : JpaRepository<Tag, Long>, CrudRepository<Tag, Long>