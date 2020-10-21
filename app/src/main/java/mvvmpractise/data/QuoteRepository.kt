package mvvmpractise.data

class QuoteRepository private constructor(private val quoteDao : FakeQuoteDao) {
// Work done: Mediator between database and viewModels.

    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    // Singleton pattern in Kotlin
    companion object{
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDao).also{ instance = it}
            }
    }
}