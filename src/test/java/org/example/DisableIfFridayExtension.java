package org.example;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisableIfFridayExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.TUESDAY))
            return ConditionEvaluationResult.disabled("Ready for the weekend!");
        else
            return ConditionEvaluationResult.enabled("Tests should run.");
    }
}
