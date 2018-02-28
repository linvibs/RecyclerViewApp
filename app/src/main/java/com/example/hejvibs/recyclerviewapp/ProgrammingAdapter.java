package com.example.hejvibs.recyclerviewapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hejvibs on 2/28/18.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String[] data;

    // Below Constructor will store the data that needs to be displayed in the RecyclerView
    public ProgrammingAdapter(String[] data) {
        this.data = data;
    }

    // Below function tells us the Count of data that needs to be displayed in the RecyclerView,
    // this value is fetched from the Adapter Constructor variable, that stores all the data.
    @Override
    public int getItemCount() {
        return data.length;
    }


    /**
     * Below function 'onCreateViewHolder' returns a View of type 'ProgrammingViewHolder' and
     * it also stores the references, so that 'findViewById' need not be called each time.
     *
     * Before Implementing below method,
     * First create the Single Item View/UI (in the res folder - add a 'Layout resource file')
     * that will display the contents for a 'Single List Item' in the RecyclerView     *
     * Second, create an instance of 'LayoutInflater'
     * Third, create a View using above instance of LayoutInflater, passing 'layout.xml' as one of its param.
     * Fourth,
     */

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);

        /**
         * below we are returning the generated view, but before that we are calling
         * 'ProgrammingViewHolder' method (passing above view as a param) to store the Views references
         * from 'list_item_layout, so that 'findViewById' need not to be called each time.
         */
        return new ProgrammingViewHolder(view);
    }

    /**
     * Below method will bind the Data that we have received (in the Constructor, using data position)
     * with the View created by 'onCreateViewHolder'
     */
    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        // getting the String Value stored in the Position passed to above method
        String title = data[position];
        // Setting that value to the TextView i.e. txtTitle of the ViewHolder i.e. holder
        holder.txtTitle.setText(title);
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcom;
        TextView txtTitle;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcom = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }
}