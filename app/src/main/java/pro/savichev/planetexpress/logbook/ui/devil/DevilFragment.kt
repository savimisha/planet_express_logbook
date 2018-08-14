package pro.savichev.planetexpress.logbook.ui.devil

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.DevilFragmentBinding

class DevilFragment: Fragment() {

    private lateinit var binding: DevilFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.devil_fragment, container, false)
        return binding.root
    }

}