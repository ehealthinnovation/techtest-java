Java based technical test for full stack and backend applicants

## Introduction:
First off, thanks for taking the time to apply to our organization. We really appreciate the interest, and we know your time is valuable. We hope that this test will allow you to express how you write your code and help us get a better idea of who you are through it.

## The Assignment:

#### We have created a refactoring exercise for you to complete. All code, structure and files are fair game for you to modify, the only restriction is that the output for any given input must not change. The goal is to have expandable, maintainable and easily readable code.

The scenario is that this is Shopping Drug Market's code for receipt printing. You've been hired to potentially make some updates to their code, they're not yet sure what changes will be coming but at the least they will start to stock more medication types and begin to have more flexible deals on their products.

Note that we're not looking for the most efficient code in this assignment. A very good answer can be crafted without much knowledge beyond class hierarchies, for loops and test assertions. If you have not used Java in some time, you may want to brush up on how to use the testing and assertion libraries(JUnit and Hamcrest), but otherwise no language-specific features are expected.

#### The code is split into three main classes:

Medication, which has a name and type of a stocked medication.

Prescription, which has a medication and the number of units of medication that have been prescribed.

Customer, which has a name and a list of prescriptions. Customer also prints a receipt that follows Shopping Drug Market's purchase rules, as follows:
* The standard price of antihistamines is 1 cent per unit
* The standard price of painkillers is 3 cents per unit
* The standard price of decongestants is 2 cents per unit
* When a customer buys more than 50 units of antihistamines, they get a 10% discount off the standard price
* When a customer buys more than 100 units of antihistamines, the get a 20% discount off the standard price
* When a customer buys more than 100 units of painkillers, they get a 33% discount off the standard price
* When a customer buys more than 200 units of painkillers, they get a 50% discount off the standard price
* Any purchase receives 100 Optimal points, but buying decongestants gets a bonus 200 Optimal points

You are encouraged to use the included tests to observe how the current code runs before making major changes. Keep in mind the potential expansions that Shopping Drug Market has planned while you are coding. Again, we are looking for clear,  readable, maintainable code. Good luck!

This project makes use of maven to pull the required testing libraries and assumes a java version of 11.
