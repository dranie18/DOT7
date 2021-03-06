package a.Cart_Files;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import a.dot7.R;

/**
 * Created by TUSHAR on 09-04-18.
 */

class Cart_Individual_Restaurant_Adapter extends RecyclerView.Adapter<CartRestaurant_ViewHolder> {

    ArrayList<DishesData> dishesDetails;
    Context context;
    Cart_Individual_Restaurant_Adapter(Context context,ArrayList<DishesData> dishesDetails)
    {
        this.context = context;
        this.dishesDetails = dishesDetails;
       // Log.d("HAR", String.valueOf(dishesDetails.size()));
    }
    @Override
    public CartRestaurant_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_item_restaurant_dish, parent, false);

        CartRestaurant_ViewHolder viewHolder = new CartRestaurant_ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CartRestaurant_ViewHolder holder, int position) {
        DishesData dishes = dishesDetails.get(position);
       // Log.d("HAR", String.valueOf(dishes));
        holder.DName.setText(dishes.getDishName());
        holder.Dprice.setText(dishes.getDishPrice());
        String quantity = "x "+String.valueOf(dishes.getQuantity());
        holder.DQuantity.setText(quantity);
    }

    @Override
    public int getItemCount() {
        return dishesDetails.size();
    }
}







 /*
    ArrayList<DishesData> dishesDetails;
    Context context;
    Cart_Individual_Restaurant_Adapter(Context context,ArrayList<DishesData> dishesDetails)
    {
        this.context = context;
        this.dishesDetails = dishesDetails;
    }
    @Override
    public CartRestaurant_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_item_restaurant_dish, parent, false);

        CartRestaurant_ViewHolder viewHolder = new CartRestaurant_ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CartRestaurant_ViewHolder holder, int position) {
        DishesData dishes = dishesDetails.get(position);
        holder.DName.setText(dishes.getDishName());
        holder.Dprice.setText(dishes.getDishPrice());
        String quantity = "x "+String.valueOf(dishes.getQuantity());
        holder.DQuantity.setText(quantity);

    }

    @Override
    public int getItemCount() {
        return dishesDetails.size();
    }
}
*/