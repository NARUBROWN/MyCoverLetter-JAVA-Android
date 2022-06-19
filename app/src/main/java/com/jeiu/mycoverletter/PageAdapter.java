package com.jeiu.mycoverletter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainPageAdapter extends BaseAdapter {

    // 매개변수 값을 저장하는 곳
    ArrayList<MainPageInfo> skillList;
    LayoutInflater skillInflater;
    Context skillContext = null;

    // 매개변수로 ArrayList 를 받음, Context 는 inflater 에 쓰려고 받는 거
    public MainPageAdapter(ArrayList<MainPageInfo> skill_List, Context skill_Context) {
        this.skillList = skill_List;
        this.skillContext = skill_Context;
        // Inflater 를 만들려면 Context 를 받아와야 함
        this.skillInflater = LayoutInflater.from(this.skillContext);
    }

    @Override
    public int getCount() {
        return skillList.size();
    }

    @Override
    public Object getItem(int position) {
        return skillList.get(position);
    }

    @Override
    public long getItemId(int position) {
        //icon_id 받아오기
        return skillList.get(position).skill_icon_id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //RecyclerView
        @SuppressLint({"ViewHolder", "InflateParams"}) View listView = skillInflater.inflate(R.layout.list_item_layout, null);
        // View listView = skillInflater.inflate(R.layout.list_item_layout, null);

        ImageView icon = (ImageView) listView.findViewById(R.id.icon);
        TextView skillName = (TextView) listView.findViewById(R.id.skillName);
        TextView skillInfo = (TextView) listView.findViewById(R.id.skillInfo);

        icon.setImageResource(skillList.get(position).getSkill_icon_id());
        skillName.setText(skillList.get(position).getSkill_name());
        skillInfo.setText(skillList.get(position).getSkill_info());

        return listView;
    }
}
