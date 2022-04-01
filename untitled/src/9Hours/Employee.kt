package `9Hours`

class Employee private constructor(val EmpName: String,
                                   val EmpID: Long) {

    val empname=EmpName
    val empid=EmpID

    init {

        println("Emp Name:$empname")
        println("Emp ID:$empid")
    }
    companion object{
        val emplist= mutableListOf<Employee>()
        fun createEmpDetail(EmpName: String,EmpID: Long):Employee{
            println("Emp Details Created")
            return Employee(EmpName,EmpID)
        }

        fun Created(count:Int):List<Employee>{
            for (i in 0..count){
                emplist.add(Employee("EMP $i",21))
            }
            return emplist
        }
    }
}