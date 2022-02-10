class Kontakt(var name: String?, var efternamn: String?, var age: Int, var nummer: String?, var mail: String?){
    fun double(x: Int): Int {
        return 2 * x
    }
    fun print_info(){
        println(name + " " + efternamn + " " + age + "år" +" " + nummer + " " + mail )
    }
}

    fun Print_meny(){
        println("------------------------------------------------------------------------------------------------------------------------------------------------------------------")
        println("Detta är en meny till din kontakt lista. ")
        println("Tryck 1 för att få fram listan.")
        println("Tryck 2 för att få fram den översta kontakten i listan.")
        println("Tryck 3 för att lägga till kontakt")
        println("Tryck 4 för att ta bort en konakt ur listan")
        println("Tryck 5 för att ta skriva ut listan i bokstavs ordning.")
    }
    fun Inmatning_text() : Int{
            val choice = readLine()!!.toInt()
            return  choice
    }





fun main() {

    var kontakter = ArrayList<Kontakt>()
    kontakter.add(Kontakt ("Karl", "Karlsson", 21, "0789439294", "karl.karlsson@g.mail.com"))
    kontakter.add(Kontakt ("Sven", "Svensson", 27, "0784561102", "sven.svensson@g.mail.com"))
    //println(k1.name + " " + k1.efternamn + " " + k1.age + "år" +" " + k1.nummer + " " + k1.mail )

    do {
        Print_meny()
        var c = Inmatning_text()
        if (c == 1){

            for (k in kontakter){
                k.print_info()
            }

        }
        if(c == 2){
        kontakter[0].print_info()
        }

        if(c == 3){
            println("Skriv ditt förnamn")
            val name1 = readLine()
            println("Skriv ditt efternamn")
            val efternamn1 = readLine()
            println("Skriv din ålder")
            val age1 = readLine()!!.toInt()
            println("Skriv ditt telefon nummer")
            val nummer1 = readLine()
            println("Skriv in din mail")
            val mail1 = readLine()
            kontakter.add(Kontakt(name1, efternamn1, age1, nummer1, mail1))
        }

        if(c == 4){
            var i = 0
            for (k in kontakter){
                i = i + 1
                println(i)
                k.print_info()

            }
            println("Skriv vilken kontakt du vill ta bort.")


            kontakter.removeAt(readLine()!!.toInt() - 1)

        }

        if(c==5){

            var sortedList = kontakter.sortedWith(compareBy({it.name}))

            for(kontakt in kontakter){
                println(kontakt.name)
            }


        }



    }while (c < 8)

}