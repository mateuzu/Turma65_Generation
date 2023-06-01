### Conceitos Aula 1 - Variáveis/Constantes e Entrada/Saída de dados: 
<br>
<div>
Variáveis:

- Uma variável é um local na memória do computador onde você pode armazenar um valor
- Elas são usadas para armazenar dados que podem ser alterados durante a execução do programa.
- Antes de usar uma variável, você deve declará-la, especificando seu tipo e nome.
Exemplos de tipos de variáveis em Java são int (números inteiros), double (números decimais), String (sequências de caracteres) e boolean (valores verdadeiro ou falso).

Constantes:
- Uma constante é um valor que não pode ser alterado depois de atribuído.
- Elas são usadas para armazenar dados que não devem ser modificados durante a execução do programa.
- Em Java, as constantes são declaradas usando a palavra-chave final antes do tipo da variável.
Por convenção, os nomes das constantes são escritos em letras maiúsculas.
<br>
</div>

Entrada e saída de dados:
Todo o programa de computador é composto por 3 elementos básicos:

<div>

- Entrada: Responsável por obter informações do usuário por meio do teclado, ou seja, é um Comando de Entrada de Dados. Exemplo: Digite 2 números:
- Processamento: São as instruções do algoritmo responsáveis por processar as informações. Exemplo: Calcule a média dos 2 números digitados pelo usuário.
- Saída: Responsável por mostrar os resultados do processamento na Tela do Computador, ou seja, é um Comando de Saída de Dados. Exemplo: Exibir na tela (console) o resultado do cálculo da média.
<br>
</div>
<br>

### Métodos de saída:
Os Métodos printf(), print() e println(), que pertencem a Classe System, são utilizados para mostrar informações no console (na tela do computador), ou seja, são Métodos de Saída de Dados em tela.
Os Métodos de saída printf(), print() e println() utilizam o o dispositivo padrão de saída (System.out). out é uma variável da Classe System, que armazena a saída padrão do sistema, que geralmente é o Console.
- print()	"Permite exibir na tela uma cadeia de caracteres (String), sem se preocupar com a formatação, ou seja, do jeito que a String for enviada, ela será exibida."
- printf()	"Permite exibir os dados na tela formatados (data, hora, moeda, entre outros)"
- println()	Equivalente ao Método print(). A diferença é que sempre pulará uma linha após mostrar o valor na tela.
<br>

### Entrada de dados com a classe Scanner
<div>
A Classe Scanner é utilizada quando se deseja obter informações do usuário por meio do teclado, ou seja, é uma Classe que oferece alguns Métodos de Entrada de Dados. A Classe Scanner pertence ao Pacote java.util e para utilizarmos precisamos instanciar um Objeto desta Classe em nosso código, como mostra o trecho de código abaixo:
<br>
<br>
<div>
Sintaxe:<br>
Scanner leia = new Scanner(System.in);
</div>
<br>

O Objeto leia, da Classe Scanner, foi criado e instanciado para efetuar a leitura via teclado, usando o dispositivo padrão de entrada (System.in). in é uma variável da Classe System, que armazena a entrada padrão do sistema, que geralmente é o teclado, mas poderia ser um arquivo de texto também.
A Classe Scanner possui uma série de Métodos de leitura de dados via teclado, que será utilizado de acordo com o tipo de variável. Veja a tabela abaixo:

- String = next()	"Faz a leitura, via teclado, de uma cadeia de caracteres simples, ou seja, que não usa o caractere espaço em branco."
- next().charAt(0)	"Faz a leitura, via teclado, de um único caractere simples, exceto o caractere espaço em branco."
- String = nextLine()	"Faz a leitura, via teclado, de uma cadeia de caracteres, incluindo o caractere espaço em branco."
- int = nextInt()	"Faz a leitura, via teclado, de um número inteiro de 32 bits."
- long = nextLong()	"Faz a leitura, via teclado, de um número inteiro de 64 bits."
- float = nextFloat()	"Faz a leitura, via teclado, de um número em notação de ponto flutuante normalizada em precisão dupla de 32 bits (usado para receber valores reais)"
- double  = nextDouble()	"Faz a leitura, via teclado, de um número em notação de ponto flutuante normalizada em precisão dupla de 64 bits (usado para receber valores reais ou científicos)"
- boolean = nextBoolean()	"Faz a leitura, via teclado, de um valor boolean (true ou false)."
</div>
<br>

### Outros tópicos - Caracteres de escape e Expressões de controle
<div>
A Expressão de Controle é uma sequência de caracteres (portanto, delimitada por aspas duplas) que determina as informações que serão mostradas na tela. Nesta expressão podem existir dois tipos de informações:
Caracteres comuns, ou seja, um texto qualquer;
Códigos de controle (ou especificadores de formato).
Os códigos de controle, mostrados na tabela abaixo, são utilizados para indicar o tipo de dado que será impresso na tela. É importante destacar que deve existir para cada código de controle um argumento (Variável) correspondente.
</div>
<br>
<table>
  <tr>
    <th>Código</th>
    <th>Formato - tipos de dados</th>
  </tr>
  <tr>
    <td>%c</td>
    <td>Caractere simples (char)</td>
  </tr>
    <td>%s</<td>
    <td>Cadeia de caracteres (String)</td>
  </tr>
  <tr>
    <td>%d</td>
    <td>Inteiro (int ou long)</td>
  </tr>
  <tr>
    <td>%f</td>
    <td>Real com ponto flutuante (float ou double)</td>
  </tr>
  <tr>
    <td>%.2f</td>
    <td>Real com ponto flutuante (float ou double), delimitando o número de dígitos que serão exibidos nas casas decimais.
No exemplo ao lado, serão exibidos 2 dígitos depois do ponto (separador de casas decimais).</td>
  </tr>
  <tr>
    <td>%e</td>
    <td>Número real em notação científica com o “e” minúsculo (float ou double)
</td>
  </tr>
  <tr>
    <td>%E</td>
    <td>Número real em notação científica com o “E” maiúsculo (float ou double)
</td>
  </tr>
  <tr>
    <td>%%</td>
    <td>Imprimir o próprio caractere %
</td>
  </tr>
</table>

Caracteres de Escape são instruções inseridas geralmente no começo ou no final de um texto, para sinalizar uma interpretação alternativa de uma série de caracteres. No Java, um caractere precedido por uma barra invertida \ é uma sequência de escape. Veja a tabela abaixo:
<table>
  <tr>
    <th>Caractere Escape</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>\n</td>
    <td>Nova linha</td>
  </tr>
    <td>\t</<td>
    <td>Tabulação horizontal (o mesmo que pressionar a tecla Tab)</td>
  </tr>
  <tr>
    <td>\r</td>
    <td>"Retorno do carro". É um escape de controle, que move o cursor do Terminal para o inicio da linha."</td>
  </tr>
  <tr>
    <td>\b</td>
    <td>Backspace. Faz o papel da tecla Backspace do seu teclado: move o cursor uma posição ou excluí um único caractere a esquerda da linha.</td>
  </tr>
  <tr>
    <td>\'</td>
    <td>Aspas simples</td>
  </tr>
  <tr>
    <td>\"</td>
    <td>Aspas duplas</td>
  </tr>
  <tr>
    <td>\\</td>
    <td>Barra invertida</td>
  </tr>
  <tr>
</table>
<br>
<div style="display: flex; align-items: center;">
<a href="https://github.com/mateuzu/Turma65_Generation#readme"> Voltar ⬅️ 
</a>
<br>
<a href="teste"> Avançar ➡️ </a>
</div>





