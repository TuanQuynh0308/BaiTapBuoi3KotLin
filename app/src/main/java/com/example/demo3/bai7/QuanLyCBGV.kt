package com.example.demo3.bai7

import java.util.Scanner

class QuanLyCBGV{
    private val listCBGV = mutableListOf<CBGV>()
    val scanner = Scanner(System.`in`)

    fun addCBGV(){
        println("Nhập thông tin cán bộ giáo viên mới:")
        print("Họ tên: ")
        val hoTen = readLine() ?: ""
        print("Tuổi: ")
        val tuoi = scanner.nextInt()
        print("Quê quán: ")
        val queQuan = readLine() ?: ""
        print("Mã số giáo viên: ")
        val maGV = readLine() ?: ""
        print("Lương cứng: ")
        val luongCung = scanner.nextDouble()
        print("Lương thưởng: ")
        val luongThuong = scanner.nextDouble()
        print("Tiền phạt: ")
        val tienPhat = scanner.nextDouble()

        val gv = CBGV(hoTen, tuoi, queQuan, maGV, luongCung, luongThuong, tienPhat)
        listCBGV.add(gv)
        println("Đã thêm cán bộ giáo viên mới.")

    }

    fun xoaCBGV(maGV:String){
        val cbgv = listCBGV.find { it.maGV == maGV }
        cbgv.let {
            listCBGV.remove(it)
            println(" Đã xóa gv $maGV ")
        }?: println("Không tìm thấy gv $maGV")
    }

    fun hienThiDanhSach(){
        println("Danh sách các cán bộ giáo viên: ")
        listCBGV.forEach{
            println("Mã số: ${it.maGV}, Họ tên: ${it.hoTen}, Tuổi: ${it.tuoi}, Quê quán: ${it.queQuan}, Lương thực lĩnh: ${it.luongThuc()}")
        }
    }
}

fun main(){
    val quanLyCBGV= QuanLyCBGV()
    val scanner = Scanner(System.`in`)

    var choose: Int

    do {
        println("----- Quản lý giáo viên -----")
        println("1. Thêm cán bộ giáo viên")
        println("2. Xoá cán bộ giáo viên")
        println("3. Hiển thị danh sách cán bộ giáo viên")
        println("4. Thoát")
        print("Nhập lựa chọn của bạn: ")

        choose = scanner.nextInt()

        when(choose){
            1-> quanLyCBGV.addCBGV()
            2->{
                print("Nhập mã số giáo viên cần xoá: ")
                val maGVXoa = readLine() ?: ""
                quanLyCBGV.xoaCBGV(maGVXoa)
            }
            3 -> {
                quanLyCBGV.hienThiDanhSach()
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