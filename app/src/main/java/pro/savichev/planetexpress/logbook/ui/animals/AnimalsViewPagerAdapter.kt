package pro.savichev.planetexpress.logbook.ui.animals

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import pro.savichev.planetexpress.logbook.R

class AnimalsViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    companion object {
        private const val ANIMALS_COUNT = 10
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_1))
            }
            1 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_2))
            }
            2 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_3))
            }
            3 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_4))
            }
            4 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_5))
            }
            5 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_6))
            }
            6 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_7))
            }
            7 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_8))
            }
            8 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_9))
            }
            9 -> {
                AnimalFragment.newInstance(Animal(R.drawable.animal_10))
            }
            else -> {
                throw RuntimeException("No animal for position $position")
            }
        }
    }

    override fun getCount(): Int {
        return ANIMALS_COUNT
    }
}