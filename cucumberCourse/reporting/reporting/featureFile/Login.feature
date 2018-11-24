Feature: Login into account

Scenario Outline: Login to account with credentials
	Given user navigate to "<url>"
	When user clicks on the login portal button
	And user enters the "<username>" username
	And user enters the "<password>" password
	When user clicks on the login button
	Then the user should be presented with the following promt alert "<message>"
	
Examples:
	| 	url 							| 		username 		|		 password		 |		 message		 |
#	|http://www.webdriveruniversity.com/|	webdriver			|		wendriver 		 | validation failed     |
	|http://www.webdriveruniversity.com/|	webdriver			|		webdriver123	 | validation succeeded  |

