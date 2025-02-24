package com.example.gamewiki;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {
    private ArrayList<Game> games;

    public GameAdapter(ArrayList<Game> games) {
        this.games = games;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_game, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game game = games.get(position);
        holder.gameLogo.setImageResource(game.getLogoResId());
        holder.gameName.setText(game.getName());
        holder.gameShortDescription.setText(game.getShortDescription());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), game_detail.class);
            intent.putExtra("imageResId", game.getImageResId());
            intent.putExtra("longDescription", game.getLongDescription());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {
        ImageView gameLogo;
        TextView gameName;
        TextView gameShortDescription;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            gameLogo = itemView.findViewById(R.id.gameLogo);
            gameName = itemView.findViewById(R.id.gameName);
            gameShortDescription = itemView.findViewById(R.id.gameShortDescription);
        }
    }
}