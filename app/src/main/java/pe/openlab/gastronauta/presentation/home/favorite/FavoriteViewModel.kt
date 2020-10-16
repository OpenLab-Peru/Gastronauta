package pe.openlab.gastronauta.presentation.home.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * FavoriteViewModel
 *
 * @author Bryam Soto - bsoto.dev@gmail.com
 * @since 15/10/2020
 */
class FavoriteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Implement favorite feature"
    }
    val text: LiveData<String> = _text
}