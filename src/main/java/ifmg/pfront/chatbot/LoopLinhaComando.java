package ifmg.pfront.chatbot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class LoopLinhaComando {
    private static final int LIMITE_PACIENCIA = 3;
    private final Pattern caps = Pattern.compile(".*[A-Z].*");
    private RoboBasico marciano = new RoboBasico();
    private RoboPersonalizado chiquetoso = new RoboPersonalizado();
    private RoboMatematico skynet = new RoboMatematico();
    private BufferedReader br;
    public int robo=0;
    public int resultado=0;
    private int maleducado=0;
    private boolean continuar=false;
    public LoopLinhaComando(){
        this.br=new BufferedReader(new InputStreamReader(System.in));
    }
    private void validarResposta(int val){
        switch(val) {
            //chamar robô básico
            case -1: {
                robo=1;
                continuar=true;
                break;
            }
            //chamar robô calculadora
            case -2: {
                robo=2;
                continuar=true;
                break;
            }
            //chamar robô premium
            case -3: {
                robo=3;
                continuar=true;
                break;
            }
            case 0: {
                continuar=false;
                break;
            }
            default: {
                continuar=true;
                break;
            }
        }
    }
    public void run() throws IOException{
        String linha="";

        System.out.println("************************************TAF COMPUTER CORP - CHATBOT***********************************");
		System.out.println("*******************************DIGITE SAIR PARA ENCERRAR O PROGRAMA*******************************");
        System.out.println("**************************************************************************************************");
        System.out.println("***************BEM VINDO(A) AO SISTEMA DE ATENDIMENTO TAF CORP.: DIGITE SUA PERGUNTA**************");
        while(true){
            System.out.print("> ");
            linha = br.readLine().trim();
            if(caps.matcher(linha).matches()) {
                System.out.println("Escrever com letras maiúsculas é uma forma de gritar em mensagens de texto. Por favor evite de fazer isso.");
                maleducado++;
                if(maleducado>LIMITE_PACIENCIA){
                    System.out.println("Já chega. Esgotou minha paciência.");
                    break;
                }
            }
            else{
                if(linha.isEmpty()){
                    System.out.println("Não me incomode!");
                }
            }
            linha=linha.toLowerCase();
            switch(linha){
                default:{
                    switch(robo){
                        case 2:{
                            validarResposta(skynet.processarTexto(linha.toLowerCase()));
                            break;
                        }
                        case 3:{
                            validarResposta(chiquetoso.processarTexto(linha.toLowerCase()));
                            break;
                        }
                        default:{
                            validarResposta(marciano.processarTexto(linha.toLowerCase()));
                            break;
                        }
                    }
                    break;
                }
                case "sair":
                case "quit":
                case "exit":
                case "end":
                case "stop":
                case "fim":{
                    continuar=false;
                    break;
                }
            }
            if(!continuar) break;
        }
    }
}
