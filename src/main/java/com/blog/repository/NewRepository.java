package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}