package com.firstgroup;

import com.firstgroup.DAL.entity.Sinhvien;
import com.firstgroup.DAL.entity.SinhvienId;
import com.firstgroup.DAL.repository.SinhvienRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Date;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class StudentRepo {
    @Autowired private SinhvienRepository repo;

    @Test
    public void testAddStudent(){
        Sinhvien s = new Sinhvien();
        SinhvienId id = new SinhvienId();
        id.setMaSV("HE01010");
        id.setMaLop("L01");
        s.setId(id);
        s.setHoDem("Nguyen");
        s.setTen("A");
        s.setGioiTinh("Nam");
        s.setNgaySinh(new Date());
        s.setTinh("Ha Noi");

        Sinhvien saveS = repo.save(s);
        Assertions.assertEquals(s,saveS);
    }



}
