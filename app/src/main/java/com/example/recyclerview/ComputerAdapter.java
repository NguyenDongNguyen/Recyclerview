package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComputerAdapter extends RecyclerView.Adapter<ComputerAdapter.UserViewHolder>{

    private Context mContext;
    private List<Computer> mListComputer;

    public ComputerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Computer> list) {
        this.mListComputer = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_computer,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Computer computer = mListComputer.get(position);
        if (computer == null) {
            return;
        }

        holder.imageUser.setImageResource(computer.getResourceId());
        holder.tvName.setText(computer.getName());
    }

    @Override
    public int getItemCount() {
        if (mListComputer != null) {
            return mListComputer.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageUser;
        private TextView tvName;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imageUser = itemView.findViewById(R.id.img_user);
            tvName = itemView.findViewById(R.id.tv_name);
        }
    }
}
