/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhodt;

import java.util.Date;

/**
 *
 * @author kax20
 */
public class Phieu {
    String maPhieu, maDT, tenDT, HDH, mauDT;
    int soluong;
    Date ngay;
    public Phieu() {
    }

    public Phieu(String maDT, String tenDT, String HDH, String mauDT, int soluong, Date ngay) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.HDH = HDH;
        this.mauDT = mauDT;
        this.soluong = soluong;
        this.ngay = ngay;
    }

    public Phieu(String maPhieu, String maDT, String tenDT, String HDH, String mauDT, int soluong) {
        this.maPhieu = maPhieu;
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.HDH = HDH;
        this.mauDT = mauDT;
        this.soluong = soluong;
    }

    public Phieu(String maPhieu, String maDT, String tenDT, String HDH, String mauDT, int soluong, Date ngay) {
        this.maPhieu = maPhieu;
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.HDH = HDH;
        this.mauDT = mauDT;
        this.soluong = soluong;
        this.ngay = ngay;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
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

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}