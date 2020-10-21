package mvvmpractise.data

class FakeDatabase private constructor() {
    //Replace this with Room or another database

    var quoteDao = FakeQuoteDao()
    private set

    // Singleton pattern in Kotlin
    companion object{
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also{ instance = it}
            }
    }
}