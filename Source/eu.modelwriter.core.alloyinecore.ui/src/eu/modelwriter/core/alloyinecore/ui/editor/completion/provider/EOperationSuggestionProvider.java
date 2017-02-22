package eu.modelwriter.core.alloyinecore.ui.editor.completion.provider;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.BodyContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EAnnotationContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EGenericElementTypeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EGenericExceptionContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EMultiplicityContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EOperationContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EParameterContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.PostconditionContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.PreconditionContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.TemplateSignatureContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.UnrestrictedNameContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.VisibilityKindContext;
import eu.modelwriter.core.alloyinecore.structure.base.ITarget;
import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.AIECompletionUtil;
import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.AbstractAIESuggestionProvider;
import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.CompletionTokens;

public class EOperationSuggestionProvider extends AbstractAIESuggestionProvider {

  @Override
  public Set<String> getStartSuggestions() {
    final Set<String> startSuggestions = new HashSet<>();
    startSuggestions.addAll(
        spFactory.visibilityKindSP().getStartSuggestions());
    startSuggestions.add(CompletionTokens._static);
    startSuggestions.add(CompletionTokens._operation);
    return startSuggestions;
  }

  @Override
  protected void computeSuggestions(final ParserRuleContext context, final ParseTree lastToken) {
    if (lastToken instanceof ParserRuleContext) {
      if (lastToken instanceof VisibilityKindContext) {
        suggestions.add(CompletionTokens._static);
        suggestions.add(CompletionTokens._operation);
      } else if (lastToken instanceof TemplateSignatureContext) {
        // operation name
      } else if (lastToken instanceof UnrestrictedNameContext) {
        suggestions.add(CompletionTokens._leftParenthesis);
      } else if (lastToken instanceof EParameterContext) {
        suggestions.add(CompletionTokens._comma);
        suggestions.add(CompletionTokens._rightParenthesis);
      } else if (lastToken instanceof EGenericElementTypeContext) {
        suggestions.addAll(spFactory.multiplicitySP()
            .getStartSuggestions());
        suggestions.add(CompletionTokens._throws);
        suggestions.add(CompletionTokens._leftCurly);
        suggestions.add(CompletionTokens._semicolon);
      } else if (lastToken instanceof EMultiplicityContext) {
        suggestions.add(CompletionTokens._throws);
        suggestions.add(CompletionTokens._leftCurly);
        suggestions.add(CompletionTokens._semicolon);
      } else if (lastToken instanceof EGenericExceptionContext) {
        suggestions.add(CompletionTokens._comma);
        suggestions.add(CompletionTokens._leftCurly);
        suggestions.add(CompletionTokens._semicolon);
      } else if (lastToken instanceof EAnnotationContext || lastToken instanceof PreconditionContext
          || lastToken instanceof BodyContext || lastToken instanceof PostconditionContext) {
        suggestions.addAll(
            spFactory.eAnnotationSP().getStartSuggestions());
        suggestions.addAll(spFactory.preconditionSP()
            .getStartSuggestions());
        suggestions.addAll(
            spFactory.bodySP().getStartSuggestions());
        suggestions.addAll(spFactory.postconditionSP()
            .getStartSuggestions());
      }
    } else if (lastToken instanceof TerminalNode) {
      if (lastToken.getText().equals(CompletionTokens._static)) {
        suggestions.add(CompletionTokens._operation);
      } else if (lastToken.getText().equals(CompletionTokens._operation)) {
        suggestions.addAll(spFactory.templateSignatureSP()
            .getStartSuggestions());
      } else if (lastToken.getText().equals(CompletionTokens._leftParenthesis)) {
        suggestions.addAll(
            spFactory.eParameterSP().getStartSuggestions());
      } else if (lastToken.getText().equals(CompletionTokens._rightParenthesis)) {
        suggestions.add(CompletionTokens._colon);
      } else if (lastToken.getText().equals(CompletionTokens._colon)) {
        // operation return type
        final EOperationContext fullContext =
            (EOperationContext) AIECompletionUtil.getFullContext(context);
        if (fullContext != null) {
          final List<ITarget> targets = fullContext.current.getTargets().stream()
              .map(e -> (ITarget) e).collect(Collectors.toList());
          for (final ITarget target : targets) {
            suggestions.add(target.getRelativeSegment());
          }
        }
      } else if (lastToken.getText().equals(CompletionTokens._throws)) {
        // exception type
        final EOperationContext fullContext =
            (EOperationContext) AIECompletionUtil.getFullContext(context);
        if (fullContext != null) {
          final List<ITarget> targets = fullContext.current.getTargets().stream()
              .map(e -> (ITarget) e).collect(Collectors.toList());
          for (final ITarget target : targets) {
            suggestions.add(target.getRelativeSegment());
          }
        }
      } else if (lastToken.getText().equals(CompletionTokens._leftCurly)) {
        suggestions.add(CompletionTokens._ordered);
        suggestions.add(CompletionTokens._notOrdered);
        suggestions.add(CompletionTokens._unique);
        suggestions.add(CompletionTokens._notUnique);
        suggestions.addAll(
            spFactory.eAnnotationSP().getStartSuggestions());
        suggestions.addAll(spFactory.preconditionSP()
            .getStartSuggestions());
        suggestions.addAll(
            spFactory.bodySP().getStartSuggestions());
        suggestions.addAll(spFactory.postconditionSP()
            .getStartSuggestions());
      } else if (lastToken.getText().equals(CompletionTokens._comma)) {
        suggestions.addAll(
            spFactory.eParameterSP().getStartSuggestions());
        // exception types
        suggestions.add(CompletionTokens._ordered);
        suggestions.add(CompletionTokens._notOrdered);
        suggestions.add(CompletionTokens._unique);
        suggestions.add(CompletionTokens._notUnique);
      } else if (lastToken.getText().equals(CompletionTokens._ordered)
          || lastToken.getText().equals(CompletionTokens._notOrdered)
          || lastToken.getText().equals(CompletionTokens._unique)
          || lastToken.getText().equals(CompletionTokens._notUnique)) {
        suggestions.add(CompletionTokens._comma);
        suggestions.add(CompletionTokens._rightCurly);
      } else if (lastToken.getText().equals(CompletionTokens._rightCurly)
          || lastToken.getText().equals(CompletionTokens._semicolon)) {
        // end of context.
        suggestions.addAll(getParentProviderSuggestions(context, lastToken));
      } else if (lastToken instanceof ErrorNode) {
        // suggestions.addAll(getChildProviderSuggestions(context, lastToken));
      }
    }
  }

  @Override
  protected boolean isCompatibleWithContext(final ParserRuleContext context) {
    return context instanceof EOperationContext;
  }

  @Override
  protected void initParentProviders() {
    addParent(spFactory.eTypedElementSP());
    addParent(spFactory.eClassSP());
  }

  @Override
  protected void initChildProviders() {
    addChild(spFactory.visibilityKindSP());
    addChild(spFactory.templateSignatureSP());
    addChild(spFactory.unrestrictedNameSP());
    addChild(spFactory.eParameterSP());
    addChild(spFactory.eGenericElementTypeSP());
    addChild(spFactory.multiplicitySP());
    addChild(spFactory.eGenericExceptionSP());
    addChild(spFactory.eAnnotationSP());
    addChild(spFactory.preconditionSP());
    addChild(spFactory.bodySP());
    addChild(spFactory.postconditionSP());
  }

}
