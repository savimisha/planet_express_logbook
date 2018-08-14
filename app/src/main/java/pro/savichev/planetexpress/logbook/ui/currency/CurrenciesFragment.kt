package pro.savichev.planetexpress.logbook.ui.currency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.CurrenciesFragmentBinding

class CurrenciesFragment: Fragment() {

    private lateinit var binding: CurrenciesFragmentBinding

    private lateinit var pagerAdapter: CurrenciesViewPagerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.currencies_fragment, container, false)
        pagerAdapter = CurrenciesViewPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = pagerAdapter
        binding.springDotsIndicator.setViewPager(binding.viewPager)
        return binding.root
    }

}