package mvvmpractise.utilities

import mvvmpractise.data.FakeDatabase
import mvvmpractise.data.QuoteRepository
import mvvmpractise.ui.quotes.QuotesViewModelFactory
// Work done here: Create the dependencies. If you ever need to change to mock data or something, do it here.

//Nothing is passed to it, so it does not need the java syntax to be a singleton like the others do.

object InjectorUtils {

    fun provideQuotesViewModelFactory() : QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}