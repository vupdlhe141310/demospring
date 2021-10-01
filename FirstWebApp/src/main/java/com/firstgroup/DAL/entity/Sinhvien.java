package com.firstgroup.DAL.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sinhvien", indexes = {
        @Index(name = "fk_SINHVIEN_LOP1_idx", columnList = "MaLop")
})
@Entity
public class Sinhvien {
    @EmbeddedId
    private SinhvienId id;

    @Column(name = "HoDem", nullable = false, length = 30)
    private String hoDem;

    @Column(name = "Ten", nullable = false, length = 15)
    private String ten;

    @Column(name = "NgaySinh", nullable = false)
    private Date ngaySinh;

    @Column(name = "GioiTinh", length = 3)
    private String gioiTinh;

    @Column(name = "Tinh", length = 30)
    private String tinh;

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public SinhvienId getId() {
        return id;
    }

    public void setId(SinhvienId id) {
        this.id = id;
    }
}