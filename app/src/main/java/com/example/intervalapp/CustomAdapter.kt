package com.example.intervalapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.TextView

class CustomAdapter(private val dataSet: ArrayList<*>, mContext: Context) :
    ArrayAdapter<Any?>(mContext, R.layout.listview_item, dataSet) {

    private class ViewHolder {
        lateinit var day: TextView
        lateinit var checkBox: CheckBox
    }

    override fun getCount(): Int {
        return dataSet.size
    }

    override fun getItem(position: Int): DataModel{
        return dataSet[position] as DataModel
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val viewHolder: ViewHolder
        val result: View
        if(convertView == null){
            viewHolder = ViewHolder()
            convertView = LayoutInflater.from(parent.context).inflate(R.layout.listview_item, parent, false)
            viewHolder.day = convertView.findViewById(R.id.text)
            viewHolder.checkBox = convertView.findViewById(R.id.check)
            result = convertView
            convertView.tag = viewHolder
        }else{
            viewHolder = convertView.tag as ViewHolder
            result = convertView
        }

        val item: DataModel = getItem(position)
        viewHolder.day.text = item.day
        viewHolder.checkBox.isChecked = item.checked
        return result
    }

}