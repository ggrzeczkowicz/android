package org.owntracks.android.ui.welcome.permission

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class PermissionFragmentModule {
    @Binds
    abstract fun bindSupportFragment(f: PermissionFragment?): Fragment?
}