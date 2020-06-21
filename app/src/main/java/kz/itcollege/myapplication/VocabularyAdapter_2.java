package kz.itcollege.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import kz.itcollege.myapplication.Item.Item;
import kz.itcollege.myapplication.Item.SetViewHolder;
import kz.itcollege.myapplication.Modls.OnTapListener;

public class VocabularyAdapter_2 extends RecyclerView.Adapter<SetViewHolder> {
    private Activity activity;
    List<Item> items = Collections.emptyList();
    private OnTapListener onTapListener;
    public VocabularyAdapter_2(Activity activity, List<Item> items){
        this.activity = activity;
        this.items = items;
    }
    @NonNull
    @Override
    public SetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_item_2,parent,false);
        return new SetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SetViewHolder holder, int position) {
        holder.par.setText(items.get(position).getPar());
        holder.kobinet.setText(items.get(position).getKobinet());
        holder.sabak.setText(items.get(position).getSabak());
        holder.mugalim.setText(items.get(position).getMugalim());
        holder.group.setText(items.get(position).getGrop());
        holder.uakit.setText(items.get(position).getUakit());
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
        return items.size();
    }

    public void setOnTapListener(OnTapListener onTapListener){
        this.onTapListener = onTapListener;
    }
}
