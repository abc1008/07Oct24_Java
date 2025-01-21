Feature: Change Password 

  Scenario: Test Change Password functionality
		Given User Clicks on profile icon and selects Change Password option
		And Enters valid password and confirm password
		And hits Update button
		Then Password must be changed successfully.