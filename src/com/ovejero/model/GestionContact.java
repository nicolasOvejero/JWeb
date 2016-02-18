package com.ovejero.model;

import com.ovejero.email.Email;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
** Class pour gerer la page contact
*/
public class GestionContact {
    private static final String CHAMP_EMAIL = "email";
    private static final String CHAMP_SUJET = "subject";
    private static final String CHAMP_NOM = "name";
    private static final String CHAMP_PRENOM = "surname";
    private static final String CHAMP_MSG = "message";
    private Map<String, String> error = new HashMap<String, String>();
    private Map<String, String> value = new HashMap<String, String>();
    private String result;

    public String getResult() {
        return result;
    }

    public Map<String, String> getError() {
        return error;
    }

    public Map<String, String> getValue() {
        return value;
    }

    private void setError(String champ, String message) {
        error.put(champ, message);
    }

    /*
    ** Fonction pour la recuperation des info et l'envoi de mail
    */
    public void GetInfo(HttpServletRequest request) {
        String name = getValueChamp(request, CHAMP_NOM);
        String surname = getValueChamp(request, CHAMP_PRENOM);
        String email = getValueChamp(request, CHAMP_EMAIL);
        String sujet = getValueChamp(request, CHAMP_SUJET);
        String msg = getValueChamp(request, CHAMP_MSG);

        try {
            validationEmail(email);
            value.put(CHAMP_EMAIL, email);
        } catch (Exception e) {
            setError(CHAMP_EMAIL, e.getMessage());
        }

        try {
            validation(name, "Nom");
            value.put(CHAMP_NOM, name);
        } catch (Exception e) {
            setError(CHAMP_NOM, e.getMessage());
        }

        try {
            validation(surname, "Prenom");
            value.put(CHAMP_PRENOM, surname);
        } catch (Exception e) {
            setError(CHAMP_PRENOM, e.getMessage());
        }

        try {
            validation(sujet, "Sujet");
            value.put(CHAMP_SUJET, sujet);
        } catch (Exception e) {
            setError(CHAMP_SUJET, e.getMessage());
        }

        try {
            validation(msg, "Message");
            value.put(CHAMP_MSG, msg);
        } catch (Exception e) {
            setError(CHAMP_MSG, e.getMessage());
        }

        if (error.isEmpty()) {
            result = "Votre mail a bien ete envoye.";
        } else {
            result = "Vous n'avez pas remplis tout les champs.";
        }

        Email message = new Email();
        message.sendEmail(sujet, "Bonjour,\n\nVous avez recu un mail de " + name + " " + surname +
                ".\n\nLe mail est le suivant : " + msg + "\n\nSon adresse mail est la suivante : " + email);
    }

    /*
    ** Fonction pour vérifier les mails
    */
    private void validationEmail(String email) throws Exception {
        if (email != null) {
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new Exception("Merci de saisir une adresse mail valide.");
            }
        } else {
            throw new Exception("Votre adresse mail est mal renseigne.");
        }
    }

    /*
    ** Fonction pour valider les mails
    */
    private void validation(String champ, String name) throws Exception {
        if (champ == null || (champ != null && champ.length() < 2)) {
            throw new Exception("Le " + name + " est mal rensigne");
        }
    }

    /*
    ** Fonction pour récupérer les valeur d'un input du formulaire
    */
    private String getValueChamp(HttpServletRequest request, String champ) {
        String value = request.getParameter(champ);
        if (value == null || value.trim().length() == 0) {
            return null;
        } else {
            return value.trim();
        }
    }
}