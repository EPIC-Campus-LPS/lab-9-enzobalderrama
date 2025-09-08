# Lab 9

## Part 1: Magic 8 Ball

- Create a class `Magic8Ball` which has an instance variable `String[] answers` and an appropriate constructor. Then create a runner class with a main method. Test your class with the following main.

```java
String[] arr = ["Yes", "No", "Maybe"];
Magic8Ball ball = new Magic8Ball(arr);
```

- Now, Create a `Magic8Ball` object with the following answers:
	- Yes, definitely.
	- Without a doubt.
	- It is certain.
	- Most likely.
	- Outlook good.
	- You may rely on it.
	- Reply hazy, try again.
	- Ask again later.
	- Better not tell you now.
	- Cannot predict now.
	- Don’t count on it.
	- My sources say no.
	- Outlook not so good.
	- Very doubtful.
	- Signs point to yes.
	- Randomly pick one for each question.
	- Add option for user to add/remove answers.
- Write the method `predict()` in the `Magic8Ball` class which returns a random answer from the array of `answers`. 
- In your runner class, use the `predict()` method to create a program which asks the user for a yes or no question and prints out what the Magic 8 Ball predicted.

## Part 2: Movie Ratings

- Create a `Movie` class which stores the title and release year of the movie. 
	- Create appropriate constructors, and getters/setters.
- Then create the `MovieReview` class. It should contain a `Movie` object, a double to store the score out of 10.
	- Create appropriate constructors, and getters/setters.
- Lastly, create the `ReviewRunner` class which contains a main method.
	- The method creates an array of 50 `MovieReviews`.  From your main method, read in and fill your array with the reviews in `movies.csv`. *Hint: use `.split()` to help you parse the string.*
	- Then write a program to tell me the highest rated review in the list of movies. Then tell me the oldest movie in the list. 

`movies.csv`
```
Title,Year,Rating
The Shawshank Redemption,1994,9.3
The Godfather,1972,9.2
The Godfather Part II,1974,9.0
The Dark Knight,2008,9.0
The Lord of the Rings: The Return of the King,2003,9.0
Pulp Fiction,1994,8.9
Schindler's List,1993,8.9
Fight Club,1999,8.8
Forrest Gump,1994,8.8
Inception,2010,8.8
The Lord of the Rings: The Fellowship of the Ring,2001,8.8
The Lord of the Rings: The Two Towers,2002,8.8
The Matrix,1999,8.7
Goodfellas,1990,8.7
Star Wars: Episode V - The Empire Strikes Back,1980,8.7
Se7en,1995,8.6
The Silence of the Lambs,1991,8.6
Interstellar,2014,8.6
Parasite,2019,8.6
Saving Private Ryan,1998,8.6
City of God,2002,8.6
The Green Mile,1999,8.6
Star Wars: Episode IV - A New Hope,1977,8.6
The Lion King,1994,8.5
Gladiator,2000,8.5
The Departed,2006,8.5
The Prestige,2006,8.5
Alien,1979,8.5
Spider-Man: Across the Spider-Verse,2023,8.6
Dune: Part Two,2024,8.6
Spider-Man: Into the Spider-Verse,2018,8.4
Memento,2000,8.4
Coco,2017,8.4
Aliens,1986,8.4
Back to the Future,1985,8.5
The Terminator,1984,8.1
Toy Story,1995,8.3
The Incredibles,2004,8.0
The Grand Budapest Hotel,2014,8.1
Get Out,2017,7.8
Whiplash,2014,8.5
La La Land,2016,8.0
Mad Max: Fury Road,2015,8.1
The Social Network,2010,7.7
Everything Everywhere All at Once,2022,8.0
Oppenheimer,2023,8.5
Barbie,2023,7.0
Dune: Part One,2021,8.1
The Iron Giant,1999,8.0
Star Wars: Episode VI - Return of the Jedi,1983,8.3
```

## Part 3: Sports Team Stats

1. Create a class `Player` with the following attributes
	1. `name` - the player's first and last name
	2. `position` - the position they play
	3. `goals` - the number of goals
	4. `assists` - the number of assists
	5. `tackles` - the number of tackles
	6. `accuracy` - the accuracy of shots between 0.0-1.0
2. Create a class `TeamRunner` with a main method.
	1. In the main method, create two arrays of 8 players,one for each team. Then, use the following files to read in the information and create `Player` objects

team_1.csv
```
Name,Position,Goals,Assists,Tackles,Accuracy
Alice Johnson,Forward,12,5,3,0.78
Brian Smith,Midfielder,5,8,2,0.65
Carlos Rivera,Defender,1,2,12,0.55
David Lee,Goalkeeper,0,1,0,0.92
Ella Brown,Forward,15,7,4,0.81
Frank Miller,Defender,2,3,10,0.61
Grace Wilson,Midfielder,6,9,3,0.72
Henry Davis,Forward,10,4,2,0.69
```

team_2.csv
```
Name,Position,Goals,Assists,Tackles,Accuracy
Isabella Garcia,Forward,14,6,2,0.8
Jack Thompson,Midfielder,4,10,1,0.7
Khalid Ahmed,Defender,2,3,11,0.6
Liam White,Goalkeeper,0,2,0,0.89
Mia Martinez,Forward,18,5,3,0.85
Noah Kim,Defender,1,2,9,0.58
Olivia Chen,Midfielder,7,11,2,0.74
Peter Clark,Forward,9,3,1,0.66
```

3. Add to your main method to answer the following questions.
	1. Who is the top goal scorer on each team?
	2. Which player has the highest shooting accuracy overall (across both teams)?
	3. What is the average number of assists per player for Team 1 and Team 2?
	4. s there a forward on Team 2 who has more goals than any forward on Team 1?
	5. If you add up all goals, assists, and tackles, which team contributes more overall?
