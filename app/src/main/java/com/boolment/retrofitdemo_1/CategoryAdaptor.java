package com.boolment.retrofitdemo_1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.CategoryViewHolder> {


    private List<CategoryBeans> categoryNames;

    public CategoryAdaptor(List<CategoryBeans> categoryNames) {
        this.categoryNames = categoryNames;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item,viewGroup,false);

        return new CategoryViewHolder(view);
    }

    //first parametor of this method is viewHolder Class CategoryViewHolder
    @Override
    public void onBindViewHolder(CategoryViewHolder viewHolder, int i) {
        //bind the values to the text holders.
        viewHolder.catNames.setText(categoryNames.get(i).getCategory_name());
        viewHolder.catId.setText(categoryNames.get(i).getCategory_unique_id());
    }

    @Override
    public int getItemCount() {
        return categoryNames.size();
    }


    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        //creation varibale our single layout file that is created for recycler view

        TextView catNames,catId;


        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            //initialize the textView from the constructor
            catNames = itemView.findViewById(R.id.catname);
            catId = itemView.findViewById(R.id.catId);

        }
    }

}
