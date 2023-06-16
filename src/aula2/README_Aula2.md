### O que são laços condicionais ?
Laços Condicionais ou Estruturas de Decisão, são estruturas que nos ajudam na tomada de decisão. Nós utilizamos essas estruturas sempre que o programa tiver que executar uma sequência de ações que poderão ser executadas ou não, dependendo do resultado de um ou um conjunto de testes lógicos, que permitirá que um dos casos seja executado.

Exemplos:
Se o numero digitado for maior do que 10 🡒 Exibir na tela o número digitado é maior do que 10
Se a média for maior do que 5 e menor do que 7 🡒 Exibir na tela alune de exame!

Existem 3 estruturas básicas de Laços Condicionais em Java:
- Estrutura IF
- Estrutura IF / ELSE
- Estrutura SWITCH CASE

Vale reforçar que a aplicação de cada uma dessas estruturas dependerá do contexto de utilização. Além disso, essas estruturas também permitem inserir, dentro de seu escopo, a execução de:

- Cálculos; 
- Outros Laços Condicionais;
 <br>

### ESTRUTURA IF ⚪
O Laço Condicional IF é o laço condicional mais simples e um dos mais utilizados em situações em que se faz necessário testar uma única condição e/ou variável, que caso seja verdadeira, irá desencadear a execução de um ou mais processamentos ou saídas de dados.
<br>
**Sintaxe:**
~~~java
if (condição) {
 // Executa alguma ação caso a condição seja verdadeira
}
~~~

Neste Laço Condicional temos basicamente um teste (condição) e um grupo de ações que somente acontecerão se a resposta for verdadeira.
Para criar a condição, geralmente são utilizados os operadores da linguagem Java, principalmente os operadores relacionais. 

Na imagem abaixo, temos o Fluxograma básico do Laço Condicional IF:
<div>
  <img src="https://dkrn4sk0rn31v.cloudfront.net/uploads/2020/10/Estrutura-Condicional-Simples.png">
</div> 

<br>

A condição do IF está informada dentro do conjunto de parênteses ( condição ), tudo que está inserido dentro dos parênteses precisa ser verdadeiro para que as ações inseridas dentro bloco do IF sejam processadas. Caso a condição não seja verdadeira, as ações inseridas dentro do bloco IF serão ignoradas no momento da execução do código.
Vale reforçar também que a condição pode ser uma instrução simples ou uma instrução composta. Uma instrução composta consiste em duas ou mais condições que podem ser verdadeiras ou não, dependendo da lógica empregada, para que a ação seja executada. <br>
<br>
<br>

### ESTRUTURA IF/ELSE 🔵
A estrutura IF também permite a execução de um ou mais processamentos ou saídas de dados para o caso em que a condição do laço condicional não seja satisfeita (falso). Para executarmos operações, caso a condição seja falas, utilizaremos a instrução ELSE (Senão).
A instrução ELSE, em conjunto com a estrutura IF, permite criar uma resposta tanto para a condição verdadeira, quanto para a condição falsa.

**Sintaxe:**
~~~java
if (condição) {
    // Executa alguma ação caso a condição seja verdadeira
} else {
    // Executa alguma ação caso a condição anterior anterior seja falsa
}
~~~
Este Laço Condicional é muito utilizado em situações em que se faz necessário testar uma única condição/variável, que caso seja verdadeira, irá desencadear a realização de um ou mais comandos e caso seja falsa, irá desencadear um outro conjunto de um ou mais comandos.
Temos então um teste e dois blocos de ações possíveis:
- Um Bloco que será executado se a condição for verdadeira;
- Um outro Bloco que será executado se a condição for falsa.

Veja o fluxograma abaixo:
<div>
  <img src="https://camo.githubusercontent.com/945d2a0a779d642f3eda9ffeba8b58765adc66fbe5cac013c7f402f564b14a69/68747470733a2f2f692e696d6775722e636f6d2f6d4b6e453965412e706e67">
</div><br>
Este Laço Condicional é muito utilizado em situações em que se faz necessário testar várias condições/variáveis, onde cada condição é testada uma a uma até que uma delas seja satisfeita e o seu respectivo Bloco de comandos é executado. Se nenhuma condição for satisfeita, o Bloco ELSE será executado.
Importante destacar que se uma condição for verdadeira, as demais condições do Laço Condicional não serão testadas.
<br><br>

**OBS:**
O Laço condicional IF permite incluir em um algoritmo quantos "IF's" forem necessários. Entretanto, nestes casos, o ELSE será uma condição obrigatória, que será executada caso todas as condições anteriores tenham sido descartadas por se tratarem de condições falsas. Para criar condições intermediárias dentro do Laço Condicional IF, utilizaremos a combinação ELSE IF.
**Sintaxe:** 
~~~java
if (condição 1) {
    // Executa alguma ação caso a condição seja verdadeira
} else if (condição 2) {
    // Executa alguma ação caso a condição anterior seja falsa
} else if (condição N) {
    // Executa alguma ação caso as condições anteriores sejam falsas
} else {
    // Executa alguma ação caso todas as condições anteriores sejam falsas
}
~~~
<br>
<br>

### ESTRUTURA SWITCH CASE 🟢
Switch Case, também é um laço condicional, ou seja, uma estrutura de decisão, onde podemos através de premissas indicar qual ação deve-se ter conforme a opção escolhida. Em outras palavras, Switch Case é um Laço Condicional, que define o código a ser executado com base em uma comparação de valores.

**Sintaxe:**
~~~java
switch (variavel ou valor) {
  case valor1:
    //executa alguma ação caso esta condição seja verdadeira
    break;
  case valor2:
    //executa alguma ação caso esta condição seja verdadeira
    break;
  case valorN:
    //executa alguma ação caso esta condição seja verdadeira
    break;
  default:
    //Opcional = executa alguma ação caso todas as condições anteriores forem falsas
    break;
}
~~~

O Laço Condicional SWITCH CASE representa de uma maneira mais simples o encadeamento de estruturas IF. É uma forma de reduzir a complexidade de várias estruturas IF encadeadas.
O conteúdo da variável da cláusula do SWITCH é comparado com os valores constantes das cláusulas CASE, e caso uma das comparações seja verdadeira, o comando associado é executado (somente esse comando). Caso nenhuma comparação seja Verdadeira, a estrutura executará a cláusula DEFAULT. 
<br>Este laço é muito utilizado na construção de Menus de opções, onde o usuário digita uma letra ou um número para a escolher um item do Menu.

Veja o fluxograma abaixo:
<div>
  <img src="https://camo.githubusercontent.com/a7309f47fe1d8fbb302a325e480f381f465dde32f5a018c3f7a75a4e401e321c/68747470733a2f2f692e696d6775722e636f6d2f6c3847625142362e706e67">
</div>
Algumas regras importantes para instruções SWITCH CASE:<br>

- Valores de cases duplicados não são permitidos.
- O valor para um case deve ser do mesmo tipo de dado que a variável inserida na instrução switch.
- O valor para um case deve ser uma constante ou literal. Variáveis ou testes lógicos não são permitidos.
- A instrução break é usada dentro do case para encerrar uma sequência de instruções.
- A instrução break é opcional. Se omitido, a execução continuará no próximo case.
- A instrução default é opcional.
<br>

<div style="display: flex; align-items: center;">
  <a href="https://github.com/mateuzu/Turma65_Generation#readme"> Voltar ⬅️ </a>
  <br>
  <a href="teste"> Avançar ➡️ </a>
</div>


