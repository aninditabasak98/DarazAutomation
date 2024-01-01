Feature: Daraz
  @smoke
  Scenario: Salwar kameez page
    Given Salwar kameez page
    When click on the first dress
    And click on add to cart button
    And click on login with facebook button
    Then Product added to cart
