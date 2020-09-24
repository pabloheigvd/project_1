Feature('homepage');

Scenario('test something', (I) => {
    I.amOnPage('http://localhost:8080/stack/');
    I.see('List of questions');
    I.see("Overcoming single value constraing issues with P625 coordinate location in Wikidata - Wolfgang Fahl")
});
