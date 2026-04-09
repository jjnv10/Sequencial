## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

int lista[] = {31, 1, 32, 3, 4, 25, 6, 72, 8, 9, 10};
        int valor = 25;
        int resultado = Pesquisar.buscaSequencial(lista, valor);
        System.out.println("Valor encontrado na posição: " + resultado);
        Arrays.sort(lista);
        System.out.println("Lista ordenada: " + Arrays.toString(lista));
        resultado = Pesquisar.buscaBinaria(lista, valor);
        System.out.println("Valor encontrado na posição: " + resultado);
