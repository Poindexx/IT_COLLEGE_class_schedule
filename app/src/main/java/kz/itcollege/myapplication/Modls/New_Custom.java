package kz.itcollege.myapplication.Modls;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import kz.itcollege.myapplication.R;

public class New_Custom extends RecyclerView.Adapter<SetViewHolder> {
    private Activity activity;
    List<listItemClass> listItemClasses = Collections.emptyList();
    private OnTapListener onTapListener;
    public New_Custom(Activity activity, List<listItemClass> listItemClasses) {
        this.activity = activity;
        this.listItemClasses = listItemClasses;
    }

    @NonNull
    @Override
    public SetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_item_1,parent,false);
        return new SetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SetViewHolder holder, int position) {
        holder.par.setText(listItemClasses.get(position).getPar());
        holder.kobinet.setText(listItemClasses.get(position).getCobinet());
        holder.sabak.setText(listItemClasses.get(position).getSabak_name());
        holder.mugalim.setText(listItemClasses.get(position).getMugalim());
        holder.uakit.setText(listItemClasses.get(position).getUakit());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onTapListener != null){
                    onTapListener.OnTapView(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItemClasses.size();
    }
    public void setOnTapListener(OnTapListener onTapListener){
        this.onTapListener = onTapListener;
    }
}
