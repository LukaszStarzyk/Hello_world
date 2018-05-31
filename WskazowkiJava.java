// odnosimy się do znaków UNICODE
char myChar = '\u00A9'; 

//Definiowanie stringów (specjalne traktowanie klasy)
String nazwaMiasta = "Krakow";

//wyświetlenie wyniku na ekranie:
System.out.println(nazwaMiasta);

//operator reszty z dzielenia
int wynik = 4 % 1;
System.out.println(wynik);

//operator porównania prawda/fałsz oraz koniunkcji warunków AND:
if (wynik == 1 && nazwaMiasta == "Krakow")
	System.out.println(wynik);

//operator OR:
if (wynik == 1 || nazwaMiasta == "Krakow")
	System.out.println(wynik);

//przejście do nowej linii podczas jednej komendy:
System.out.println("Napis testowy" +
			" <- druga linia, ale przy wyświe" +
			"tlaniu nowa linia");