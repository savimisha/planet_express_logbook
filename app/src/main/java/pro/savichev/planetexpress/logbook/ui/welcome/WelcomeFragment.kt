package pro.savichev.planetexpress.logbook.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuItemCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import pro.savichev.planetexpress.logbook.di.Injectable
import pro.savichev.planetexpress.logbook.viewmodel.MainViewModelFactory
import pro.savichev.planetexpress.logbook.R
import pro.savichev.planetexpress.logbook.databinding.WelcomeFragmentBinding
import pro.savichev.planetexpress.logbook.ui.MainActivity
import javax.inject.Inject

class WelcomeFragment: Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: MainViewModelFactory

    lateinit var binding: WelcomeFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.welcome_fragment, container, false)

        binding.planetsFab.setOnClickListener {
            val activity = activity as MainActivity
            val menu = activity.getNavigationDrawerMenu()
            val menuItem = menu.findItem(R.id.planetsFragment)
            activity.onNavigationItemSelected(menuItem)
        }
        binding.animalsFab.setOnClickListener {
            val activity = activity as MainActivity
            val menu = activity.getNavigationDrawerMenu()
            val menuItem = menu.findItem(R.id.animalsFragment)
            activity.onNavigationItemSelected(menuItem)
        }
        binding.currenciesFab.setOnClickListener {
            val activity = activity as MainActivity
            val menu = activity.getNavigationDrawerMenu()
            val menuItem = menu.findItem(R.id.currenciesFragment)
            activity.onNavigationItemSelected(menuItem)
        }
        binding.devilFab.setOnClickListener {
            val activity = activity as MainActivity
            val menu = activity.getNavigationDrawerMenu()
            val menuItem = menu.findItem(R.id.devilFragment)
            activity.onNavigationItemSelected(menuItem)
        }
        return binding.root
    }

}