#include <stdio.h>

int main() {
    
    // Declarar as variáveis
    char nome[50];
    int idade;
    int a;
    int b;
    int sum;

    printf("Digite o primeiro valor: ");
    scanf("%d",&a);
    printf("Digite o segundo valor: ");
    scanf("%d",&b);
    sum = a + b;
    printf("A soma entre A e B e: %d ",sum);



    //Informe o seu nome
    printf("Digite o seu nome: ");
    scanf("%s",&nome); //Apontar para aonde a variável vai ser amarzenada na memória

    //Exibir o nome
    printf("O seu nome e %s",nome);


}   


















//Tipos de dados
/*
Char
Int
Float
Double
Void
*/

//Especificadores de formato básico
/*
%d - Int
%f - Float
%lf - Double
%c - Char

*/