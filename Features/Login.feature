Feature: Login fuctionality

Scenario: Login with valid Crendentials

Given User Lunch Browser
When User Open URL "https://magento.softwaretestingboard.com/"
And  User Click On SignIn button
And  Users enter Email as "akashumap1313@gmail.com" and password as "Akash@1313"
And  User Click On Login button
Then Page Title should be "New Luma Yoga Collection"
When User Click On DownSide arrow
And  User Click On SignOut button
Then Page Title Should be "Home Page"
And Close Browser

Scenario Outline: Login with valid Crendentials DDT

Given User Lunch Browser
When User Open URL "https://magento.softwaretestingboard.com/"
And  User Click On SignIn button
And  Users enter Email as "<email>" and password as "<password>"
And  User Click On Login button
Then Page Title should be "New Luma Yoga Collection"
When User Click On DownSide arrow
And  User Click On SignOut button
Then Page Title Should be "Home Page"
And Close Browser


Examples:
|email||password|
|akashumap1313@gmail.com||Akash@1313|
|akashumap@gmail.com||Akkasj@1313|
