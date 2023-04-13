public class App {
    public static void main(String[] args) throws Exception {
        final String BR = "Brasil";
        
        String primeiroNome = "Cesar";

        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        int anoDeNascimento = 2001;
        
        boolean namorando = true;

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
