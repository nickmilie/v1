# Zadanie rekrutacyjne na stanowisko programisty w Energy Solution

Poniższe zadanie jest okazją dla kandydata, aby przedstawić przykłady swojej wiedzy i umiejętności
praktycznych z zakresu programowania. Jest to również świetna okazja dla zespołu Energy Solution do
oceny wykorzystania umiejętności i technologii przez kandydata. Zadanie to będzie wykorzystywane
jako punkt dyskusji podczas dodatkowych rozmów kwalifikacyjnych.

## Twoje zadanie

### Projekt MVP

Celem zadania będzie utworzenie aplikacji, która będzie posiadała możliwość wykonywania operacji
CREATE poprzez REST API. **_Wymagania techniczne_** oraz **_User stories_** dla tego projektu
znajdziesz w dalszej części readme.
Jeśli coś nie jest zawarte w sekcji **_Wymagania techniczne_** lub w aplikacji startowej, decyzja o
implementacji pozostaje po stronie kandydata.
Jeżeli czujesz się na siłach to zachęcamy do konteneryzacji rozwiązania.

### Informacje dodatkowe

Aplikacja będzie służyć do zarządzania wirtualną bibloteką, a konkretniej książkami. Projekt ma na
celu weryfikację
Twojego sposobu myślenia, podejścia do rozwiązywania problemów i umiejętności programistycznych.
Wymagania techniczne są minimalnymi wymaganiami, które muszą zostać spełnione. Kod, który napiszesz
nie zostanie przez nas w żadeń sposób komercyjnie wykorzystany i służy jedynie do celów
prezentacyjnych.

Zadanie skład się z dwóch etapów.

W pierwszym etapie chcielibyśmy abyś przygotował interfejsy odpowiedzialne za:

* operację tworzenia encji
* logikę biznesową tworzenia encji
* mapowanie oraz walidację danych wejściowych

Następnie przygotuj 2 klasy abtrakcyjne:

* Abstrakcyjną klasę kontrollera
* Abstrakcyjną klasę obsługująca logikę biznesową

Od Ciebie zależy w jaki sposób zaimplentujesz poszczególne kroki tworzenia encji.

W drugim etapie chcielibyśmy abyś przygotował implementację obsługującą tworzenie książki na
podstawie
interfejsów oraz klas abstrakcyjnych z pierwszego etapu.

* zdefiniuj klasę domenową, która będzie reprezentować książkę w bibliotece.
* zdefiniuj klasę, która będzie reprezentować dane wejściowe do tworzenia książki.
* zdefiniuj klasę, która będzie reprezentować dane wyjściowe z operacji tworzenia książki.
* zaimplementuj klasę, która będzie odpowiedzialna za mapowanie danych wejściowych i wyjściowych
  pomiędzy DTO a encją.
* zaimplementuj klasę, która będzie odpowiedzialna za walidację danych wejściowych.
* zaimplementuj klasę, która będzie zawierać logikę biznesową operacji tworzenia książki.
* zaimplementuj klasę, która będzie odpowiedzialna za obsługę zapytań HTTP związanych z tworzeniem
  książki.

### Wymagania techniczne

| **Wymaganie**                                                                                                                                                                   | **Szczegóły**                                                                                       |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| Czas realizacji do 14 dni roboczych                                                                                                                                             | Chcielibyśmy abyś zakończył realizację zadania w ciągu 14 dni roboczych.                            |
| Komunikacja z backendem powinna odbywać się poprzez REST API                                                                                                                    | -                                                                                                   |
| Odpowiedzi z serwera powinny być w formacie JSON.                                                                                                                               | Zwróć uwagę na kody http odpowiedzi.                                                                |
| API powinno być otwarte.                                                                                                                                                        | Api nie powinno wymagać autoryzacji.                                                                |
| Kod powinien być odpowiednio udokumentowany.                                                                                                                                    | -                                                                                                   |
| Zestaw testów jednostkowych                                                                                                                                                     | -                                                                                                   |
| Zestaw testów integracyjnych                                                                                                                                                    | -                                                                                                   | 
| Magazynowanie danych w bazie danych in-memory.                                                                                                                                  | Wybór bazy pozostawiamy kandydatowi - nie ma dla nas znaczenia czy będzie to h2, mysql, postgresql. | 
| Przygotowanie struktury danych i aktualizacja struktury w momencie uruchomienia aplikacji                                                                                       | Postaraj się wykorzystać najlepsze znane praktyki.                                                  |
| Jeżeli w celu uruchomienia projektu będą potrzebne niestandardowe kroki powinieneś o nich wspomnieć w README.md                                                                 | -                                                                                                   |
| Pakiet "com.energysolution.recrutation.common.create" powinien zawierać abstrakcję, które zaimplementujesz w pakiecie "com.energysolution.recrutation.books.application.create" |                                                                                                     |

### User story

Jako użytkownik chciałbym mieć możliwość dodania nowej książki do bibloteki. Książka składać się
będzie z nastepujących danych wejściowych:

* Tytuł książki - maksymalnie 100 znaków, jedynie znaki alfanumeryczne
* Autor książki - imię oraz nazwisko w postaci tekstu.
* ISBN - tekst, powinien walidować format zgodnie z
  ISBN-10 (https://pl.wikipedia.org/wiki/Mi%C4%99dzynarodowy_znormalizowany_numer_ksi%C4%85%C5%BCki -
  proszę nie implementować sum kontrolnych)
* Data publikacji z godziną - format DD-MM-YYYY

Api w odpowiedzi powinno zwrócić dane książki w formacie json:

```
{
   "title": "Tytuł",
   "author": "Imię Nazwisko"
   "ISBN": "Numer isbn",
   "publicationDate": "01-01-1900 00:00:00"
}
```

# Pytania do zadania

Jeżeli masz jakieś pytania napisz e-mail na
adres [Dominik Dziąg (d.dziag@energysolution.pl)](mailto:d.dziag@energysolution.pl)
lub [Dominik Maciąg (d.maciag@energysolution.pl)](mailto:d.maciag@energysolution.pl)

# Sposób przekazania rozwiązania

Umieść projekt w publicznym repozytorium github i wyślij link do niego na
adres [Dominik Dziąg (d.dziag@energysolution.pl)](mailto:d.dziag@energysolution.pl)
lub [Dominik Maciąg (d.maciag@energysolution.pl)](mailto:d.maciag@energysolution.pl)