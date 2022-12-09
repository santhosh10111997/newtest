Feature: GreenKart buying Functionality

Scenario: Select A Vegetable To Buy
   
   Given User Launch The Greenskart Url
   When User Search The Vegetables 
   And User Select the particular Vegetable
   Then User Add The Product In Add To the Card
   
  
   
 Scenario: Proced To Checkout
   When User go to checkout page
   And User Apply the Promo Code
   Then User place the order
   
 Scenario: Proceedd to Delivery
 When User Select a Country
 And User Click The Agree button
 And  User Click The Proceed button
 Then Next Page Shown
 
   
   