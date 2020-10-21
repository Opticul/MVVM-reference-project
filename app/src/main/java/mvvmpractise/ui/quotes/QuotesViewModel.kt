package mvvmpractise.ui.quotes

import androidx.lifecycle.ViewModel
import mvvmpractise.data.Quote
import mvvmpractise.data.QuoteRepository

class QuotesViewModel(private val quoteRepository : QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote : Quote) = quoteRepository.addQuote(quote)
}