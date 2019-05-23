package dominio;

public class ValidarContrasenia {

	public static boolean esLargoValido(String passNoValida01) {
		if (passNoValida01 == null)
			return false;
		
		if (passNoValida01.length() < 10)
			return false;
		else
			return true;
	}

	public static boolean DosLetrasMinuscula(String passNoValida01) {
		(passNoValida01.length()?:*[a-z]){2}
		return true;
	}

}
