package helpTheBookSeller

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        var rez = ""

        if (!lstOfArt.isEmpty() && !lstOfCat.isEmpty())
            for (cat in lstOfCat){
                var summ = 0
                for (art in lstOfArt)
                    summ += chekArtInCat(art, cat)
                if (rez != "") rez = rez + " - "
                rez = "$rez($cat : $summ)"
            }
        return rez
    }

    fun chekArtInCat(art: String, cat: String): Int {
        if (art[0] == cat[0])
            return getNumFromCatalog(art)

        return 0
    }

    fun getNumFromCatalog(art: String):Int{
        return art.substringAfter(' ').toInt()
    }
}