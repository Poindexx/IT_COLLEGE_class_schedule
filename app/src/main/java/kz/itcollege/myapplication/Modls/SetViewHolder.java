package kz.itcollege.myapplication.Modls;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import kz.itcollege.myapplication.R;

public class SetViewHolder extends RecyclerView.ViewHolder {
    public TextView par,kobinet,sabak,mugalim,uakit;
    public SetViewHolder(@NonNull View itemView) {
        super(itemView);
        par = itemView.findViewById(R.id.tvPar);
        kobinet = itemView.findViewById(R.id.tvKobinet1);
        sabak = itemView.findViewById(R.id.tvSabak);
        mugalim = itemView.findViewById(R.id.tvMugalim);
        uakit = itemView.findViewById(R.id.tvUakit);
    }
}
