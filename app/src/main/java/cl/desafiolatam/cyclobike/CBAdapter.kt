package cl.desafiolatam.cyclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia

public class CBAdapter(val list: MutableList<Ciclovia>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycloBikeHolder<Any?> {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
            return CycloBikeHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class CycloBikeHolder(itemView: View) : RecyclerView.ViewHolder<>


}