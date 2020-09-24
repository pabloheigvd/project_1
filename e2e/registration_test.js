Feature('registration/login');

Scenario('test something', (I) => {
    I.amOnPage('http://localhost:8080/stack/register');
    I.fillField('username', 'codeceptJS');
    I.fillField('password', 'pwd');
    I.click('Register');
    I.see('USER = codeceptJS : pwd');

    I.amOnPage('http://localhost:8080/stack/login');
    I.fillField('username', 'codeceptJS');
    I.fillField('password', 'pwd');
    I.click('Login');
    I.see('List of questions');

});
