package pro.savichev.planetexpress.logbook.ui.currency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.CurrencyFragmentBinding

class CurrencyFragment: Fragment() {
    companion object {

        private const val ARG_CURRENCY = "currency_CurrencyFragment"

        fun newInstance(currency: Currency): CurrencyFragment {
            val args = Bundle()
            args.putParcelable(ARG_CURRENCY, currency)
            val currencyFragment = CurrencyFragment()
            currencyFragment.arguments = args
            return currencyFragment
        }
    }

    lateinit var binding: CurrencyFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.currency_fragment, container, false)
        binding.currency = arguments?.getParcelable(ARG_CURRENCY) as Currency
        return binding.root
    }
}