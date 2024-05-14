package com.example.demo3

fun main() {
    val soA = 5
    val soB = 10
    println("Cách 1: tổng 2 số là: ${tinhTong(soA, soB)}")
    println("Cách 2: tổng 2 số là: ${tinhTong2(soA, soB)}")

    val chiaDoi = { SoA: Float -> SoA / 2 }
    val nhanDoi: (Int) -> Int = { it * 2 }
    println("Nhân đôi số 5: ${nhanDoi(5)}")
    println("Chia đôi số 5: ${chiaDoi(5f)}")

    //scope funcition
    val a = 5
    val nhanDoi2 = a.let {
        it * 2
    }
    println("Nhân đoi số $a = ${nhanDoi2}")

    val str = "Buổi 3 - Android Kotlin"
    println("Độ dài chuỗi $str : ${getStringLength(str)}")

    val tenSv = "Lưu Tuấn QUỳnh"
    val tenInHoa = with(tenSv){
        tenSv.toUpperCase()
    }
    println(tenInHoa)


    val xe1 = CarModel("Xe1", 5000f)
    println(xe1)
    xe1.apply {
        tenXe="Xe 1 bản mới 2024"
        giaXe = 600F
    }
    println(xe1)

}

val tinhTong2: (Int, Int) -> Int = { soA: Int, soB: Int -> (soA + soB) }




fun tinhTong(soA: Int, soB: Int): Int {
    return (soA + soB)
}

fun getStringLength (str: String?): Int?{
    return str?.run{
        if (isEmpty()) return 0
        length
    }
}