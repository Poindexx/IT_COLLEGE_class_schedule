package kz.itcollege.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class StaggeredRecyclerViewAdapter extends  RecyclerView.Adapter<StaggeredRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "StaggeredRecyclerViewAd";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mSabak = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mId = new ArrayList<>();
    private Context mContext;

    public StaggeredRecyclerViewAdapter(Context mContext,ArrayList<String> mNames, ArrayList<String> mSabak,ArrayList<String> mId, ArrayList<String> mImageUrls) {
        this.mNames = mNames;
        this.mSabak = mSabak;
        this.mId = mId;
        this.mImageUrls = mImageUrls;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);

        Glide.with(mContext)
                .load(mImageUrls.get(position))
                .apply(requestOptions)
                .into(holder.image);

        holder.name.setText(mNames.get(position));
        holder.sabak_n.setText(mSabak.get(position));

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mNames.get(position)  + mSabak.get(position));
                Intent intent = new Intent();
                intent.setClass(mContext, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop", mNames.get(position));
                b.putString("classID", mNames.get(position));
                intent.putExtras(b);
                intent.putExtras(c);
                mContext.startActivity(intent);
                Toast.makeText(mContext, mNames.get(position), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageUrls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,sabak_n;



//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            this.image = image;
//            this.name = name;
//            this.sabak_n = sabak_n;
//        }

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.image_mugalim);
            this.name = itemView.findViewById(R.id.name_and_surname);
            this.sabak_n = itemView.findViewById(R.id.sabak_n);
        }
    }

}
