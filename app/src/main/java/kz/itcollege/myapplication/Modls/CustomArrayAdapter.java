package kz.itcollege.myapplication.Modls;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import kz.itcollege.myapplication.R;

public class CustomArrayAdapter extends ArrayAdapter<listItemClass> {
    private LayoutInflater inflater;
    private List<listItemClass> listItem = new ArrayList<>();
    private Context context;


    public CustomArrayAdapter(@NonNull Context context, int resource, List<listItemClass> listItem,LayoutInflater inflater) {
        super(context, resource, listItem);
        this.inflater = inflater;
        this.listItem = listItem;
        this.context = context;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        listItemClass listItemMain = listItem.get(position);
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_view_item_1, null, false);
            viewHolder = new ViewHolder();
            viewHolder.par = convertView.findViewById(R.id.tvPar);
            viewHolder.kobinet = convertView.findViewById(R.id.tvKobinet1);
            viewHolder.sabak_name = convertView.findViewById(R.id.tvSabak);
            viewHolder.mugalim = convertView.findViewById(R.id.tvMugalim);
            viewHolder.uakit = convertView.findViewById(R.id.tvUakit);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.par.setText(listItemMain.getPar());
        viewHolder.kobinet.setText(listItemMain.getCobinet());
        viewHolder.sabak_name.setText(listItemMain.getSabak_name());
        viewHolder.mugalim.setText(listItemMain.getMugalim());
        viewHolder.uakit.setText(listItemMain.getUakit());



        return convertView;

    }
    private class ViewHolder{
        TextView  par;
        TextView kobinet;
        TextView sabak_name;
        TextView mugalim;
        TextView uakit;
    }
}
