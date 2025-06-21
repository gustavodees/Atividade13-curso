# Simples Menu Interativo

Este é um programa Java simples que simula um menu interativo para pedir lanches. Ele utiliza a biblioteca Swing para exibir janelas de diálogo para interação com o usuário.

## Descrição

O programa apresenta um menu com as seguintes opções:

1.  Cachorro Quente - R$ 4.00
2.  X-Salada - R$ 4.50
3.  X-Bacon - R$ 5.00
4.  Torrada Simples - R$ 2.00
5.  Refrigerante - R$ 1.50

O usuário escolhe uma opção digitando o número correspondente. Em seguida, é solicitado que ele informe a quantidade desejada do item selecionado. Ao final, o programa calcula e exibe o valor total da compra.

## Como Executar

Para executar este código, você precisará ter o Java Development Kit (JDK) instalado em seu sistema. Siga os passos abaixo:

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. Certifique-se de que a estrutura de pastas seja `principal/Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até a pasta onde você salvou o arquivo `principal` e execute o seguinte comando para compilar o código:

    ```bash
    javac principal/Main.java
    ```

    Isso criará um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o seguinte comando:

    ```bash
    java principal.Main
    ```

    Uma janela de diálogo aparecerá com o menu de opções.

## Como Usar

1.  Ao executar o programa, uma janela de diálogo mostrará o menu com os itens disponíveis e seus respectivos preços.
2.  Digite o número correspondente à opção desejada e clique em "OK".
3.  Outra janela de diálogo será exibida, solicitando a quantidade do item selecionado. Digite a quantidade desejada e clique em "OK".
4.  Uma última janela de diálogo mostrará o valor total a ser pago.
5.  O programa será encerrado após exibir o total.

**Observação:** Este programa executa apenas um pedido por vez. Para realizar múltiplos pedidos ou adicionar mais funcionalidades, o código precisaria ser modificado.

## Explicação do Código

* `package principal;`: Declara o pacote ao qual a classe `Main` pertence.
* `import javax.swing.*;`: Importa a biblioteca Swing, que fornece classes para criar interfaces gráficas, como janelas de diálogo.
* `public class Main { ... }`: Define a classe principal do programa.
* `public static void main(String[] args) { ... }`: O método principal onde a execução do programa começa.
* `double total = 0;`: Declara e inicializa uma variável para armazenar o valor total do pedido.
* `JOptionPane.showInputDialog(...)`: Exibe uma janela de diálogo para obter a entrada do usuário (a escolha do item e a quantidade).
* `Integer.parseInt(...)`: Converte a entrada do usuário (que é uma String) para um número inteiro.
* `if-else if`: Uma série de condições para verificar a opção escolhida pelo usuário e calcular o total com base no preço do item e na quantidade.
* `JOptionPane.showMessageDialog(...)`: Exibe uma janela de diálogo com uma mensagem para o usuário, neste caso, mostrando o valor total a ser pago.
