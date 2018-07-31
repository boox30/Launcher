package com.onezero.launcher.launcher.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.onezero.launcher.launcher.R;

class AppInfoViewHolder extends RecyclerView.ViewHolder {

    public ImageView icon;
    public TextView label;
    public ImageView removeIcon;

    public AppInfoViewHolder(View itemView) {
        super(itemView);
        icon = itemView.findViewById(R.id.launcher_app_icon);
        label = itemView.findViewById(R.id.launcher_app_label);
        removeIcon = itemView.findViewById(R.id.app_info_remove);
    }
}