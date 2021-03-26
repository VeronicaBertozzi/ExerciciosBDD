#language: pt

Funcionalidade: Acessar o site da Gama Academy
    Acessar o site da gama academy e navegar pelo site

    Cenario: Acessar o site da Gama Academy Product Owner
        Dado que eu acesso o site da Gama Academy "https://pages.gama.academy/curso-de-product-management/"
        E clico no botao transformadores
        Entao devo ver a foto Ronaldo Marciano
    
    Cenario: Acessar o site da Gama Academy 
        Dado que eu acesso o site da Gama Academy "https://www.gama.academy"
        E clico para fechar propaganda
        E clico no botao dev fullstack 
        Entao devo ver as opcoes
        |Crie seu portfólio!|
        |Acompanhamento de Carreira|
        |Professores de surf que sabem surfar!|
        |Estude na Melhor Startup de Educação|