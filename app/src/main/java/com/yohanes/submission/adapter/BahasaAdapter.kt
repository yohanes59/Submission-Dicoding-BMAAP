package com.yohanes.submission.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yohanes.submission.DetailsActivity
import com.yohanes.submission.R
import com.yohanes.submission.model.Bahasa

class BahasaAdapter(private val listBahasa: ArrayList<Bahasa>)
    : RecyclerView.Adapter<BahasaAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_hero, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bahasa = listBahasa[position]

        Glide.with(holder.itemView.context)
            .load(bahasa.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = bahasa.name
        holder.tvPenjelasan.text = bahasa.penjelasan

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, DetailsActivity::class.java)
            moveDetail.putExtra(DetailsActivity.EXTRA_NAME, bahasa.name)
            moveDetail.putExtra(DetailsActivity.EXTRA_SEJARAH, bahasa.sejarah)
            moveDetail.putExtra(DetailsActivity.EXTRA_SUMBER, bahasa.sumber)
            moveDetail.putExtra(DetailsActivity.EXTRA_PENEMU, bahasa.penemu)
            moveDetail.putExtra(DetailsActivity.EXTRA_PENJELASAN, bahasa.penjelasan)
            moveDetail.putExtra(DetailsActivity.EXTRA_TAHUN, bahasa.tahun)
            moveDetail.putExtra(DetailsActivity.EXTRA_IMG, bahasa.photo)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount() = listBahasa.size

    inner class ListViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_bahasa_names)
        var tvPenjelasan : TextView = itemView.findViewById(R.id.tv_bahasa_penjelasan)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}