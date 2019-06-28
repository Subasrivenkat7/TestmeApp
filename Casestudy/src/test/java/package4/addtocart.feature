
Feature:Add to cart
 
  
  Scenario: Payment
  
    Given Alex has registerd into Testme App
    When Alex search product "headphone"
    When Try to proceed to payment without adding any item inthe Cart
   Then Testme doesn't display the cart icon
   
   Scenario: process
    
    Given Alex login to the Testme App
    And Alex  Search a product
    Then Alex add the product to cart
    Then click the cart icon
    Then type the quantity and click checkout
    Then user Redirected to paymentspage
    Then payment page is displayed
    Then ordered detail is displayed