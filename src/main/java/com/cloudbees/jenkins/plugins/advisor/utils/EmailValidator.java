package com.cloudbees.jenkins.plugins.advisor.utils;

import edu.umd.cs.findbugs.annotations.NonNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EmailValidator {

  private static final String EMAIL_REGEX = "^[\\w-+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
  private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

  private static final EmailValidator EMAIL_VALIDATOR = new EmailValidator();

  private EmailValidator() {
  }

  public static EmailValidator getInstance() {
    return EMAIL_VALIDATOR;
  }

  public boolean isValid(@NonNull String email) {
    Matcher matcher = PATTERN.matcher(email);
    return matcher.matches();
  }
}
