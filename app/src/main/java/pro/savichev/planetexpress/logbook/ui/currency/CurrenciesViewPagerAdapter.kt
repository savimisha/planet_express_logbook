package pro.savichev.planetexpress.logbook.ui.currency

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.planet_fragment.view.*
import pro.savichev.planetexpress.logbook.R

class CurrenciesViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    companion object {
        private const val CURRENCIES_COUNT = 12
    }

    override fun getCount(): Int {
        return CURRENCIES_COUNT
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_1, R.string.currency_1_name))
            }
            1 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_2, R.string.currency_2_name))
            }
            2 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_3, R.string.currency_3_name))
            }
            3 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_4, R.string.currency_4_name))
            }
            4 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_5, R.string.currency_5_name))
            }
            5 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_6, R.string.currency_6_name))
            }
            6 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_7, R.string.currency_7_name))
            }
            7 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_8, R.string.currency_8_name))
            }
            8 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_9, R.string.currency_9_name))
            }
            9 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_10, R.string.currency_10_name))
            }
            10 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_11, R.string.currency_11_name))
            }
            11 -> {
                CurrencyFragment.newInstance(Currency(R.drawable.currency_12, R.string.currency_12_name))
            }
            else -> {
                throw RuntimeException("No currency for position $position")
            }
        }
    }
}