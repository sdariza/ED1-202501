public class Methods {
    /**
     * Esta función valida que el código sea un número entero
     * 
     * @param cod es la identificación de un estudiantr
     * @return false si no es válida, true si es válida
     */
    public boolean validaTamCod(String cod) {
        return cod.length() > 0 && cod.length() <= 9;
    }

    public boolean validateNums(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!(cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57)) {
                return false;
            }
        }
        return true;
    }

    public boolean validateName(String name) {
        return name.length() > 0 && name.length() <= 20;
    }

    public boolean validaTamNroCandidato(String nroCandidato) {
        return nroCandidato.length() > 0 && nroCandidato.length() <= 2;
    }

    public boolean validateNroCandidato(String nroCandidato) {
        if (validateNums(nroCandidato)) {
            int num = Integer.parseInt(nroCandidato);
            return num >= 1 && num <= 12;
        }
        return false;
    }
}
