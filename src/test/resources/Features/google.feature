@Google
Feature: Google Search

  Scenario Outline: Open Google
    Given I go to google search page
    When I enter some text= <text>

    Examples:
    |text|
    |Test|

