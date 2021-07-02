@Nykaa
Feature: To search  a product from a given site

Scenario Outline: To Search for a cosmetic brand in Nykaa Site
Given Launch to the Nykaa site 
When User navigates to Brands
And User clicks on a particular "<Brands>" brand
  Examples:
    | Brands |
    | M.A.C  |
    | Lakme  |

  
  
Scenario: To Search Cotton saree in Hand Made Saree Site
Given Launch to the Sundariihandmade site
When The user navigates to shop by category 
And  The user clicks Cotton Blouses
    | Type   |
    | Cotton |
  	| Silk   |
    
