package pro.savichev.planetexpress.logbook.ui.planets

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import pro.savichev.planetexpress.logbook.R

class PlanetsViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    companion object {
        private const val PLANETS_COUNT = 10
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_black_name,
                        R.string.planet_black_color,
                        R.string.planet_black_composition,
                        R.string.planet_black_form,
                        R.string.planet_black_description,
                        R.drawable.planet_black))
            }
            1 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_white_name,
                        R.string.planet_white_color,
                        R.string.planet_white_composition,
                        R.string.planet_white_form,
                        R.string.planet_white_description,
                        R.drawable.planet_white))
            }
            2 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_red_name,
                        R.string.planet_red_color,
                        R.string.planet_red_composition,
                        R.string.planet_red_form,
                        R.string.planet_red_description,
                        R.drawable.planet_red))
            }
            3 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_green_name,
                        R.string.planet_green_color,
                        R.string.planet_green_composition,
                        R.string.planet_green_form,
                        R.string.planet_green_description,
                        R.drawable.planet_green))
            }
            4 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_pink_name,
                        R.string.planet_pink_color,
                        R.string.planet_pink_composition,
                        R.string.planet_pink_form,
                        R.string.planet_pink_description,
                        R.drawable.planet_pink))
            }
            5 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_yellow_name,
                        R.string.planet_yellow_color,
                        R.string.planet_yellow_composition,
                        R.string.planet_yellow_form,
                        R.string.planet_yellow_description,
                        R.drawable.planet_yellow))
            }
            6 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_blue_name,
                        R.string.planet_blue_color,
                        R.string.planet_blue_composition,
                        R.string.planet_blue_form,
                        R.string.planet_blue_description,
                        R.drawable.planet_blue))
            }
            7 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_purple_name,
                        R.string.planet_purple_color,
                        R.string.planet_purple_composition,
                        R.string.planet_purple_form,
                        R.string.planet_purple_description,
                        R.drawable.planet_purple))
            }
            8 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_orange_name,
                        R.string.planet_orange_color,
                        R.string.planet_orange_composition,
                        R.string.planet_orange_form,
                        R.string.planet_orange_description,
                        R.drawable.planet_orange))
            }
            9 -> {
                PlanetFragment.newInstance(Planet(R.string.planet_blue1_name,
                        R.string.planet_blue1_color,
                        R.string.planet_blue1_composition,
                        R.string.planet_blue1_form,
                        R.string.planet_blue1_description,
                        R.drawable.planet_blue1))
            }
            else -> {
                throw RuntimeException("No planet for position $position")
            }
        }
    }

    override fun getCount(): Int {
        return PLANETS_COUNT
    }
}