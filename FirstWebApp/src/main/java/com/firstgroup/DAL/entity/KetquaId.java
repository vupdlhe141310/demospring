package com.firstgroup.DAL.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KetquaId implements Serializable {
    private static final long serialVersionUID = -1436256323842555877L;
    @Column(name = "MaSV", nullable = false, length = 8)
    private String maSV;
    @Column(name = "MaMH", nullable = false, length = 8)
    private String maMH;

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSV, maMH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KetquaId entity = (KetquaId) o;
        return Objects.equals(this.maSV, entity.maSV) &&
                Objects.equals(this.maMH, entity.maMH);
    }
}