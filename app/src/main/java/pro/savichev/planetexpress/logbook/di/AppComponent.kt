package pro.savichev.planetexpress.logbook.di

import android.app.Application
import android.content.Context
import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import pro.savichev.planetexpress.logbook.App

@Singleton
@Component(modules = [ AndroidSupportInjectionModule::class, AppModule::class, MainActivityModule::class, ViewModelModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
    fun inject(app: App)
    fun context(): Context
}
