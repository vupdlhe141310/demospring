package com.firstgroup.DAL.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LopId implements Serializable {
    private static final long serialVersionUID = 5559476990859561378L;
    @Column(name = "MaLop", nullable = false, length = 8)
    private String maLop;
    @Column(name = "MaKhoa", nullable = false, length = 8)
    private String maKhoa;

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maLop, maKhoa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LopId entity = (LopId) o;
        return Objects.equals(this.maLop, entity.maLop) &&
                Objects.equals(this.maKhoa, entity.maKhoa);
    }
}