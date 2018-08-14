package pro.savichev.planetexpress.logbook.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pro.savichev.planetexpress.logbook.ui.planets.PlanetsFragment
import pro.savichev.planetexpress.logbook.ui.welcome.WelcomeFragment

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeWelcome(): WelcomeFragment

    @ContributesAndroidInjector
    abstract fun contributePlanets(): PlanetsFragment
}