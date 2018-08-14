package pro.savichev.planetexpress.logbook.ui.animals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.AnimalFragmentBinding

class AnimalFragment: Fragment() {

    companion object {

        private const val ARG_ANIMAL = "animal_AnimalFragment"

        fun newInstance(animal: Animal): AnimalFragment {
            val args = Bundle()
            args.putParcelable(ARG_ANIMAL, animal)
            val animalFragment = AnimalFragment()
            animalFragment.arguments = args
            return animalFragment
        }
    }

    lateinit var binding: AnimalFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.animal_fragment, container, false)
        binding.animal = arguments?.getParcelable(ARG_ANIMAL) as Animal
        return binding.root
    }

}