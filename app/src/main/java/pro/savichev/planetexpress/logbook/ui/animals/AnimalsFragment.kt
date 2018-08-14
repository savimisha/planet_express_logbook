package pro.savichev.planetexpress.logbook.ui.animals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.AnimalsFragmentBinding

class AnimalsFragment: Fragment() {


    private lateinit var binding: AnimalsFragmentBinding

    private lateinit var pagerAdapter: AnimalsViewPagerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.animals_fragment, container, false)
        pagerAdapter = AnimalsViewPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = pagerAdapter
        binding.springDotsIndicator.setViewPager(binding.viewPager)
        return binding.root
    }

}