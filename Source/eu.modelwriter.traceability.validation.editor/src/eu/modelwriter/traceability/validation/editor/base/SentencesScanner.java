package eu.modelwriter.traceability.validation.editor.base;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

public class SentencesScanner extends RuleBasedScanner {

  public static final String[] keywords = new String[] {"not", "and", "or", "implies", "iff", "all",
      "no", "lone", "some", "one", "!", "&&", "||", "->", "<->"};

  private final char specChar = '|';

  public SentencesScanner(final ColorManager colorManager) {
    final IToken keywordToken = new Token(
        new TextAttribute(colorManager.getColor(IValidationColorConstants.SENTENCES_KEYWORD)));
    final IToken verticalBarToken = new Token(
        new TextAttribute(colorManager.getColor(IValidationColorConstants.SENTENCES_VERTICALBAR)));
    final IToken defaultToken =
        new Token(new TextAttribute(colorManager.getColor(IValidationColorConstants.DEFAULT)));

    final List<IRule> rules = new ArrayList<>();

    rules.add(new WhitespaceRule(new ValidationWhitespaceDetector()));

    final WordRule keywordRule = new WordRule(new IWordDetector() {

      @Override
      public boolean isWordPart(final char c) {
        return Character.isLetter(c);
      }

      @Override
      public boolean isWordStart(final char c) {
        return Character.isLetter(c);
      }
    }, defaultToken);

    for (int i = 0; i < keywords.length; i++) {
      keywordRule.addWord(keywords[i], keywordToken);
    }
    rules.add(keywordRule);

    rules.add(new VerticalBarRule(this.specChar, verticalBarToken));

    final IRule[] result = new IRule[rules.size()];
    rules.toArray(result);
    this.setRules(result);
  }
}
