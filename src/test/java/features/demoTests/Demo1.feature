Feature: Demo test number 01
  Scenario: Scenario 01 of DEMO test 01
    Given user connects to rest api
    When user requests for resources with correct resource path
    Then user receives response with response code 200
    And User is able to see the resources requested.