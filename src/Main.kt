enum class Student{
    Arpita,
    L08,
    Apr_20_2002,
    CSE_4th_Year,

}

fun main(){
    val  rollNo = Student.L08
    val nameOfStudent = Student.Arpita
    val dob = Student.Apr_20_2002
    val std = Student.CSE_4th_Year

    println("Student Info :  $nameOfStudent,  $std, $rollNo, $dob")
}