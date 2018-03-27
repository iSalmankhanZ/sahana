package com.car.wash.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.car.wash.R;
import com.car.wash.interfa.itemClickListner;

/**
 * Created by sahana on 3/13/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;

    private itemClickListner ItemClickListner;

    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView =(ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListner(itemClickListner itemClickListner) {
        ItemClickListner = itemClickListner;
    }

    @Override
    public void onClick(View view) {

        ItemClickListner.onClick(view,getAdapterPosition(),false);

    }
}
