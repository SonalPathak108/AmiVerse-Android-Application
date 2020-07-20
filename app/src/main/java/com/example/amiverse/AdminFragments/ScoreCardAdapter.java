package com.example.amiverse.AdminFragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amiverse.R;
import com.example.amiverse.ScoreJson;

public class ScoreCardAdapter extends RecyclerView.Adapter<ScoreCardAdapter.ScoreView>{

     ScoreJson[]data;

    public ScoreCardAdapter(ScoreJson[] data){

        this.data = data;
    }

    @NonNull
    @Override
    public ScoreView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate((R.layout.recycler_score),parent,false);
        return new ScoreView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScoreView holder, int position) {

        ScoreJson Deparetement = data[position];
        ScoreJson Gold = data[position];
        ScoreJson Silver = data[position];
        ScoreJson Bronze = data[position];
        ScoreJson Score = data[position];

        holder.departement.setText(Deparetement.getDepartement());
        holder.gold.setText(Gold.getGoldMedal());
        holder.silver.setText(Silver.getSilverMedal());
        holder.bronze.setText(Bronze.getBronzeMedal());
        holder.score.setText(Score.getScore());


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class ScoreView extends RecyclerView.ViewHolder{


        TextView departement, gold, silver,bronze,score;
        public ScoreView(@NonNull View itemView) {
            super(itemView);

            departement = (TextView) itemView.findViewById(R.id.DepartementName);
            gold = (TextView) itemView.findViewById(R.id.gold);
            silver = (TextView) itemView.findViewById(R.id.silver);
            bronze = (TextView) itemView.findViewById(R.id.bronze);
            score = (TextView) itemView.findViewById(R.id.score);
        }
    }
}
