package eu.modelwriter.kodkod.editor.scanners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

import eu.modelwriter.kodkod.editor.ColorManager;
import eu.modelwriter.kodkod.editor.IColorConstants;
import eu.modelwriter.kodkod.editor.rules.BracketsRule;

public class RelBoundScanner extends RuleBasedScanner {
  public RelBoundScanner(final ColorManager manager) {
    final IToken token = new Token(new TextAttribute(manager.getColor(IColorConstants.REL_BOUND)));
    // final IToken defaultToken = new Token(new
    // TextAttribute(manager.getColor(IColorConstants.DEFAULT)));
    final IToken bracketsToken =
        new Token(new TextAttribute(manager.getColor(IColorConstants.REL_BOUND_BRACKETS)));

    final List<IRule> rules = new ArrayList<IRule>();
    rules.add(new WhitespaceRule(new IWhitespaceDetector() {

      @Override
      public boolean isWhitespace(final char c) {
        return Character.isWhitespace(c);
      }
    }));
    rules.add(new BracketsRule(bracketsToken));
    // rules.add(new DefinitionRule(defaultToken));

    this.setDefaultReturnToken(token);

    final IRule[] result = new IRule[rules.size()];
    rules.toArray(result);
    this.setRules(result);
  }
}
