package com.example.recyclerviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter(var numberslist:List<Int>):
  RecyclerView.Adapter<NumbersViewHolder>() {



  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
    var itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_items,parent,false)
    return NumbersViewHolder((itemView))

  }

  override fun getItemCount(): Int {
 return  numberslist.size
  }

  override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
    holder.tvNumbers.text= numberslist.get(position).toString()
  }
}
class NumbersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)

}

//class namesRecyclerviewAdapter(var nameslist:List<String>):
//  RecyclerView.Adapter<NamesViewHolder>(){
//  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
//    var itemView= LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
//    return NamesViewHolder((itemView))
//  }
//package com.example.recyclerview
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class namesRecyclerviewAdapter(var nameslist:List<String>):
//  RecyclerView.Adapter<NamesViewHolder>(){
//  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
//    var itemView=LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
//    return NamesViewHolder((itemView))
//  }
//
//  override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
//    holder.tvname.text=nameslist.get(position)
//  }
//
//  override fun getItemCount(): Int {
//    return nameslist.size
//  }
//}
//class  NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
//  var tvname=itemView.findViewById<TextView>(R.id.tvname)
//
//}
