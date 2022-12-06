package ifmg.pfront.chatbot;

public class RoboBasico implements InterfaceRoboPobre{
    private int caminho=1;
    public int processarTexto(String val){

        switch(caminho){
            case 1:{
                return fluxo1(val);
            }
            case 2:{
                return 0;
            }
            default:{
                System.out.println("Ainda não sei responder essa pergunta. Vou ter que desconectar. Até breve!");
                return 0;
            }
        }
    }

    public int fluxo1(String val){
        if(val.contains("eu")){
            System.out.println("A responsabilidade é sua. Se vira!");
            return 1;
        }
        if(val.contains("você") || val.contains("voce")){
            System.out.println("Eu não tenho nada a ver com isso.");
            return 1;
        }
        if(val.contains("matematica") || val.contains("matemática") || val.contains("conta")){
            System.out.println("Vou chamar o robô matemático para te ajudar!");
            System.out.println("Olá, sou o robô matemático! Escreva sua equação e eu tentarei resolver.");
            System.out.println("No momento sei resolver operações de: ");
            System.out.println("soma, subtração, multiplicação e divisão de dois números.");
            System.out.println("Para voltar para o menu principal digite 'voltar'");
            return -2;
        }
        if(val.contains("voltar")){
            System.out.println("De volta ao robô alienígena!");
            return -1;
        }
        if(val.contains("sou chique")){
            System.out.println("Vou chamar o robô premium.");
            return -3;
        }
        else{
            System.out.println("Tudo bem. Como quiser.");
            return 1;
        }
    }
}
