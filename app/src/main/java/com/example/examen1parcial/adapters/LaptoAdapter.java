package com.example.examen1parcial.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen1parcial.Lapto;
import com.example.examen1parcial.R;

import java.util.List;

//public class LaptoAdapter extends RecyclerView.Adapter<LaptoAdapter> {
//    List<Lapto> laptoList;
//    public LaptoAdapter(List<Lapto> laptoList) {this.laptoList= laptoList;}

//    @Override
//    public LaptoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.lapto_car_layout, parent, false);
//        return LaptoViewHolder(view)
//    }
//    @Override
//    public void onBindViewHolder(@NonNull LaptoViewHolder holder, int position) {
//        holder.texViewMarca.setText(laptoList.get(position).getMarca());
//        holder.texViewAno.setText(laptoList.get(position).getAno());
//        holder.texViewModelo.setText(laptoList.get(position).getModelo());
//        holder.texViewProcesador.setText(laptoList.get(position).getProcesador());
//        holder.texViewPrecio.setText(laptoList.get(position).getPrecio());

//    @Override
//    public int getItemCount() { return laptoList.size(); }
    //clase para el viewholder
//    public class LaptoViewHolder extends RecyclerView.ViewHolder{
//        TextView texViewMarca, texViewAno, texViewModelo, texViewProcesador, texViewPrecio;
//        public LaptoViewHolder(View itemView){
//            super(itemView);
//            texViewMarca = itemView.findViewById(R.id.TexViewmarca);
//            texViewAno  = itemView.findViewById(R.id.TexViewano);
//            texViewModelo = itemView.findViewById(R.id.TexViewmodelo);
//            texViewProcesador = itemView.findViewById(R.id.TexViewprocesador);
//            texViewPrecio = itemView.findViewById(R.id.TexViewprecio);
//        }
//    }
//}
