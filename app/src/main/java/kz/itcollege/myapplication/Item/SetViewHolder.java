package kz.itcollege.myapplication.Item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import kz.itcollege.myapplication.R;


public class SetViewHolder extends RecyclerView.ViewHolder {
    public TextView par,kobinet,sabak,mugalim,uakit,group;

    public SetViewHolder(@NonNull View itemView) {
        super(itemView);
        par = itemView.findViewById(R.id.tvPar);
        kobinet = itemView.findViewById(R.id.tvKobinet1);
        sabak = itemView.findViewById(R.id.tvSabak);
        mugalim = itemView.findViewById(R.id.tvMugalim);
        group = itemView.findViewById(R.id.tvGroup);
        uakit = itemView.findViewById(R.id.tvUakit);
    }
}
