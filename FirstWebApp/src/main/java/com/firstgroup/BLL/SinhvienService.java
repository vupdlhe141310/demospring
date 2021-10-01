package com.firstgroup.BLL;

import com.firstgroup.DAL.entity.Sinhvien;
import com.firstgroup.DAL.repository.SinhvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhvienService {
    @Autowired
    public  SinhvienRepository repo;



    public List<Sinhvien> listAll(){
        return repo.findAll();
    }
}
