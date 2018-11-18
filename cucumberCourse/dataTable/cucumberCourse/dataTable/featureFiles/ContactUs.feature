Feature: Submit date to webdriveruniverisy.com using contact us form

Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity
	When I click on the contact us button
	Then I enter a valid first name
	And I enter a valid last name
	|woods| jacksons| johns|
	And I enter a valid email address
	And I enter comments
	|comment one	| comment two|
	|comment three	| comment four|
	When I click on the submit button
	Then the information should successfully be submitted via the contact us form 
	 