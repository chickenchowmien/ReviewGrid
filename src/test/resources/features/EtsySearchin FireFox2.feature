Feature: Etsy product search

  Scenario: Etsy search on FireFox
    Given User in on Etsy homepage using firefox
    When User searches for bamboo spoon in firefox
    Then Search results should be displayed in firefox
