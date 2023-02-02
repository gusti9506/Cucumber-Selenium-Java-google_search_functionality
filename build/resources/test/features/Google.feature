Feature: Google search.

    Scenario: Hacer una busqueda en google.com
        Given Estoy ubicado en google.com
        When Intento buscar QA Automation
        And Doy Enter o hago click en la lupa
        Then Deberia mostrarme la busqueda relacionada