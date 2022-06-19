package com.jeiu.mycoverletter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CapstonePage extends Fragment {
    MainPageAdapter mainPageAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.capstone_view, container, false);

        // skill 내용 입력
        MainPageInfo skill01 = new MainPageInfo(R.drawable.python, "Python", "Flask를 통한 API Server 서비스, Pandas와 mathplotlib 활용, BeautifulSoup를 활용한 Web Crawling");
        MainPageInfo skill02 = new MainPageInfo(R.drawable.javascript, "JavaScript", "Fetch API를 활용한 JSON 비동기 통신");
        MainPageInfo skill03 = new MainPageInfo(R.drawable.vue, "Vue.js", "Axios를 활용한 JSON 비동기 통신과 Vue Router를 통한 SPA Web 서비스");
        MainPageInfo skill04 = new MainPageInfo(R.drawable.node, "Express", "Express를 통한 API Server 운용 Request와 cheerio, iconv를 활용한 Crawling 서비스");


        ArrayList<MainPageInfo> skillList = new ArrayList<>();

        skillList.add(skill01);
        skillList.add(skill02);
        skillList.add(skill03);
        skillList.add(skill04);

        mainPageAdapter = new MainPageAdapter(skillList, rootView.getContext());

        ListView listview = rootView.findViewById(R.id.skill_list);
        listview.setAdapter(mainPageAdapter);

        return rootView;
    }
}
