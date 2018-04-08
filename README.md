Užduotis. Duomenų rikiavimas 

Sukurti aplikaciją, kuri skaitytų duomenis iš failo Input.txt ir apdorotą rezultatą
pateiktų faile Output.txt arba programos konsolėje.   
Reikalavimai programai: 
- Surikiuokite eilutes pagal stulpelius; 
- Rikiavimas atliekamas pagal pirmą stulpelį, paskui pagal antrą (jei skaičiai
arba žodžiai pirmajame stulpelyje sutampa) ir t.t.. Visi tos pačios eilutės
duomenys po rikiavimo lieka kartu; 
- Skaičiai turi būti surikiuoti didėjimo tvarka, žodžiai - alfabeto tvarka. Skaičius
rikiuojamas aukščiau nei žodis; 
- Stulpeliai eilutėse yra atskiriami naudojant tabuliaciją (\t). 

Reikalavimai implementacijai:
 
- Programa turėtų būti implementuota remiantis objektinio programavimo
principais; 
- Programos duomenys, logika atskirta nuo atvaizdavimo (taikant MVC ar pan.). 

Papildomi privalumai: 
 
- Programa turi unit testus ir kodas yra lengvai testuojamas;
- Sukurti web aplikaciją panaudojant GWT framework. Duomenys suvedami per 
text area komponentą, o galutinis rezultatas pateikiamas suformuotoje
lentelėje. Perkrovus puslapį suvesti duomenys išlieka. 

Programos veikimo pavyzdys: 

```
_________________________________
-2.2 2 3 4 329 2
2.2 12345q 69 -afg
2.2 12345q 69 -asdf
-22 1234234 asdfasf asdgas
-22 11 abc
-22 -3 4

-1.1

qqqq 1.1
_________________________________ 
Input.txt 
_________________________________
-22 -3 4
-22 11 abc
-22 1234234 asdfasf asdgas
-2.2 2 3 4 329 2
-1.1 
2.2 12345q 69 -afg
2.2 12345q 69 -asdf


qqqq 1.1 
_________________________________
Ouput.txt 

Nuorodos: 
- GWT tutorial’as http://www.gwtproject.org/doc/latest/tutorial/index.html
- Google Plugin for Eclipse https://developers.google.com/eclipse/
- GWT 2.7.0 arba naujesnė http://www.gwtproject.org/ 