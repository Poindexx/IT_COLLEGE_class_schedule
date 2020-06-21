package kz.itcollege.myapplication;

import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kz.itcollege.myapplication.Item.Item;


public class tabItem6  extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private ArrayList<Item> arrayList = new ArrayList<Item>();
    private Cursor cursor;
    String classID,id_grop;
    private VocabularyAdapter adapter;
    private VocabularyAdapter_2 adapter_2;

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.list_item,container,false);
        recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view);
        return viewGroup;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getActivity().getIntent().getExtras();
        classID = bundle.getString("classID");
        id_grop = bundle.getString("id_grop");
    }

    @Override
    public void onResume() {
        super.onResume();
        if (arrayList != null) {
            arrayList.clear();
            databaseHelper = new DatabaseHelper(getActivity());
            try {
                databaseHelper.checkAndCopyDatabase();
                databaseHelper.openDatabase();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                cursor = databaseHelper.QueryData("select * from dbnew" + " where (mugalim='" + id_grop + "' and day=6) or (grop='" + classID + "' and day=6) or (kobinet='" + classID + "' and day=6)" + "ORDER BY par ASC");
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        do {
                            Item item = new Item();
                            item.setGrop(cursor.getString(1));
                            item.setPar(cursor.getString(3));
                            item.setKobinet(cursor.getString(4));
                            item.setSabak(cursor.getString(5));
                            item.setMugalim(cursor.getString(6));
                            item.setUakit(cursor.getString(7));
                            arrayList.add(item);
                        } while (cursor.moveToNext());
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            adapter_2 = new VocabularyAdapter_2(getActivity(), arrayList);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adapter_2);
        }
    }
}

