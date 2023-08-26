package ru.kuz.calendr.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import ru.kuz.calendr.R;
import ru.kuz.calendr.models.Model;

public class ScrollAdapter extends RecyclerView.Adapter<ScrollAdapter.ViewHolder> {
    public Context context;
    public ArrayList<Model> models = new ArrayList<>();
//                new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"),
//            new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"),
//            new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"),
//            new Model("https://reparin.ru/wp-content/uploads/2022/06/%D1%88%D0%B8%D0%BD%D1%88%D0%B8%D0%BB%D0%BB%D0%B0.jpg.webp", "Chinchilla2"),
//            new Model("https://reparin.ru/wp-content/uploads/2022/06/%D1%88%D0%B8%D0%BD%D1%88%D0%B8%D0%BB%D0%BB%D0%B0.jpg.webp", "Chinchilla2")

    public ScrollAdapter(Context context) {
        this.context = context;
        models.add(new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"));
        models.add(new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"));
        models.add(new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"));
        models.add(new Model("https://www.bethowen.ru/upload/iblock/9aa/9aa4890b29e34cf8705b90059bc6f73b.jpg", "Cinchilla"));
    }

    @NonNull
    @Override
    public ScrollAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_scroll_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ScrollAdapter.ViewHolder holder, int position) {
        holder.preferences(models.get(position), context);
        holder.clickListener(position, models, this);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView scrollImage;
        public TextView scrollLabel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            scrollImage = itemView.findViewById(R.id.scroll_image);
            scrollLabel = itemView.findViewById(R.id.scroll_label);

        }

        public void preferences(Model model, Context context) {
            scrollLabel.setText(model.label);
            Glide
                    .with(context.getApplicationContext())
                    .load(model.URL_image) //ссылка на изображение
                    .into(scrollImage); //куда кидать изображение
        }

        public void clickListener(int position, ArrayList<Model> model, ScrollAdapter adapter) {
            scrollImage.setOnClickListener(view -> {
                models.remove(position);
                adapter.notifyDataSetChanged();
            });
        }


    }
}
