package kotlincourse.lesson6

fun main () {
}

fun checkPassword (password : String) : Boolean {
    if (password.length <= 8 ) return false
        // if (checkSymbols(password)) return true
        //return false
    return checkSymbols(password)
}

fun checkSymbols (password : String) : Boolean {
    return false
}


fun converMark(mark : Int) : String {
    //val result = when(mark) {
    return when(mark) {
        in 0..20 -> "f"
        in 21..40 -> "e"
        in 41..60 -> "d"
        in 61..80 -> "c"
        in 81..90 -> "b"
        in 91..100 -> "a"
        else -> "invalid mark"
    }
    //return result
}