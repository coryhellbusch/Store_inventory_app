C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, 
    the product names, and the names of the parts. 
    In file mainscreen.html:
        On lines 14 and 19, I changed the title and header to say "Skate4Life Skate Shop"   
        On line 22, added a paragraph tag with various parts
        On line 55, added a paragraph tag with various products

D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include 
    navigation to and from the “About” page and the main screen.
    Created file aboutscreen.html
    Copied !DOCTYPE, html, head, meta, link, and title tags from mainscreen.html
        On line 14, changed the title to About
        On lines 17-24: 
            Created a div
            Added h1 tag with page name
            Added p tag with a description of the company
            Added a tag to link to home page
    In the mainscreen.html file, on line 21, added an a tag to link to the aboutscreen page
    Created Java class AboutScreenController
        On line 6, added @Controller
        On line 7, named the class
        On line 9, added the @GetMapping
        On line 10, created the method to return "aboutscreen"

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five 
        products in your sample inventory and should not overwrite existing data in the database.
        On the BootStrapData.java file: 
            Lines 42-58: 
            Added an if statement to add the sample inventory only if there is no inventory
            Modified the name, inventory, and price for the outsourced part
            Changed the name and inventory for the product
F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
    In the mainscreen.html file, line 88:
        I added a button "Buy Now" with the reference to a new page, and passed in the product ID
    Created controller file "BuyScreenController.java"
        Lines 13-16: created the controller class and private variable productService
        Lines 18-20: mapped the page, created buyProduct method with the ID parameter
        Lines 22-26: created if statement to run if inventory was greater than 0, decremented inventory, saved it, and
            then redirected to the confirmation page
        Lines 27-29: created the else statement to run if inventory was 0, and redirected to purchase failure page
        Lines 32-40: mapped the redirect pages
    Created purchaseSuccessful and purchaseIncomplete html templates
        Copied the basic info from mainscreen.html, then changed the title, added a header tag, and a link back to the 
            mainscreen
G. Modify the parts to track maximum and minimum inventory by doing the following:
    •  Add additional fields to the part entity for maximum and minimum inventory.
    •  Modify the sample inventory to include the maximum and minimum fields.
    •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
    •  Rename the file the persistent storage is saved to.
    •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
    In the Part.java file:
        Lines 31-34: added variables minInv and maxInv
        Lines 56-64: added new constructor to include maxInv and minInv variables
        Lines 97-101: added get and set methods for maxInv and minInv
    In the BootStrapData.java file: 
        Lines 50-51: added the maxInv and minInv numbers for the sample inventory
    In the InhousePartForm.html file: 
        Lines 16-29: added labels for each input, added min and max inventory inputs
    In the OutsourcedPartForm.html file: 
        Line 17-29: added labels for each input, added min and max inventory inputs
    In the application.properties file: 
        Line 6: changed the name of the storage file
    In the AddInhousePartController.java file:
        Lines 42-45, 48, 54-56: added if-else statement to prevent part creation if inventory is outside of max and min bounds
    In the AddOutsourcedPartController.java file: 
        Lines 43-46, 49, 54-46: added if-else statement to prevent part creation if inventory is outside of max and min bounds
    In the BuyScreenController.java file
        Line 25: fixed a syntax error in the mapping