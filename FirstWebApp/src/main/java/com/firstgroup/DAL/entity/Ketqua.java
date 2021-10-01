package com.firstgroup.DAL.entity;

import javax.persistence.*;

@Table(name = "ketqua", indexes = {
        @Index(name = "fk_KETQUA_SINHVIEN1_idx", columnList = "MaSV"),
        @Index(name = "fk_KETQUA_MONHOC1_idx", columnList = "MaMH")
})
@Entity
public class Ketqua {
    @EmbeddedId
    private KetquaId id;

    @Column(name = "KetQua")
    private Double ketQua;

    public Double getKetQua() {
        return ketQua;
    }

    public void setKetQua(Double ketQua) {
        this.ketQua = ketQua;
    }

    public KetquaId getId() {
        return id;
    }

    public void setId(KetquaId id) {
        this.id = id;
    }
}