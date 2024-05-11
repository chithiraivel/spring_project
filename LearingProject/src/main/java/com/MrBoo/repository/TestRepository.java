package com.MrBoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MrBoo.TestModel.TestModels;


@Repository
public interface TestRepository extends JpaRepository<TestModels, Integer> {

}

