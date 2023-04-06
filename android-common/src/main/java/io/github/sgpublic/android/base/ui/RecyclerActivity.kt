package io.github.sgpublic.android.base.ui

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import io.github.sgpublic.android.base.app.BaseViewModelActivity
import io.github.sgpublic.android.databinding.ActivityRecyclerBinding

/**
 *
 * @author Madray Haven
 * @date 2022/11/9 10:55
 */
abstract class RecyclerActivity<ItemT, ViewT: ViewBinding, VM: ViewModel>:
    BaseViewModelActivity<ActivityRecyclerBinding, VM>() {
    @CallSuper
    override fun onViewSetup() {
        ViewBinding.recyclerOrigin.adapter = Adapter
    }

    protected abstract val Adapter: ArrayRecyclerAdapter<ViewT, ItemT>

    override val ViewBinding: ActivityRecyclerBinding by viewBinding()
}