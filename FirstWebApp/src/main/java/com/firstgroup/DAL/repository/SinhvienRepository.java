package com.firstgroup.DAL.repository;

import com.firstgroup.DAL.entity.Sinhvien;
import com.firstgroup.DAL.entity.SinhvienId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhvienRepository extends JpaRepository<Sinhvien, SinhvienId> {
}