package com.firstgroup.DAL.repository;

import com.firstgroup.DAL.entity.Lop;
import com.firstgroup.DAL.entity.LopId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LopRepository extends JpaRepository<Lop, LopId> {
}