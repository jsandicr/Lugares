package com.jsandi.lugares.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jsandi.lugares.databinding.LugarFilaBinding
import com.jsandi.lugares.model.Lugar

class LugarAdapter : RecyclerView.Adapter<LugarAdapter.LugarViewHolder>() {
    private var listaLugares = emptyList<Lugar>()

    inner class LugarViewHolder(private val itemBinding: LugarFilaBinding) :
            RecyclerView.ViewHolder(itemBinding.root){
                fun bind(lugar: Lugar){
                    itemBinding.tvTelefono.text = lugar.telefono
                    itemBinding.tvCorreo.text = lugar.correo
                    itemBinding.tvNombre.text = lugar.nombre
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarViewHolder {
        val itemBinding = LugarFilaBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return LugarViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: LugarViewHolder, position: Int) {
        val lugarActual = listaLugares[position]
        holder.bind(lugarActual)
    }

    override fun getItemCount(): Int {
        return listaLugares.size
    }

    fun setData(lugares: List<Lugar>){
        this.listaLugares = lugares
        notifyDataSetChanged()
    }
}