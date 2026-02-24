# 📺 Video Player Lab

Este é um projeto de laboratório desenvolvido para explorar as capacidades fundamentais de reprodução de vídeo nativo no **Android**. O objetivo principal é demonstrar a implementação simplificada de um player utilizando recursos locais e componentes padrão do SDK Android.

---

## 🚀 Tecnologias e Componentes Utilizados

Para este laboratório, focamos em quatro pilares principais da API de vídeo:

* **VideoView:** O componente de interface responsável por renderizar os frames do vídeo e gerenciar a superfície de exibição.
* **MediaController:** Implementação padrão que fornece os controles de reprodução ao usuário (Play/Pause, Barra de Progresso, Avançar/Retroceder).
* **URI (Uniform Resource Identifier):** Utilizada para localizar e referenciar o arquivo de vídeo dentro do pacote do aplicativo.
* **Raw Resources:** O vídeo utilizado neste projeto está armazenado localmente na pasta `res/raw`, garantindo que o app funcione sem dependência de conexão externa.

---

## 🛠️ Como o laboratório funciona

O fluxo de execução do projeto segue esta lógica técnica:

1.  **Identificação do Recurso:** O sistema busca o identificador numérico do vídeo armazenado em `res/raw`.
2.  **Construção da URI:** Uma string de caminho é formatada no padrão `android.resource://[package]/[resource_id]`.
3.  **Configuração do Player:**
    * O `VideoView` recebe a URI configurada.
    * O `MediaController` é instanciado e vinculado ao `VideoView` para permitir a interação do usuário.
4.  **Execução:** O vídeo é carregado e o método `start()` é invocado para iniciar a reprodução.

---
> *Este projeto foi desenvolvido para fins de estudo e prática de desenvolvimento Android.*