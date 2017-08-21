package com.pellsoft.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jorge on 21/08/2017.
 */

public class PersonalizedAdapter extends BaseAdapter {

    Context context;
    List<ElementListed> elements;

    public PersonalizedAdapter(Context context, List<ElementListed> elements){
        this.context=context;
        this.elements=elements;
    }

    @Override
    public int getCount() {
        return elements.size();
    }

    @Override
    public ElementListed getItem(int i) {
        return elements.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Create the view using the XML which defines the elements (rows)
        view = LayoutInflater.from(context).inflate(R.layout.element_view,null);

        //Set values to Layout components
        TextView elementName = view.findViewById(R.id.elementName);
        elementName.setText(elements.get(i).name);
        TextView elementDesc = view.findViewById(R.id.elementDesc);
        elementDesc.setText(elements.get(i).desc);

        //Return the view
        return view;

    }
}
