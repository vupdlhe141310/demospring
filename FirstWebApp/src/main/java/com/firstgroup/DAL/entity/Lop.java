package com.firstgroup.DAL.entity;

import javax.persistence.*;

@Table(name = "lop", indexes = {
        @Index(name = "fk_LOP_KHOA1_idx", columnList = "MaKhoa")
})
@Entity
public class Lop {
    @EmbeddedId
    private LopId id;

    @Column(name = "TenLop", nullable = false, length = 30)
    private String tenLop;

    @Column(name = "SiSo")
    private Integer siSo;

    public Integer getSiSo() {
        return siSo;
    }

    public void setSiSo(Integer siSo) {
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public LopId getId() {
        return id;
    }

    public void setId(LopId id) {
        this.id = id;
    }
}