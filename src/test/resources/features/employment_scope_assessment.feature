@staging
Feature: Employment scope assessment


Scenario Outline: employment - discrimination - age - over 18 

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          And I click by age
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
          |other                                          |You can still seek advice from a legal adviser          |
          
          
Scenario: employment - age - under 18 - at work -  MEANS TEST

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          When I click by age
          And I click I under 18
          Then I verify I am on the contact civil legal advice page  
          
             
Scenario Outline:  employment - discrimination - disability

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          When I click disability
          And I click disability discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |legal aid is available for this problem page    |
          |while using a service                          |legal aid is available for this problem page    |
          |at a private club                              |legal aid is available for this problem page    | 
          |when someone was carrying out a public function|legal aid is available for this problem page    |
          |at school or college                           |legal aid is available for this problem page    |
          |at university                                  |legal aid is available for this problem page    |
          |other                                          |legal aid is not usually available for this problem page|  
          
            
Scenario Outline:  employment - discrimination - gender

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          And I click gender
          And I click gender discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |legal aid is available for this problem page    |
          |while using a service                          |legal aid is available for this problem page    |
          |at a private club                              |legal aid is available for this problem page    | 
          |when someone was carrying out a public function|legal aid is available for this problem page    |
          |at school or college                           |legal aid is available for this problem page    |
          |at university                                  |legal aid is available for this problem page    |
          |other                                          |legal aid is not usually available for this problem page|
          
          
              
Scenario Outline: employment - discrimination - marriage

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          When I click marriage 
          And I click marriage discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |legal aid is available for this problem page    |
          |other                                          |legal aid is not usually available for this problem page|  

           
Scenario Outline:  employment - discrimination - race

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          When I click race
          And I click race discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |legal aid is available for this problem page    |
          |while using a service                          |legal aid is available for this problem page    |
          |at a private club                              |legal aid is available for this problem page    | 
          |when someone was carrying out a public function|legal aid is available for this problem page    |
          |at school or college                           |legal aid is available for this problem page    |
          |at university                                  |legal aid is available for this problem page    |
          |other                                          |legal aid is not usually available for this problem page|   
          
              
Scenario Outline: employment - discrimination - race

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment discrimination
          When I click religion
          And I click religion discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |legal aid is available for this problem page    |
          |while using a service                          |legal aid is available for this problem page    |
          |at a private club                              |legal aid is available for this problem page    | 
          |when someone was carrying out a public function|legal aid is available for this problem page    |
          |at school or college                           |legal aid is available for this problem page    |
          |at university                                  |legal aid is available for this problem page    |
          |other                                          |legal aid is not usually available for this problem page|  
          
          
Scenario: employment - none of the above - NO MEANS TEST

          Given I am on the public problem page
          When I select Employment
          Then I am redirected to the debt what do you need help with page
          When I click employment none of the above
          Then I verify I am on the legal aid is not usually available for this problem page                         