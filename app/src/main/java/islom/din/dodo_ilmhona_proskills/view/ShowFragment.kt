package islom.din.dodo_ilmhona_proskills.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import islom.din.dodo_ilmhona_proskills.R
import islom.din.dodo_ilmhona_proskills.databinding.ViewShowFragmentBinding
import islom.din.dodo_ilmhona_proskills.model.Sous

class ShowFragment:Fragment() {
    private var fragmentFirstBinding: ViewShowFragmentBinding? = null
    lateinit var recyclerView: RecyclerView
    lateinit var listSousAdapter: ListSousAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.view_show_fragment,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = view.let { ViewShowFragmentBinding.bind(it) }
        fragmentFirstBinding = binding
    recyclerView=binding.recSous
        listSousAdapter = ListSousAdapter()
        recyclerView.adapter =listSousAdapter
        recyclerView.layoutManager =  StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)
       val list = listOf<Sous>(Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),Sous(1,R.drawable.chedderpng,"sousoso",25),)
        listSousAdapter.submitList(list)

    }

    companion object{
        fun newIntent() = ShowFragment()
    }
}