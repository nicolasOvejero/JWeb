package com.ovejero.model;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
** Class pour gerer les inscription
*/
public final class GestionInscription {
    private static final String CHAMP_LOGIN = "newlogin";
    private static final String CHAMP_PASS = "newPass";
    private static final String CHAMP_NAME = "newNom";
    private static final String CHAMP_SURNAME = "newSurname";
    private static final String CHAMP_ADRESS = "newAdress";
    private static final String CHAMP_CITY = "newEmail";
    private static final String CHAMP_NEWS = "newsLetter";
    private String result;
    private Map<String, String> error = new HashMap<String, String>();

    public String getResult() {
        return result;
    }

    public Map<String, String> getError() {
        return error;
    }

    /*
    ** Fonction pour verifier et ajouter une personne en base
    */
    public User inscUser(HttpServletRequest request) {
        String login = getValeurChamp(request, CHAMP_LOGIN);
        String pass = getValeurChamp(request, CHAMP_PASS);
        String name = getValeurChamp(request, CHAMP_NAME);
        String surname = getValeurChamp(request, CHAMP_SURNAME);
        String adress = getValeurChamp(request, CHAMP_ADRESS);
        String email = getValeurChamp(request, CHAMP_CITY);
        String news = request.getParameter(CHAMP_NEWS);

        System.out.println(request.getParameter(CHAMP_NEWS));

        User user = new User();

        try {
            validation(login, "login");
        } catch (Exception e) {
            setError(CHAMP_LOGIN, e.getMessage());
            return null;
        }
        user.setLogin(login);

        try {
            validation(pass, "mot de passe");
        } catch (Exception e) {
            setError(CHAMP_PASS, e.getMessage());
        }
        user.setPassword(pass);

        try {
            validation(name, "nom");
        } catch (Exception e) {
            setError(CHAMP_NAME, e.getMessage());
        }
        user.setName(name);

        try {
            validation(surname, "nom");
        } catch (Exception e) {
            setError(CHAMP_SURNAME, e.getMessage());
        }
        user.setSurname(surname);

        try {
            validation(email, "ville");
        } catch (Exception e) {
            setError(CHAMP_CITY, e.getMessage());
        }
        user.setEmail(email);

        try {
            validation(adress, "nom");
        } catch (Exception e) {
            setError(CHAMP_ADRESS, e.getMessage());
        }
        user.setAdress(adress);

        if (news != null) {
            user.setNews(1);
        }
        else
        {
            user.setNews(0);
        }

        if (error.isEmpty()) {
            result = "Succes de l'inscription.";
        } else {
            result = "echec de l'inscription.";
        }
        return user;
    }

    /*
    ** Fonction pour vérifier les données
    */
    private void validation(String nom, String name) throws Exception {
        if (nom == null || (nom != null && nom.length() < 3)) {
            throw new Exception("Le champ : " + name + " est mal renseigne.");
        }
    }

    private void setError(String champ, String message) {
        error.put(champ, message);
    }

    /*
    ** Fonction pour récupérer les valeur du formulaire
    */
    private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
        String valeur = request.getParameter(nomChamp);
        if (valeur == null || valeur.trim().length() == 0) {
            return null;
        } else {
            return valeur.trim();
        }
    }
}