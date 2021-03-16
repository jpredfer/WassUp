## Why use Github?

Github will make it easier for you to collaborate with your teamates. It will ensure that everyone who works from the source code stored in this repository all have the same code and every one is on the same page. You'll be able to review eachother's code, ask questions about it, or request changes.

If you choose to use this you won't have to worry about:

- Not having access to your teammates most recent functional code.
- Only having pieces of the project available to view locally on your machine.
- Manually sending pieces of code back and forth to eachother to get everyone your work, it'll all be stored here for everyone to pull down to use.

I don't know if any of you folks have used it in the past; if you haven't this might seem a little daunting at first, but I assure you it will make collaboration on your project so much easier.

## Getting ready to use git:

First, if you look above, you'll see that all of your most recent code is stored here. In order to make changes to it, you'll need to pull the code from this repository down to your machine **(NOTE: You'll only have to do this part the first time to get set up.**):

- Create a new directory on your machine (This is where your project will be found after you pull it down from GitHub)
- Using terminal/command line, cd into that directory
- From that directory, run this command: 

```
git clone https://github.com/jpredfer/WassUp.git
```

- You should see something like this:

  ![clone_success](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.42.18%20AM.png)

- Now using file explorer/finder, look in that new directory you made, and you'll see a 'WassUp' folder; this is all of the code you just pulled from github.
- Next, back in terminal/command line, cd into your new WassUp directory
- From within WassUp, run this:

```
git init
```

- You should see something like this afterward:

```
Initialized empty Git repository in /Users/michaelmeyer/Documents/Example/WassUp/.git/
```

#### That's it! You're set up and ready to use GitHub.



## What now? 

#### How do I make changes to the code?

Simple! 

- First, make sure the code on your machine is up to date with the code stored in GitHub
  - From terminal/cmd prompt, cd into your new WassUp folder
  - run: git pull

![Screen Shot 2021-03-16 at 10.59.08 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.42.40%20AM.png)

- It should say 'Already up to date.'. 
- Next, we need to 'check out' a new branch from the master branch.
  - A branch is essentially just a version of the code that you create on your machine to make your changes and test your code.
  - The master branch is the version of the code that should be functional; it's best **not to work directly from the master branch**, but to instead work on your own branch. This ensures that many people can work on the same project without breaking parts of the code that are already functional.
- Run:

```
git status
```

- Result:

  ![Screen Shot 2021-03-16 at 11.05.17 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.42.50%20AM.png)

- **Checking out a new branch:**
  - Run:

```
git checkout -b <your_branch_name>
```

- You can name your branch whatever you want, but I typically name my branches something that describes what I'll be working on in that branch.![Screen Shot 2021-03-16 at 11.08.49 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.43.02%20AM.png)

- Almost ready! All you have to do now is open your WassUp directory in your favorite editor and start making changes.

  - NOTE: **You'll want to open the whole WassUp directory in the editor, not just a specific file you intend to work on**

- Make your changes, then save the files you worked in: 

  ![Screen Shot 2021-03-16 at 11.20.48 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.43.15%20AM.png)


## Pushing your updated code to GitHub

Now that you've made changes to the code, we need to get those changes back up to github so the rest of the team has your work.

- In your terminal/cmd prompt, cd into your WassUp directory:
- Run:

```
git status
```

- git status will show you which files have been changed/added/removed so you can push these updates:

  ![Screen Shot 2021-03-16 at 11.20.48 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.43.25%20AM.png)

  - In this example, MessageMenu.java has been modified (Denoted by red text)

- Run: 

```
git add <name_of_modified_file>
```

​	and then

```
git status
```

![Screen Shot 2021-03-16 at 11.24.03 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.43.34%20AM.png)

- MessageMenu.java went from red to green, indicating that it is ready to be committed. 
- Next, run:

```
git commit -m "<Briefly describe what changes you made in this branch>"
```

![Screen Shot 2021-03-16 at 11.27.35 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.43.51%20AM.png)

- Now your changes have been committed and can be pushed to GitHub; Run:

```
git push origin <name_of_your_branch>
```

![Screen Shot 2021-03-16 at 11.29.18 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.43.51%20AM.png)

#### Done! Your branch containing your changes are now up on Github.

#### ![Screen Shot 2021-03-16 at 11.29.18 AM](https://raw.githubusercontent.com/jpredfer/WassUp/master/readme_images/Screen%20Shot%202021-03-16%20at%2011.44.00%20AM.png)

