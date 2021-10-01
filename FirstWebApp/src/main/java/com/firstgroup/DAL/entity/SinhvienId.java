package com.firstgroup.DAL.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SinhvienId implements Serializable {
    private static final long serialVersionUID = -5521065230593344160L;
    @Column(name = "MaSV", nullable = false, length = 8)
    private String maSV;
    @Column(name = "MaLop", nullable = false, length = 8)
    private String maLop;

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSV, maLop);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SinhvienId entity = (SinhvienId) o;
        return Objects.equals(this.maSV, entity.maSV) &&
                Objects.equals(this.maLop, entity.maLop);
    }
}