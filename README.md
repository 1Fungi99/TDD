<h1>Test Driven Development (TDD)</h1>

This exercise was taken from the Core Development Practice in the [Montreal Innovation Centre @ TEKsystems](https://www.teksystems.com/en/locations?LatLong=45.5016889,%20-73.567256&Address=Montreal).  In addition to your TA, the TEKPractice @ Montreal will be doing a quality code review on your work.  

It is strongly encouraged to read the <code>preamble.md</code>, a little letter from Jean-Nicholas Thomas, one of the Practice Managers for the TEKpractice @ Montreal.  The file is found in this repository.

This exercise will be further honing your skills in OOP, OOD, and TDD.  For this exercise, you should recall our discussions about **Object Oriented Design**.  Also, this exercise will be an opportunity to gain experience in **Test Driven Development (TDD)**. 

Therefore, it is highly recommended that you use the Problem Solving Framework to complete this project.  You can document your problem solving steps in the <code>UPER.md</code> file.

You will be evaluated on **how you reach the solution**, keeping in mind that the correctness of the solution will also be taken into consideration. 

Your focus should be on these elements of code quality: 
- Code easy to read and to maintain (i.e. Clean code) 
- Object-oriented design patterns (OOD)
- Object-oriented design principles (SOLID) (Expandable Design)
- Unit testing (TDD)
 

********************
**What you should aim to deliver:**

A simple console application does the job. You do not need to implement any input mechanism, any UI nor data store. It is important to keep in mind that we are looking for code quality and attention to details, not quantity of code. 
You may use frameworks and/or tools that are in general usage for the target technology stack (for example your preferred unit testing framework, like JUnit5 or TestNG). 
However, the central problem of the coding exercise should be performed entirely by your own code. 

***********************

• The code must be written using an IDE, you are comfortable with (IntelliJ, VSCode, Eclipse, Netbeans, etc.);

• Once the code is written, the source code must be submitted <code>without its byte code;</code>.  Please remove any files archiving byte code (jar, war, "*.class” and the bin/target directory).  

You can do this by adding these files to a <code>.gitignore</code> file.  You may need to do some research to figure out how to use the file properly.

*********************
**<h2>Sales Taxes</h2> Assigment Description**

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions. 

When I purchase items, I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax. 

Write an application that prints out the receipt details for these shopping baskets... 

*******************
INPUTS: 

Input 1: 
  
•	1 book at 12.49 

•	1 music CD at 14.99 

•	1 chocolate bar at 0.85 

Input 2: 

•	1 imported box of chocolates at 10.00 

•	1 imported bottle of perfume at 47.50 

Input 3: 

•	1 imported bottle of perfume at 27.99 

•	1 bottle of perfume at 18.99 

•	1 packet of headache pills at 9.75 

•	1 box of imported chocolates at 11.25 

OUTPUT 

Output 1: 

•	1 book: 12.49 

•	1 music CD: 16.49 

•	1 chocolate bar: 0.85 

•	Sales Taxes: 1.50 Total: 29.83

Output 2: 

•	1 imported box of chocolates: 10.50 

•	1 imported bottle of perfume: 54.65 

•	Sales Taxes: 7.65 Total: 65.15

Output 3: 

•	1 imported bottle of perfume: 32.19 

•	1 bottle of perfume: 20.89 

•	1 packet of headache pills: 9.75 

•	1 imported box of chocolates: 11.85 

•	Sales Taxes: 6.70 Total: 74.68


## ********************************************************
## Git Instructions

- [ ] Create a template copy of this repository by clicking : "Use this template"
- [ ] Name the repository the same name as the master template repository.  
- [ ] Add your TA as collaborator
- [ ] Add the Code Quality Reviewer from Montreal as <strong>another collaborator</strong>.  Reach out to your TA for the Github username of the Reviewer from Montreal.  
- [ ] Clone YOUR repo to your local computer
- [ ] Create a new branch: <code>git checkout -b `<firstName-lastName>`</code>.
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly.
- [ ] Push all of your commits: <code>git push origin `<firstName-lastName>`</code>.
- [ ] When ready for your TA to review, open a Pull Request (PR) and add your TA as a collaborator.

## ********************************************************
## TEKacademy Submission

- [ ] Submit the exercise or the presentation feedback sheet provided by your TA in the [TEKacademy portal](https://bit.ly/TEKacademy)
  
- [ ] Download & Complete the [Exercise Evaluation Form](https://bit.ly/TEKacademy)
  
- [ ] Upload the form in [TEKacademy](https://bit.ly/TEKacademy)