package ifmg.pfront.chatbot;

public class RoboMatematico extends RoboBasico{
    private int caminho=2;
    public int processarTexto(String val){
        if(val.equals("voltar")) caminho=1;
        switch(caminho){
            case 1:{
                return fluxo1(val);
            }
            case 2:{
                return fluxoMat(val);
            }
            default:{
                System.out.println("Ainda não sei responder essa pergunta. Vou ter que desconectar. Até breve!");
                return caminho;
            }
        }
    }

    public int validarEquacao(String val){
        String[] numeros=null;
        int val1 = 0;
        int val2 = 0;
        int operacao =0;
        try {
            if(val.contains("+")){
                numeros = val.split("\\+");
                operacao=1;
            }
            if(val.contains("-")){
                numeros = val.split("-");
                operacao=2;
            }
            if(val.contains("*")){
                numeros = val.split("\\*");
                operacao=3;
            }
            if(val.contains("/")){
                numeros = val.split("/");
                operacao=4;
            }
            if(numeros.length == 2){
                val1 = Integer.parseInt(numeros[0]);
                val2 = Integer.parseInt(numeros[1]);
                switch (operacao){
                    case 1:{
                        return val1 + val2;
                    }
                    case 2:{
                        return val1 - val2;
                    }
                    case 3:{
                        return val1 * val2;
                    }
                    case 4:{
                        return val1 / val2;
                    }
                }
            }
            System.out.println("Equação inválida. Tente novamente! " +
                    "No momento suportamos operações de: ");
            System.out.println("soma, subtração, multiplicação e divisão de dois números.");
            return 0;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public int fluxoMat(String val){
        Object resultado;
        try {
            resultado=validarEquacao(val);
            System.out.println("A resposta para sua equação é: " + resultado.toString());
            caminho=2;
            return 1;
        } catch (Exception e) {
            System.out.println("Equação inválida. Tente novamente! " +
                    "No momento suportamos operações de: ");
            System.out.println("soma, subtração, multiplicação e divisão de dois números.");
            caminho=1;
            return 1;
        }
    }
}
