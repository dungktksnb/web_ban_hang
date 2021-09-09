package com.example.web_ban_do_dien_tu.model;

import javax.persistence.*;

@Entity

public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tenSanPham;
    private double gia;
    private String moTaSanPham;
    @ManyToOne
    private  ThuongHieu thuongHieu;
    @ManyToOne
    private Anh anh;
    @ManyToOne
    private HoaDonChiTiet hoaDonChiTiet;

    public SanPham() {
    }

    public SanPham(long id, String tenSanPham, double gia, String moTaSanPham, ThuongHieu thuongHieu, Anh anh, HoaDonChiTiet hoaDonChiTiet) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.moTaSanPham = moTaSanPham;
        this.thuongHieu = thuongHieu;
        this.anh = anh;
        this.hoaDonChiTiet = hoaDonChiTiet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public Anh getAnh() {
        return anh;
    }

    public void setAnh(Anh anh) {
        this.anh = anh;
    }

    public HoaDonChiTiet getHoaDonChiTiet() {
        return hoaDonChiTiet;
    }

    public void setHoaDonChiTiet(HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDonChiTiet = hoaDonChiTiet;
    }
}
