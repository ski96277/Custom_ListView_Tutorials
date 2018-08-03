package com.example.imransk.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] name;
    int[] images;
    LayoutInflater layoutInflater = null;

    public CustomAdapter(Context context, String[] name, int[] images) {
        this.context = context;
        this.name = name;
        this.images = images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.item_list, null);
        ImageView imageView = view.findViewById(R.id.imageView_ID);
        final TextView country_name = view.findViewById(R.id.name_ID);
        imageView.setImageResource(images[i]);
        country_name.setText(name[i]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+country_name.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
