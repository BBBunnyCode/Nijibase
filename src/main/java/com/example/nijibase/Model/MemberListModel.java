package com.example.nijibase.Model;

public class MemberListModel {
    private String name;
    private String branch;
    private Boolean debut_3d;
    private int nick_id;
    private int social_media_id;
    private String illustrator;
    private String visual;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Boolean getDebut_3d() {
        return debut_3d;
    }

    public void setDebut_3d(Boolean debut_3d) {
        this.debut_3d = debut_3d;
    }

    public int getNick_id() {
        return nick_id;
    }

    public void setNick_id(int nick_id) {
        this.nick_id = nick_id;
    }

    public int getSocial_media_id() {
        return social_media_id;
    }

    public void setSocial_media_id(int social_media_id) {
        this.social_media_id = social_media_id;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getVisual() {
        return visual;
    }

    public void setVisual(String visual) {
        this.visual = visual;
    }
}
