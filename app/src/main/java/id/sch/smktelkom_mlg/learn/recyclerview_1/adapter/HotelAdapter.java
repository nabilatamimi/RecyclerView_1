package id.sch.smktelkom_mlg.learn.recyclerview_1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.learn.recyclerview_1.R;
import id.sch.smktelkom_mlg.learn.recyclerview_1.model.Hotel;

/**
 * Created by tomama on 1/31/2017.
 */

public class HotelAdapter extends RecyclerView_1.Adapter<HotelAdapter.ViewHolder> {

    ArrayList<Hotel> hotelList;


    public HotelAdapter(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.tvjudul.setText(hotel.judul);
        holder.tvdeskripsi.setText(hotel.deskripsi);
        holder.ivfoto.setImageDrawable(hotel.foto);
    }

    @Override
    public int getItemCount() {
        if (hotelList != null)
            return hotelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivfoto;
        TextView tvjudul;
        TextView tvdeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivfoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvjudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvdeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
