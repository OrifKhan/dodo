package islom.din.dodo_ilmhona_proskills

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class FragmetSelectPizza : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {












        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmet_select_pizza, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmetSelectPizza()
    }
}