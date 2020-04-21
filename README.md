[Vaatimusmäärittely](https://github.com/nagajaga/ot-harjoitustyo/blob/master/dokumentointi/vaatimusmaarittely.md)

[Tuntikirjanpito](https://github.com/nagajaga/ot-harjoitustyo/blob/master/dokumentointi/tuntikirjanpito.md)

[Arkkitehtuuri](https://github.com/nagajaga/ot-harjoitustyo/blob/master/dokumentointi/arkkitehtuuri.md)

## Releaset

[Viikko 5](https://github.com/nagajaga/ot-harjoitustyo/releases/tag/viikko5)

## Komentorivitoiminnot

### Testaus

Testit suoritetaan komennolla

```
mvn test
```

Testikattavuusraportti luodaan komennolla

```
mvn jacoco:report
```

Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto _target/site/jacoco/index.html_

### Suoritettavan jarin generointi

Komento

```
mvn package
```

generoi hakemistoon _target_ suoritettavan jar-tiedoston _ingredientConverter-1.0-SNAPSHOT.jar_

### Ohjelman suorittaminen komentoriviltä

Komento

```
mvn compile exec:java -Dexec.mainClass=ingredientconverter.main.Main
```
### Checkstyle

Tiedostoon [checkstyle.xml](https://github.com/nagajaga/ot-harjoitustyo/blob/master/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla

```
 mvn jxr:jxr checkstyle:checkstyle
```

Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto _target/site/checkstyle.html_
