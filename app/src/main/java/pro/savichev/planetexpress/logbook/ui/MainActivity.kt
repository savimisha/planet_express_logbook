package pro.savichev.planetexpress.logbook.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.main_activity.*
import pro.savichev.planetexpress.logbook.R
import javax.inject.Inject



class MainActivity : AppCompatActivity(), HasSupportFragmentInjector, NavigationView.OnNavigationItemSelectedListener {

    companion object {
        val TAG = MainActivity::class.simpleName!!
    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector() = dispatchingAndroidInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        toolbar.title = getString(R.string.planet_express)
        toolbar.subtitle = getString(R.string.logbook)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navigationView.setNavigationItemSelectedListener(this)
        NavigationUI.setupWithNavController(navigationView, Navigation.findNavController(this, R.id.container))
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            navigationView.setCheckedItem(0)
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        NavigationUI.onNavDestinationSelected(item, Navigation.findNavController(this, R.id.container))
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    fun getNavigationDrawerMenu(): Menu {
        return navigationView.menu
    }

}
