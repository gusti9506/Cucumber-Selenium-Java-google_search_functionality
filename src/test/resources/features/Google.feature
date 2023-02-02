Feature: Google search.

    Scenario: Hacer una busqueda en google.com
        Given Estoy ubicado en google.com
        When Intento buscar QA Automation
        And Poder elejir 'qa automation tester' de la lista desplegable
        Then Deberia mostrarme la busqueda relacionada