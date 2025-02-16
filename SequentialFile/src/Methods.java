public class Methods {
    /**
     * The function "validaTamCod" in Java checks if the length of a given string is
     * between 1 and 9
     * characters.
     * 
     * @param cod The method `validaTamCod` takes a parameter `cod` of type String.
     *            It checks if the length
     *            of the `cod` string is greater than 0 and less than or equal to 9.
     *            If both conditions are met, the
     *            method returns true, indicating that the length of the
     * @return The method is returning a boolean value, which is determined by
     *         whether the length of the
     *         input string "cod" is greater than 0 and less than or equal to 9.
     */
    public boolean validaTamCod(String cod) {
        return cod.length() > 0 && cod.length() <= 9;
    }

    /**
     * The function `validateNums` checks if a given string contains only numeric
     * characters.
     * 
     * @param cadena The `validateNums` method you provided checks if a given string
     *               `cadena` contains only
     *               numeric characters (0-9). It iterates through each character in
     *               the string and returns `false` if
     *               any character is not a digit. Otherwise, it returns `true`
     *               indicating that all characters are
     * @return The `validateNums` method returns a boolean value. It returns `true`
     *         if all characters in
     *         the input string `cadena` are numeric digits (0-9), and `false` if
     *         there is at least one character
     *         that is not a numeric digit.
     */

    public boolean validateNums(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!(cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57)) {
                return false;
            }
        }
        return true;
    }

    /**
     * The function "validateName" checks if a given name is between 1 and 20
     * characters long.
     * 
     * @param name The `validateName` method checks if the length of the `name`
     *             parameter is greater than 0
     *             and less than or equal to 20. If the length of the `name` is
     *             within this range, the method returns
     *             `true`, indicating that the name is valid.
     * @return The method `validateName` returns a boolean value, which is `true` if
     *         the length of the
     *         input `name` is greater than 0 and less than or equal to 20, and
     *         `false` otherwise.
     */

    public boolean validateName(String name) {
        return name.length() > 0 && name.length() <= 20;
    }

    /**
     * The function `validaTamNroCandidato` checks if the length of a candidate
     * number is between 1 and 2
     * characters.
     * 
     * @param nroCandidato The method `validaTamNroCandidato` is used to validate
     *                     the length of a candidate
     *                     number. It checks if the length of the candidate number
     *                     is greater than 0 and less than or equal to
     *                     2. If the length meets this criteria, the method returns
     *                     `true`, indicating
     * @return The method is returning a boolean value, which indicates whether the
     *         length of the input
     *         string "nroCandidato" is greater than 0 and less than or equal to 2.
     */
    public boolean validaTamNroCandidato(String nroCandidato) {
        return nroCandidato.length() > 0 && nroCandidato.length() <= 2;
    }

    /**
     * The function `validateNroCandidato` checks if a given candidate number is a
     * valid number between 1
     * and 12.
     * 
     * @param nroCandidato The method `validateNroCandidato` is used to validate a
     *                     candidate number. The
     *                     candidate number should not be empty, should consist of
     *                     only numbers, and should be between 1 and 12
     *                     inclusive. If any of these conditions are not met, the
     *                     method will return false.
     * @return The method `validateNroCandidato` returns a boolean value, which
     *         indicates whether the input
     *         `nroCandidato` is a valid candidate number.
     */
    public boolean validateNroCandidato(String nroCandidato) {
        if (nroCandidato.isEmpty()) {
            return false;
        }
        if (validateNums(nroCandidato)) {
            int num = Integer.parseInt(nroCandidato);
            return num >= 1 && num <= 12;
        }
        return false;
    }
}
