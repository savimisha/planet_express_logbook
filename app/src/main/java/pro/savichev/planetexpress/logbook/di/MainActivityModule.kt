package pro.savichev.planetexpress.logbook.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pro.savichev.planetexpress.logbook.ui.MainActivity

@Suppress("unused")
@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun bindMainActivity(): MainActivity
}
