Use this file to record your reflection on this assignment.
TA Hours - Sunday 7-9pm and Wednesday 7-8pm
Team: Julie Altamirano and Taylor Knibb

- Which methods did you decide to `overload`, and why?

In the library class the methods that were overloaded were: contains title, check out, add title, return book , remove title, and is available. The reason that these libaray methods were overloaded was because 

House has two overloaded contructors. One of them tkaes into account the scenerio where a house does not have a dining hall, kitchen, or elevator so all a person needs to input to make this house is the name, address, and floor amount. The second constructor takes into account the possibility that a house does not have a dining room or elevator with a set number of floors of 3 but does have a kitchen so they only need to input name, address, and kitchen. 

Cafe has the overloaded methods sell coffee and restock in the scenerio that a person ordering at the cafe does not want sugar or cream so the coffee is a plain americano. Then the overloaded restock only restocks the coffee ounces used rather than also restocking unused sugar and cream. 


- What worked, what didn't, what advice would you give someone taking this course in the future?

What didn't work at first in our overloading of the sell coffee constructor was the scenerio of when a coffee would be sold with size and nSugarPackets or size and nCreams. This was an issue because since the parameters for both scenerios only took in two integers so the main would not run selling the coffee since it would think the overloaded methods were duplicates of eachother. This was later fixed by just saying that the sold coffee was an Americano without considering nSugarPackets or nCreams. 

What did work was overloading the methods of library in order to enter an int title like 1984 but the methods are able to convert that int title into a string so that there is no issue with processing it through the collection. 

My advice is to think of overloading in a real life application such as maybe someone does not want sugar or cream in theri coffee so how can you reflect that in your code? Do not get too stressed out if you do not get the result you wanted in the first round of overloading methods and constructors because after trial and error it will make mroe sense. 