import java.lang.IllegalArgumentException

//sometimes aesa hota h k hm intentially exception through krte hein  as a developer
//yani user ko textbox m bol dete hein isko sahe kr k he use kro
fun main ()
{
    createUserList(5)
    createUserList(-2) //is pr exception ayege 
}

fun createUserList (count: Int)
{
    if (count<0)
    {
        // exception raise
        throw IllegalArgumentException("Count must be greater then 0 ")
    }
    else
    {
    println("User list created contaning $count users")
    }
}