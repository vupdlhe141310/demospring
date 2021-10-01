package com.firstgroup.DAL.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "monhoc")
@Entity
public class Monhoc {
    @Id
    @Column(name = "MaMH", nullable = false, length = 8)
    private String id;

    @Column(name = "TenMH", nullable = false, length = 30)
    private String tenMH;

    @Column(name = "SoTC", nullable = false)
    private Integer soTC;

    @Column(name = "DieuKien", length = 50)
    private String dieuKien;

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    public Integer getSoTC() {
        return soTC;
    }

    public void setSoTC(Integer soTC) {
        this.soTC = soTC;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}