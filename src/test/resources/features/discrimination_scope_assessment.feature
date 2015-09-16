@staging
Feature: Discrimination scope assessment


Scenario Outline: discrimination - age - over 18 

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click by age
          And I click I am 18 or over
          And I click <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|
          
         
Scenario: discrimination - age - under 18 - at work -  MEANS TEST

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click by age
          And I click I am under 18
          Then I verify I am on the contact civil legal advice page  
          
         
Scenario Outline:  discrimination - disability

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click disability
          And I click disability discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|  
          
       
Scenario Outline:  discrimination - gender

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click gender
          And I click gender discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |                 
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|
          
          
         
Scenario Outline:  discrimination - marriage

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click marriage 
          And I click marriage discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|  

           
Scenario Outline:  discrimination - race

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click race
          And I click race discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |          
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|   
          
         
Scenario Outline: discrimination - religion

          Given I am on the public problem page
          When I select Discrimination
          Then I am redirected to the discrimination what do you need help with page
          When I click religion
          And I click religion discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |         
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|