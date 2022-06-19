package com.jeiu.mycoverletter;

public class MainPageInfo {

    // Drawable에 있는 이미지 정보를 담아 놓을 속성

    int skill_icon_id;
    public String skill_name;
    private String skill_info;

    //내가 가진 기술 정보
    public MainPageInfo(int icon_id, String name, String info) {
        this.skill_icon_id = icon_id;
        this.skill_name = name;
        this.skill_info = info;
    }

    public  int getSkill_icon_id() {
        return skill_icon_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public String getSkill_info() {
        return skill_info;
    }
}
