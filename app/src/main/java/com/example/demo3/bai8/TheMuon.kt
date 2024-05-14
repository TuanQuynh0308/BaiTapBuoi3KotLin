package com.example.demo3.bai8

import java.time.LocalDate

class TheMuon(

    val maPM: String,
    val ngayMuon: String,
    val hanTra: String,
    val soHieuSach: Int,
    val sinhVien: SinhVien
) {
    override fun toString(): String {
        return "TheMuon(maPM='$maPM', ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach=$soHieuSach, Sinh viên: ${sinhVien.hoTen}, Tuổi: ${sinhVien.tuoi},Lớp: ${sinhVien.hoTen})"
    }
}