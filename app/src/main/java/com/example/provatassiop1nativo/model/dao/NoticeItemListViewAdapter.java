package com.example.provatassiop1nativo.model.dao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.provatassiop1nativo.R;
import com.example.provatassiop1nativo.model.entity.Notice;

import java.util.List;

public class NoticeItemListViewAdapter extends BaseAdapter {
    private List<Notice> noticeList;

    public NoticeItemListViewAdapter(List<Notice> noticeList) {
        this.noticeList = noticeList;
    }

    @Override
    public int getCount() {
        return this.noticeList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.noticeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.noticeList.get(i).getCodigo();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notice, viewGroup, false);
        }

        Notice notice = (Notice) getItem(i);
        TextView textViewTitle = view.findViewById(R.id.title_view_id);
        textViewTitle.setText(notice.getTitle());
        TextView textViewDescricao = view.findViewById(R.id.description_view_id);
        textViewDescricao.setText(notice.getDescricao());
        TextView textViewHour = view.findViewById(R.id.hour_view_id);
        textViewHour.setText(notice.getHour());
        ImageView noticeImage = (ImageView) view.findViewById(R.id.imageView);
        noticeImage.setImageResource(R.drawable.estadao);

        return view;
    }
}
