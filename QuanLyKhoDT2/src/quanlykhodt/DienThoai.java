/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhodt;

import java.util.Date;

/**
 * @author kax20
 */
public class DienThoai {
    public DienThoai() {
    }

    String maDT, tenDT, HDH, mauDT;
    int soLuong;
    Date ngaynhap;

    public DienThoai(String maDT, String tenDT, String HDH, String mauDT, int soLuong) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.HDH = HDH;
        this.mauDT = mauDT;
        this.soLuong = soLuong;
    }

    public DienThoai(String maDT, String tenDT, String HDH, String mauDT, int soLuong, Date ngaynhap) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.HDH = HDH;
        this.mauDT = mauDT;
        this.soLuong = soLuong;
        this.ngaynhap = ngaynhap;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getHDH() {
        return HDH;
    }

    public void setHDH(String HDH) {
        this.HDH = HDH;
    }

    public String getMauDT() {
        return mauDT;
    }

    public void setMauDT(String mauDT) {
        this.mauDT = mauDT;
    }
}
