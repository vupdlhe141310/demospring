package com.firstgroup.DAL.entity;

import javax.persistence.*;

@Table(name = "khoa", indexes = {
        @Index(name = "SDT_UNIQUE", columnList = "SDT", unique = true)
})
@Entity
public class Khoa {
    @Id
    @Column(name = "MaKhoa", nullable = false, length = 8)
    private String id;

    @Column(name = "TenKhoa", nullable = false, length = 50)
    private String tenKhoa;

    @Column(name = "DiaDiem", nullable = false, length = 100)
    private String diaDiem;

    @Column(name = "SDT", length = 11)
    private String sdt;

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}