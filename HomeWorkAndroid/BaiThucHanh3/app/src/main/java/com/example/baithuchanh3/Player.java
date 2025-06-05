package com.example.baithuchanh3;

public class Player {

    private String member_code;
    private String username;
    private String avatar;
    private String birthday;
    private String hometown;
    private String residence;

    private double rating_single;
    private double rating_double;

    public Player() {
    }

    public Player(String username, String member_code, String hometown) {
        this.member_code = member_code;
        this.username = username;
        this.hometown = hometown;
    }

    // Getter và Setter
    public String getMember_code() {
        return member_code;
    }

    public void setMember_code(String member_code) {
        this.member_code = member_code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public double getRating_single() {
        return rating_single;
    }

    public void setRating_single(double rating_single) {
        this.rating_single = rating_single;
    }

    public double getRating_double() {
        return rating_double;
    }

    public void setRating_double(double rating_double) {
        this.rating_double = rating_double;
    }
}
