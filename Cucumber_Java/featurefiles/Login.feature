#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Feature for INueron admin section 
 @Smoke
  Scenario: User is able to login with valid crendetials
  	Given User is able to open application
    And user is able to land on home page with all elements
    When user enter user name as admin
    And enter password as admin123
    And click on login button
    Then user successfully logged in
    And should be able to see the dashboard
