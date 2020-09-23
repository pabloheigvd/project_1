package ch.heigvd.amt.mvcsimple.business;

import ch.heigvd.amt.mvcsimple.model.Quote;

import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {

  public List<Quote> generateQuestions() {
    List<Question> result = new ArrayList<>();
    result.add(new Question("Dr. Seuss", "Don't cry because it's over, smile because it happened."));
    result.add(new Question("Oscar Wilde", "Be yourself; everyone else is already taken."));
    result.add(new Question("Albert Einstein", "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe."));
    return result;
  }
}
