package questao3;

public class ValidadorSenha {
    public boolean validar(String senha) {
        return temTamanhoValido(senha) && temNumero(senha) && temMaiuscula(senha);
    }

    private boolean temTamanhoValido(String senha) {
        return senha.length() >= 8;
    }

    private boolean temNumero(String senha) {
        return senha.matches(".*\\d.*");
    }

    private boolean temMaiuscula(String senha) {
        return senha.matches(".*[A-Z].*");
    }

    public static void main(String[] args) {
        ValidadorSenha validador = new ValidadorSenha();
        String senha = "Senha123";
        boolean resultado = validador.validar(senha);
        System.out.println("Senha válida? " + resultado);
    }
}
