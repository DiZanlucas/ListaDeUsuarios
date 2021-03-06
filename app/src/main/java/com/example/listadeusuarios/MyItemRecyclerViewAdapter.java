package com.example.listadeusuarios;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.listadeusuarios.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.listadeusuarios.databinding.FragmentItemBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Usuario> mValues;


    public MyItemRecyclerViewAdapter(List<Usuario> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

    return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        //holder.mIdView.setText(mValues.get(position).id);

        holder.mContentView.setText(mValues.get(position).nome);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.mContentView.setText(mValues.get(position).nome+ " \nCPF: " +mValues.get(position).getCPF() + "\nIdade: " + mValues.get(position).getIdade()+ "\ne-mail: " + mValues.get(position).getEmail()+ "\nTelefone: " + mValues.get(position).getTelefone());
            }
        });

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //public final TextView mIdView;
        public final TextView mContentView;
        public Usuario mItem;

    public ViewHolder(FragmentItemBinding binding) {
      super(binding.getRoot());
      //mIdView = binding.itemNumber;
      mContentView = binding.content;
    }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }

}