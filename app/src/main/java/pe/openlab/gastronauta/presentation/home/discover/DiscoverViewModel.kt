package pe.openlab.gastronauta.presentation.home.discover

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * DiscoverViewModel
 *
 * @author Bryam Soto - bsoto.dev@gmail.com
 * @since 15/10/2020
 */
class DiscoverViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Implement discover feature"
    }
    val text: LiveData<String> = _text
}