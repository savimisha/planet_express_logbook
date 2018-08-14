package pro.savichev.planetexpress.logbook.ui.planets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.planets_fragment.*
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.PlanetsFragmentBinding
import pro.savichev.planetexpress.logbook.di.Injectable
import pro.savichev.planetexpress.logbook.viewmodel.MainViewModelFactory
import javax.inject.Inject

class PlanetsFragment: Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: MainViewModelFactory

    private lateinit var binding: PlanetsFragmentBinding

    private lateinit var pagerAdapter: PlanetsViewPagerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.planets_fragment, container, false)
        pagerAdapter = PlanetsViewPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = pagerAdapter
        binding.springDotsIndicator.setViewPager(binding.viewPager)
        return binding.root
    }
}