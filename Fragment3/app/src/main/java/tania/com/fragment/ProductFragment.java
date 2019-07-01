package tania.com.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends Fragment {

    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<ProductItem>productItems;



    public ProductFragment() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_product, container, false);

        recyclerView = v.findViewById(R.id.recyclerView);
        adapter = new CustomAdapter(productItems,getContext());

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        recyclerView.setAdapter(adapter);


        return v;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productItems = new ArrayList<>();
        productItems.add(new ProductItem("Shirt","2345"));
        productItems.add(new ProductItem("Shirt","2345"));
        productItems.add(new ProductItem("Shirt","2345"));
        productItems.add(new ProductItem("Shirt","2345"));
    }
}
