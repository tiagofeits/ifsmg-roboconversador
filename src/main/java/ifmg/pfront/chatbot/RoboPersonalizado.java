package ifmg.pfront.chatbot;

public class RoboPersonalizado
        extends RoboMatematico
        implements InterfaceRoboPremium {
    private int caminho=2;
    public int processarTexto(String val){

        switch(caminho){
            case 1:{
                return fluxo1(val);
            }
            case 2:{
                return fluxo2(val);
            }
            default:{
                System.out.println("Ainda não sei responder essa pergunta. Vou ter que desconectar. Até breve!");
                return 0;
            }
        }
    }
    public int fluxo2(String val){
        if(val.contains("piada")){
            System.out.println("Escolha o tema da sua piada!");
            return 1;
        }
        if(val.contains("galinha")){
            System.out.println("A galinha faz cocó, e o frango faz cocô.");
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
        if(val.contains("ganso")){
            System.out.println("O ganso comeu uma maçã e se engasgou.");
            return 1;
        }
        if(val.contains("bode")){
            System.out.println("Nunca coloque um bode na sala. Ele vai comer o sofá.");
            return 1;
        }
        if(val.contains("et")){
            System.out.println("Não acredito em alienígenas. Eles são muito mentirosos.");
            return 1;
        }
        else{
            System.out.println("Só sei contar piadas...");
            return 1;
        }
    }
}
