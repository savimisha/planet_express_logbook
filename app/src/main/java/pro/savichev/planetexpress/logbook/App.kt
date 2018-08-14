package pro.savichev.planetexpress.logbook

import android.app.Activity
import android.app.Application
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import pro.savichev.planetexpress.logbook.di.AppInjector
import pro.savichev.planetexpress.logbook.ui.MainActivity
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>


    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }

    override fun activityInjector() = dispatchingAndroidInjector
}