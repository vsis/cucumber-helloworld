Feature: Login in application

  Scenario Outline:Login succesful
    Given URL login section
      When I fill email "<Email>"
      And I fill password "<Password>"
      Then I'm in home page

    Examples:
      | Email |                 Password |
      | jesidey@mailinator.com | hola123 |
