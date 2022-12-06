# Instituto Federal do Sudeste de Minas

Atividade para a disciplina de Desenv. de Aplicações Móveis

**Tiago Feitosa - Pólo Rio Pomba**

## Desenvolvimento de um chatbot. Esse chatbot possui três implementações distintas:
- Robô básico: responde às palavras chave e direciona para os outros;
- Robô matemático: faz contas super básicas, e herda os métodos do básico;
- Robô personalizado: faz piadas sem graça, e herda as funções dos outros 2.

## Funcionamento
- As palavras chave a seguir encerram a interação com o robô: sair, quit, exit, end, stop, fim;
- Enviar frases em maiúsculo irá irritar o pobre coitado, que após 3 frases assim irá se auto encerrar;
- Qualquer frase com o pronome "eu" irá resultar na mensagem: A responsabilidade é sua. Se vira!
- Qualquer frase com o pronome "voce" irá resultar na mensagem: Eu não tenho nada a ver com isso.
- Qualquer frase com as palavras chave "matematica", "conta" irá chamar o robô matemático. Esse robô faz contas de somar, dividir, subtrair, e multiplicar entre dois números. Qualquer equação distinta será ignorada;
- A palavra chave "voltar" retorna ao robô básico;
- Qualquer frase que contenha a sentença "sou chique" irá chamar o robô personalizado(premium). Esse robô é um sarrista e conta piadas sem graça;
