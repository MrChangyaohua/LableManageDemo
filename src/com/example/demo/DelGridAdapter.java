package com.example.demo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.model.LableBean;

public class DelGridAdapter extends BaseAdapter {
	private Context context;
	private List<LableBean> list;

	public DelGridAdapter(Context context, List<LableBean> list) {
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view;
		if (convertView == null) {
			view = LayoutInflater.from(context).inflate(R.layout.item_del_grid, null);
		} else {
			view = convertView;
		}
		ImageView imageView = (ImageView) view.findViewById(R.id.itemImage);
		imageView.setImageResource(list.get(position).getImgID());
		return view;
	}

}
