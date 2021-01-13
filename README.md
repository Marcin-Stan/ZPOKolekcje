# ZPOKolekcje
Zaawansowane Programowanie Obiektowe Kolekcje
Jan uczy się słówek angielskich. Każdego dnia przyswaja 2 nowe słowa.
Niestety, każdego dnia również zapomina co najwyżej 2 słowa spośród tych, których nauczył się >= k dni wcześniej. Procedura jest taka, że każdego dnia losujemy 2 słowa spośród słów poznanych >= k dni wcześniej (jeśli w ogóle takie istnieją) i zapominamy każde z nich z prawdopodobieństwem p (domyślnie p = 0,5). Uwaga: Jan może się nauczyć słów, których już wcześniej zapomniał.

Słowa ang. dostępne są w pliku 1500.txt, każdego dnia losujemy dwa nowe (bez powtórzeń).

Proszę zwizualizować (w konsoli) proces nauki Jana, wypisując dla każdego z n kolejnych dni:
a) słowa, które danego dnia poznał,
b) słowa, którego dnia zapomniał (0, 1 lub 2),
c) wszystkie słowa, które aktualnie zna.

Do eksperymentów można przyjąć n = 10 i k = 3.

Uwaga: proszę dobrać struktury danych tak, aby symulacja procesu była efektywna. Dane do testów są nieduże, ale proszę wyobrazić sobie o kilka rzędów wielkości większe. Wyjście może wyglądać np. następująco (pokazane tylko pierwsze 5 dni):

Day 1
New words:              centre ordinary
Forgotten words:        ---
[centre, ordinary]

Day 2
New words:              doth wishes
Forgotten words:        ---
[centre, ordinary, doth, wishes]

Day 3
New words:              excitement november
Forgotten words:        ---
[centre, ordinary, doth, wishes, excitement, november]

Day 4
New words:              favor begin
Forgotten words:        ordinary centre
[favor, begin, doth, wishes, excitement, november]

Day 5
New words:              conditions flight
Forgotten words:        ---
[favor, begin, doth, wishes, excitement, november, conditions, flight]

