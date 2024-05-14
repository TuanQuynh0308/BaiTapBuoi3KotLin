package com.example.demo3.bai8

import com.example.demo3.bai7.CBGV
import com.example.demo3.bai7.QuanLyCBGV
import java.time.LocalDate
import java.util.Scanner

class QuanLyTheMuon{
    private val listTheMuon = mutableListOf<TheMuon>()
    val scanner = Scanner(System.`in`)

    fun addTheMuon(){
        println("Nhập thông tin thẻ mượn sách:")
        print("Mã phiếu mượn: ")
        val maPhieu = readLine()?: ""
        print("Ngày mượn (yyyy-MM-dd): ")
        val ngayMuon = readLine()?: ""
        print("Hạn trả (yyyy-MM-dd): ")
        val hanTra = readLine()?: ""
        print("Số hiệu sách: ")
        val soHieuSach = scanner.nextInt()
        print("Họ tên sinh viên: ")
        val hoTen = readLine()?: ""
        print("Tuổi: ")
        val tuoi = scanner.nextInt()
        print("Lớp: ")
        val lop = readLine()?: ""

        val sinhVien = SinhVien(hoTen, tuoi, lop)
        val theMuon = TheMuon(maPhieu, ngayMuon, hanTra, soHieuSach, sinhVien)
        listTheMuon.add(theMuon)
        println("Thêm thẻ mượn thành công!")

    }

    fun xoaTheMuon(maPM:String){
        val cbgv = listTheMuon.find { it.maPM == maPM }
        cbgv.let {
            listTheMuon.remove(it)
            println(" Đã xóa gv $maPM ")
        }?: println("Không tìm thấy gv $maPM")
    }

    fun hienThiDanhSachTheMuon() {
        if (listTheMuon.isEmpty()) {
            println("Danh sách thẻ mượn đang trống")
        } else {
            println("Danh sách các thẻ mượn:")
            listTheMuon.forEach { println(it) }
        }
    }
}
fun main(){
    val quanlyTheMuon= QuanLyTheMuon()
    val scanner = Scanner(System.`in`)

    var choose: Int

    do {
        println("===== Quản Lý Thư Viện =====")
        println("1. Thêm thẻ mượn sách")
        println("2. Xoá thẻ mượn sách")
        println("3. Hiển thị danh sách thẻ mượn sách")
        println("0. Thoát chương trình")
        print("Nhập lựa chọn của bạn: ")

        choose = scanner.nextInt()

        when(choose){
            1-> quanlyTheMuon.addTheMuon()
            2->{
                print("Nhập mã phiếu mượn cần xoá: ")
                val maPM2 = readLine() ?: ""
                quanlyTheMuon.xoaTheMuon(maPM2)
            }
            3 -> {
                quanlyTheMuon.hienThiDanhSachTheMuon()
            }
            4 -> {
                println("Đã thoát chương trình.")
            }
            else -> {
                println("Vui lòng chọn lại.")
            }
        }
        println("....")
    }while (choose!=4)
    scanner.close()

}