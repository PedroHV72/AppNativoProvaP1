package com.example.provatassiop1nativo.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.provatassiop1nativo.R;
import com.example.provatassiop1nativo.model.dao.NoticeItemListViewAdapter;
import com.example.provatassiop1nativo.model.entity.Notice;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        List<Notice> noticeList = new ArrayList<>();
        noticeList.add(new Notice(1, "Saúde & Bem Estar", "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", "08:07"));
        noticeList.add(new Notice(2, "Estadao verifica", "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", "09:31"));
        noticeList.add(new Notice(3, "Cadeira Executiva", "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", "10:46"));
        noticeList.add(new Notice(4, "Desastre Grande SP", "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", "11:43"));
        noticeList.add(new Notice(5, "A saga de Eike Batista", "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", "12:34"));
        noticeList.add(new Notice(6, "Assista Agora", "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", "15:52"));

        NoticeItemListViewAdapter adapter = new NoticeItemListViewAdapter(noticeList);

        ListView listNoticeView = findViewById(R.id.list_view_notice);
        listNoticeView.setAdapter(adapter);

        listNoticeView.setClickable(true);
        listNoticeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this, NewsActivity.class);

                intent.putExtra("title", noticeList.get(position).getTitle());
                intent.putExtra("descricao", noticeList.get(position).getDescricao());
                intent.putExtra("hour", noticeList.get(position).getHour());

                startActivity(intent);
            }
        });

    }
}

