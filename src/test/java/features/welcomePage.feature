@WelcomePage
Feature: Welcome Page

  @Check @Components
  Scenario Outline: Check Welcome Page Components
    Given Enes is opened Faladdin App
    Then should see Faladdin Icon
    Then should see "<title>" title
    Then should see "<desc>" title description
    Then should see "<button>" button
    Examples:
      | title   | desc               | button  |
      | Welcome | Reveal your future | Explore |


  @Click
  Scenario: Click Explore Button
    Given Enes is opened Faladdin App
    When click Explore button
    Then should see Home Page



