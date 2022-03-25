class StudentPassMark(putMark:Int) {
    val mark=putMark

    fun hasPassed() : Char{
        if (mark<=40){
            return 'P'
        }else {
            return 'F'
        }
    }

}