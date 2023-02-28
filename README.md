# Postup prací   
 1. Otevřete projekt v NetBeans a přejmenujte projekt tak, že místo koncovky 
    Prijmeni vložíte svoje příjmení. Jenom přejmenovaný projekt bude hodnocen.
 2. V NetBeans z menu Window/Action Items nebo Ctrl-6 otevřte okno Action Items.
 3. V okně Action Items klikněte na první a jediný řádek s TODO 
    a vykonejte požadované úpravy třídy Rozmer.
 4. Implementaci třídy Rozmer kontrolujte pomocí jejího testu RozmerTest.java.
 5. Postupujte tak, že nejdříve všechny testy vypnete zakomentováním 
    a potom je postupně aktivujte a doplňujte implementaci jednotlivých metod.
 6. Poté co všechny testy projdou, zkontrolujte pokrytí vaši třídy Rozmer takto:
    - a. Znovu aktivujte test, ale celého projektu, příkazem 
         Run/Test Project (Alt-F6).
    - b. V kontextovém menu na projektu zvolte příkaz Code Coverage/ Show report.
    - c. Zobrazí se výsledek pokrytí.
    - d. Když bude řádek Total obsahovat 100%, tak jsou všechny příkazy tříd 
         pokryty testy.
    - e. Když nebude zobrazen výsledek na 100%, tak třída Rozmer obsahuje příkazy, 
         které nejsou pokryty testy.
    - f. Protože test byl sestaven na plné pokrytí, je zapotřebí vaše nepokryté 
       řádky třídy Rozmer odstranit.
 7. Po získání plného pokrytí odešlete projekt do repository (commit a push).
 8. Vytvořte v NetBeans z větve "main" novou vývojovou větev "real" .
 9. Změňte celočíselné atributy třídy Rozmer na reálná čísla 
    a upravte zdrojový kód a kontrakt (odstraňte teoretický úvod).
10. Zkontrolujte třídu Rozmer testem a zda je kód stále plně pokryt testem.
11. Odešlete projekt do větve "real" v repository (commit a push).
12. Vytvořte v NetBeans novou větev "record", kde nahradíte třídu Rozmer 
    novým prvek jazyka Java a to tak, že místo klíčového slova "class" 
    použijte slovo "record" a upravíte zdrojový kód.
13. Odešlete projekt do větve "record" v repository (commit a push).
14. Porovnejte verze a text porovnání vložte do Moodle. 
    Zaměřte se na výhody/nevýhody, srozumitelnost zápisu, délku kódu 
    a případně na délku překladu.   
