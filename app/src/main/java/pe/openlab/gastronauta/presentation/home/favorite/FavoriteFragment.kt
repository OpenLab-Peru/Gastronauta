package pe.openlab.gastronauta.presentation.home.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import pe.openlab.gastronauta.R

/**
 * FavoriteFragment
 *
 * @author Bryam Soto - bsoto.dev@gmail.com
 * @since 15/10/2020
 */
class FavoriteFragment : Fragment() {

    private lateinit var favoriteViewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        favoriteViewModel =
            ViewModelProvider(this).get(FavoriteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_favorite, container, false)
        favoriteViewModel.text.observe(viewLifecycleOwner, Observer {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        })
        return root
    }
}