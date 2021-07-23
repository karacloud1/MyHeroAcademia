package com.cloud.myheroacademia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val heroList : ArrayList<Hero>) : RecyclerView.Adapter<RecyclerAdapter.HeroVH>(){
    class HeroVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroVH {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent,false)
        return HeroVH(itemView)
    }

    override fun onBindViewHolder(holder: HeroVH, position: Int) {


        holder.itemView.recyclerViewTextView.text = heroList.get(position).heroName
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,PresentationActivity::class.java)
            intent.putExtra("hero",heroList.get(position))

            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return heroList.size
    }

}