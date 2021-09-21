import java.lang.Exception

//Exception Handling
//some exception are handle but some exception are not handle
//for example: hm n database s connection bnaya, yani database connection problem
//to user ko hm n aik message bhejwa diya, there is a eror we can solve problem
// kbh kbh connection ban jata h kbh nh , m application crash nh krna chahta
//  aik textbox h jis m user n INTEGER ki jaga String lkh diya agr m n sahe s handle nh kiya hoga to application crash b ho skti h
//aese error jinhen hm handle kr lein wo exception handling kehlata hai
//aese error jinhen hm handle nh kr skte jese JVM m eror a jaye
// Exception Hnadling : TRY CATCH or FINAL use kr skte hien
//hm mukhtalif catch block b define kr skte hein
//code m multiple type of exception a skti hein to hm un k lye alg alg catch block lagayengay
fun main ()
{
    var arr = arrayOf(1,2,3)  // m n array m 3 value daalein

  /*
    println(arr[5])   //or m print krwana chah rha uski 5th value, to possible h k error ayega
    println("This program will not run")
    //scene y h k agr upr error a jayega to neeche program run nh hoga

    */

    try {   //try block kbh akela nh ayega ya to catch k sth ya phr final k sth ayega
        println(arr[5])  //agr array null huwa to nullpoint exception ayege to us k lye b catch block lagana hoga
    }
    catch (ex: NullPointerException)
    {

    }
    catch (e: Exception)  //agr koi exception a jayege to catch m chali jayege
    {                      //catch wale m hm wo lkhte hein jo hamein user ko dikhana ho
        println("Please Check the array index ")        // y exception hamari sb s akhir m ayege q k y base class hai
    }
    finally     //agr exception handle try or catch m ho na finally wala zarur chalega
    {
    println("I will execute no matter what")
    }


    println("This program will not run")

}
