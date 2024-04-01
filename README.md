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

            