package pro.savichev.planetexpress.logbook.ui.planets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.PlanetFragmentBinding

class PlanetFragment: Fragment() {

    companion object {

        private const val ARG_PLANET = "planet_PlanetFragment"

        fun newInstance(planet: Planet): PlanetFragment {
            val args = Bundle()
            args.putParcelable(ARG_PLANET, planet)
            val planetFragment = PlanetFragment()
            planetFragment.arguments = args
            return planetFragment
        }
    }

    lateinit var binding: PlanetFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.planet_fragment, container, false)
        binding.planet = arguments?.getParcelable(ARG_PLANET) as Planet
        return binding.root
    }

}
