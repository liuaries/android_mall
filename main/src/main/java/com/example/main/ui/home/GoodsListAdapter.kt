package com.example.main.ui.home

import android.widget.ImageView
import coil.load
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.main.R

class GoodsListAdapter(layoutResId: Int, data: MutableList<GoodsBean>) : BaseQuickAdapter<GoodsBean, BaseViewHolder>(layoutResId, data) {
    override fun convert(holder: BaseViewHolder, item: GoodsBean) {
        holder.setText(R.id.tv_title, item.name)
              .setText(R.id.tv_price, item.price)

        holder.getView<ImageView>(R.id.iv_img).load(item.url)
    }
}