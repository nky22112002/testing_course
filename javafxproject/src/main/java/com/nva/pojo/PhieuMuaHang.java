/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nva.pojo;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class PhieuMuaHang {
    private String maPhieuMuaHang;
    private int soLuongMatHang = 0;
    private int donGiaMatHang = 0;
    private String maNguyenLieu;
    private Date ngayNhapPhieu;
    private int thanhTien;
    public PhieuMuaHang() {}

    public PhieuMuaHang(String maPhieuMuaHang, int soLuongMatHang, int donGiaMatHang, String maNguyenLieu, Date ngayNhapPhieu, int thanhTien){
        this.maPhieuMuaHang = maPhieuMuaHang;
        this.soLuongMatHang = soLuongMatHang;
        this.donGiaMatHang = donGiaMatHang;
        this.maNguyenLieu = maNguyenLieu;
        this.ngayNhapPhieu = ngayNhapPhieu;
        this.thanhTien = thanhTien;
    }
    public String getMaPhieuMuaHang() {
        return maPhieuMuaHang;
    }

    public void setMaPhieuMuaHang(String maPhieuMuaHang) {
        this.maPhieuMuaHang = maPhieuMuaHang;
    }

    public int getSoLuongMatHang() {
        return soLuongMatHang;
    }

    public void setSoLuongMatHang(int soLuongMatHang) {
        this.soLuongMatHang = soLuongMatHang;
    }

    public int getDonGiaMatHang() {
        return donGiaMatHang;
    }

    public void setDonGiaMatHang(int donGiaMatHang) {
        this.donGiaMatHang = donGiaMatHang;
    }

    public String getMaNguyenLieu() {
        return maNguyenLieu;
    }

    public void setMaNguyenLieu(String maNguyenLieu) {
        this.maNguyenLieu = maNguyenLieu;
    }
    

    public Date getNgayNhapPhieu() {
        return ngayNhapPhieu;
    }

    public void setNgayNhapPhieu(Date ngayNhapPhieu) {
        this.ngayNhapPhieu = ngayNhapPhieu;
    }

    public int getThanhTien() {
        return thanhTien;
    }
}
