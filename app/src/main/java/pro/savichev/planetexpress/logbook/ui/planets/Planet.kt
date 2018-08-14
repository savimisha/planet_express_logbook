package pro.savichev.planetexpress.logbook.ui.planets

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Planet(val nameResId: Int,
                  val colorResId: Int,
                  val compositionResId: Int,
                  val formResId: Int,
                  val descriptionResId: Int,
                  val imageResId: Int): Parcelable