Feature: Daraz
  @smoke
  Scenario: Add to Cart
    Given Daraz homepage
    When Mouse hover on Womans and Girls Fashion
    And Mouse hover on traditional wear
    And Click on Salwar Kameez
    And Click on Add to cart button
    Then It will take to login window