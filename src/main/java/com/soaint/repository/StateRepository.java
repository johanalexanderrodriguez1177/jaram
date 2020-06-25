package com.soaint.repository;

import com.soaint.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Long> {
}
