package com.example.demo3.bai7

class CBGV(
    hoTen: String,
    tuoi: Int,
    queQuan: String,
    val maGV: String,
    var luongCung: Double,
    var luongThuong: Double,
    var tienPhat: Double
): Nguoi (hoTen, tuoi, queQuan){
    fun luongThuc(): Double{
        return luongCung+luongThuong-tienPhat
    }
}