package pro.savichev.planetexpress.logbook.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pro.savichev.planetexpress.logbook.ui.welcome.WelcomeViewModel
import pro.savichev.planetexpress.logbook.viewmodel.MainViewModelFactory

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(WelcomeViewModel::class)
    abstract fun bindWelcomeViewModel(welcomeViewModel: WelcomeViewModel): ViewModel


    @Binds
    abstract fun bindMainViewModelFactory(factory: MainViewModelFactory): ViewModelProvider.Factory
}