package io.github.anderscheow.validator.rules.common;

import android.support.annotation.NonNull;

import java.util.Locale;

import io.github.anderscheow.validator.rules.BaseRule;

public class MinRule extends BaseRule {

    private int minValue;

    public MinRule(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return value.length() >= minValue;
    }

    @NonNull
    @Override
    public String errorMessage() {
        return String.format(Locale.getDefault(), "Length must exceed at least %d characters", minValue);
    }
}
