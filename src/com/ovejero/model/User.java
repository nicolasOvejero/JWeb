package com.ovejero.model;


/*
** Class User pour stoquer les information des utilisateur
** non, prenom, login, pass, adresse, mail, niveau d'accès, news letter
*/
public class User {
    private String login;
    private String password;
    private String name;
    private String surname;
    private String adress;
    private String email;
    private int level;
    private int news;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String motDePasse) {
        this.password = motDePasse;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNews() { return news; }

    public void setNews(int news) {
        this.news = news;
    }
}
