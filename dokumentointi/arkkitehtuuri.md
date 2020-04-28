# Arkkitehtuurikuvaus

## Rakenne

Ohjelman pakkausrakenne on seuraava:

<img src="https://github.com/nagajaga/ot-harjoitustyo/blob/master/dokumentointi/packages.png">

Pakkauksessa _ingredientconverter.ui_ on ohjelman graafiseen käyttöliittymään liittyvä koodi.

Pakkauksessa _ingredientconverter.converter_ sijaitsee muunnoksesta huolehtiva koodi.

Pakkaus _ingredientconverter.main_ huolehtii ohjelman suorittamisesta.

## Luokat

Ohjelman toiminnallisuus on jaoteltu seuraaviin luokkiin.

<img src="https://github.com/nagajaga/ot-harjoitustyo/blob/master/dokumentointi/classes.png">

Luokka _ConverterUI_ luo graafisen käyttöliittymän ohjelmalle. Converter olio luodaan ja sille syötetään käyttäjän antamat arvot.

Luokka _Converter_ huolehtii annettujen syötteiden muunnoksista. Syötteiden perusteella pyydetään luokalta _Convertible_ oikea kaava muunnosta varten.

Luokka _Convertible_ sisältää kaikki tarvittavat kaavat muunnoksia varten. Parametreiksi luokka tarvitsee nimen ja monta grammaa on yhdessä kupissa. Näitten tietojen perusteella voidaan palauttaa oikea kaava luokalle _Converter_.

## Toiminnallisuus

Tässä on sekvenssikaavio joka kuvaa sovelluksen etenemistä kun käyttäjä syöttää arvot laskimeen ja painaa nappia.

<img src="https://github.com/nagajaga/ot-harjoitustyo/blob/master/dokumentointi/sequence.png">
