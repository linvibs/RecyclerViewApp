package com.example.hejvibs.recyclerviewapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hejvibs on 2/28/18.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {


    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
        }
    }
}
