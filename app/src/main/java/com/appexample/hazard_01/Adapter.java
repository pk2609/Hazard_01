package com.appexample.hazard_01;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Random;

public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder>{

    private List<Main2Activity> myNews;
    private Context context;
    public int i=5, j=5;

    public class myviewholder extends RecyclerView.ViewHolder {

        LinearLayout layout1;
        public TextView author, title, description, published, text1;
        public ImageView img;
        public ImageButton img1, img2;


        public myviewholder(View itemView) {
            super(itemView);

            author = (TextView) itemView.findViewById(R.id.author);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.desc);
            published = (TextView) itemView.findViewById(R.id.published);
            layout1 = (LinearLayout) itemView.findViewById(R.id.layout1);
            img= (ImageView) itemView.findViewById(R.id.img);
            text1 = (TextView) itemView.findViewById(R.id.text11);
            img1 = (ImageButton) itemView.findViewById(R.id.img11);
            img2 = (ImageButton)itemView.findViewById(R.id.img22);

        }

    }

    public Adapter(Context context,List<Main2Activity> myNews) {
        this.myNews = myNews;
        this.context=context;
    }

    @Override
    public Adapter.myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new myviewholder(itemView);
    }

    @Override
    public void onBindViewHolder(final myviewholder holder, int position) {

        final Main2Activity News = myNews.get(position);
        Random rand = new Random();
        holder.author.setText(News.getAuthor());
        holder.title.setText(News.getTitle());
        holder.published.setText(News.getPublished());
        holder.description.setText(News.getDescription());
        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.img1.setVisibility(View.VISIBLE);
                i++;
                holder.img1.setEnabled(false);
                holder.img2.setEnabled(false);
            }
        });
        holder.img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.img2.setVisibility(View.VISIBLE);
                i++;
                holder.img1.setEnabled(false);
                holder.img2.setEnabled(false);
            }
        });
        holder.text1.setText(String.valueOf( 30 + rand.nextInt(67)) + "%");
        if(!News.getPublished().contentEquals("null")){
            holder.published.setText(News.getPublished());
        }else {
            holder.published.setText("");
        }
        if(!News.getAuthor().contentEquals("null")){
            holder.author.setText(News.getAuthor());
        }else {
            holder.author.setText("");
        }
        Picasso.with(context).load(News.getImgurl()).into(holder.img);
        holder.layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(News.getUrl()));
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myNews.size();
    }
}
