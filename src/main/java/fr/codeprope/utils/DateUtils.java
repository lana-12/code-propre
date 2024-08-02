package fr.codeprope.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Permet de formatter une date
 */
public final class DateUtils {

    /**
     * Pattern de formatage par default
     */
    private static final String DEFAULT_FORMAT = "dd/MM/yyyy";

    /**
     * Formate la date en String avec le pattern par défaut
     *
     * @param date date à formater
     * @return String
     */
    public static String convertDate(Date date) {
        return convertDate(date, DEFAULT_FORMAT);
    }

    /**
     * Formatte la date en String avec un pattern imposé
     *
     * @param date    date
     * @param pattern pattern
     * @return String
     */
    public static String convertDate(Date date, String pattern) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);

    }
}
